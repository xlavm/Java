<%-- 
    Document   : VistaPersona
    Created on : 24-jun-2018, 17:17:28
    Author     : Luis Angel
--%>
<%-- 
como directiva de pagina ponemos:
las importaciones de los paquetes y clases a utilizar.
--%>
<%@page import ="Modelo.PersonaDAO"%>
<%@page import ="java.util.*"%>
<%@page import ="Entidad.PersonaDTO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>vista persona</title>
    </head>
    <%//lo que esta dentro de estas llaves son codigo JSP o JAVA
        //declaramos el dao para realizar directamente algun tipo de operacion 
        PersonaDAO dao = new PersonaDAO();
        List<PersonaDTO> datos = new ArrayList<>();
    %>
    <body>
        <form name="formPersona" method="POST" action="PersonaServlet">
            ID persona <input type="text" name="txtid" ><br>
            Nombres <input type="text" name="txtnombres" ><br>
            Apellidos <input type="text" name="txtapellidos" ><br>
            Edad <input type="text" name="txtedad" ><br>
            <input type="submit" name="btninsertar" value="insertar">
            <input type="submit" name="btnmodificar" value="modificar">
            <input type="submit" name="btneliminar" value="eliminar">
        </form>
        
        <table border="lpx">
            <tr>
                <td>ID</td>  <td>NOMBRES</td>  <td>APELLIDOS</td>  <td>EDAD</td>
            </tr>
                <%
                //hace un recorrido sobre el resultado de la consulta y muestra los datos
                datos = dao.consultar();
                for (PersonaDTO p : datos){
                %>
                <tr>
                    <td><%= p.getId()%>        </td>
                    <td><%= p.getNombres()%>   </td>
                    <td><%= p.getApellidos()%> </td>
                    <td><%= p.getEdad()%>      </td>
                </tr>
                <%
                }
                %>
        </table>
    </body>
</html>
