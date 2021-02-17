<%-- 
    Document   : getImage
    Created on : 15-ago-2018, 21:23:57
    Author     : Luis Angel
--%>

<%@page import="java.sql.Blob"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
String mat = request.getParameter("mat");
 
String connectionURL = "jdbc:mysql://localhost:3306/dbconcesionario";
String user = "root";
String pass = "";
 
Connection con = null;
 
try{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection(connectionURL, user, pass);
    
    PreparedStatement ps = con.prepareStatement("select * from vehiculos where mat=?");
    ps.setString(1, mat);
    ResultSet rs = ps.executeQuery();
 
    if(rs.next()){
        Blob blob = rs.getBlob("foto");
        byte byteArray[] = blob.getBytes(1, (int)blob.length());
 
        response.setContentType("image/gif");
        //clase que representa un flujo de bytes 
        OutputStream os = response.getOutputStream();
        //escribe el flujo de bytes del arreglo en pantalla
        os.write(byteArray);
        os.flush();
        os.close();
    }
}
catch(Exception e){
    e.printStackTrace();
}   
finally{
    if(con != null){
        try{
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
%>
