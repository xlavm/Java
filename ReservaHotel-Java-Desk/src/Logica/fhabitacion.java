package Logica;
import Datos.vhabitacion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*** @author Luis Angel*/
public class fhabitacion {
    private conexion mysql=new conexion();//creamos una instancia a la cadena de conexion
    private Connection cn=mysql.conectar();//llamamos al metodo conectar de la clase conexion
    private String sSQL="";//variable donde se almacenará la cadena de conexion
    public int totalregistros;//variable que cuenta el total de registro que tiene la consulta
    /*metodo para mostrar los registros de la tabla habitacion 
    */
    public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo ;
       //vector que contendrá los cabezales de la tabla
       String [] titulos = {"ID", "Número", "Piso", "Descripción",
       "Caracteristicas", "Precio", "Estado", "Tipo Habitacion"};
       String [] registro = new String [8];//vector que contendrá los registros
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);/*le llevamos los titulos al modelo*/
       
       /* la siguiente linea es la instrucion que obtendrá todos los registros 
       de la habitacion (consulta sql)
       */
       sSQL = "select * from habitacion where piso like '%"+ buscar +"%' "
       + "order by idhabitacion";
        try {
            Statement st = cn.createStatement();//declara la conexion
            ResultSet rs = st.executeQuery(sSQL);//ejecuta la consulta
            /* vamos a recorrer uno a uno cada registro obtenido al ejecutar 
            la consulta
            */
            while(rs.next()){//recorre rs (resultado)
                /*almacenamos uno a uno en el vector registro, todos los 
                registros consultados en la base de datos.
                ponemos el campo tal y como esta en la bd
                */
                registro[0]=rs.getString("idhabitacion");
                registro[1]=rs.getString("numero");
                registro[2]=rs.getString("piso");
                registro[3]=rs.getString("descripcion");
                registro[4]=rs.getString("caracteristicas");
                registro[5]=rs.getString("precio_diario");
                registro[6]=rs.getString("estado");
                registro[7]=rs.getString("tipo_habitacion");
                totalregistros ++;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    /* metodo que es invocado desde el formulario vistahabitacion y que retorna el resultado de la busqueda
    empleada en dicho formulario*/
    public DefaultTableModel mostrarvista(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Número","Piso","Descripción","Caracteristicas","Precio","Estado","Tipo habitación"};
       String [] registro =new String [8];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from habitacion where piso like '%"+ buscar + "%' and estado='Disponible' order by idhabitacion";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           while(rs.next()){
               registro [0]=rs.getString("idhabitacion");
               registro [1]=rs.getString("numero");
               registro [2]=rs.getString("piso");
               registro [3]=rs.getString("descripcion");
               registro [4]=rs.getString("caracteristicas");
               registro [5]=rs.getString("precio_diario");
               registro [6]=rs.getString("estado");
               registro [7]=rs.getString("tipo_habitacion");
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);  
           }
           return modelo;
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
     } 
    /* metodo para insertar datos a la tabla habitaciones de la base de datos
    */
    public boolean insertar (vhabitacion dts){
        //consulta sql de inserción de datos
         sSQL="insert into habitacion (numero, piso, descripcion, "
         + "caracteristicas, precio_diario, estado, tipo_habitacion) "
         + "values (?,?,?,?,?,?,?)";
           
        try {
            //se almacena en el pst la consulta
           PreparedStatement pst=cn.prepareCall(sSQL);
           /*al pst se le almacena los valores de acuerdo al indice (indice de acuerdo
           con los ?,?,?) en su mismo orden */
           pst.setString(1, dts.getNumero());
           pst.setString(2, dts.getPiso());
           pst.setString(3, dts.getDescripcion());
           pst.setString(4, dts.getCaracteristicas());
           pst.setDouble(5, dts.getPrecio_diario());
           pst.setString(6, dts.getEstado());
           pst.setString(7, dts.getTipo_habitacion());
           int n=pst.executeUpdate();/*el executeUpdate ejecuta la consulta y la 
           variable n almacenará el resultado de ejecucion del statement */
           
           /*condicion si se cumple o no la  insercion de registros 
           en la tabla habitaciones
           */
           if(n!=0){//cuando es cero, quiere decir que no se ejecuto ni 1 consulta
               return true;
           }else{
               return false;
           }
        } catch (Exception e) {
            JOptionPane.showInputDialog(null, e);
            return false;
        }
    }
    /* metodo para editar datos de la tabla habitaciones de la base de datos
    */
     public boolean editar (vhabitacion dts){
         //consulta sql de inserción de datos
         sSQL="update habitacion set numero=?, piso=?, descripcion=?, "
         + "caracteristicas=?, precio_diario=?, estado=?, tipo_habitacion=? "
         + "where idhabitacion=?";
        try {
             //se almacena en el pst la consulta
           PreparedStatement pst=cn.prepareCall(sSQL);
           /*al pst se le almacena los valores de acuerdo al indice (indice de acuerdo
           con los ?,?,?) en su mismo orden */
           pst.setString(1, dts.getNumero());
           pst.setString(2, dts.getPiso());
           pst.setString(3, dts.getDescripcion());
           pst.setString(4, dts.getCaracteristicas());
           pst.setDouble(5, dts.getPrecio_diario());
           pst.setString(6, dts.getEstado());
           pst.setString(7, dts.getTipo_habitacion());
           pst.setInt(8, dts.getId_habitacion());
           int n=pst.executeUpdate();/*el executeUpdate ejecuta la consulta y la 
           variable n almacenará el resultado de ejecucion del statement */
           
           /*condicion si se cumple o no la  insercion de registros 
           en la tabla habitaciones
           */
           if(n!=0){//cuando es cero, quiere decir que no se ejecuto ni 1 consulta
               return true;
           }else{
               return false;
           }
        } catch (Exception e) {
            JOptionPane.showInputDialog(null, e);
            return false;
        }
    }
    /* metodo que actualiza el estado de una habitacion, poniendola como Disponible*/
    public boolean desocupar (vhabitacion dts){
       sSQL="update habitacion set estado='Disponible'"+
               " where idhabitacion=?";
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getId_habitacion());
           
           int n=pst.executeUpdate();
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
  /* metodo que actualiza el estado de una habitacion, poniendola como ocupado*/
   public boolean ocupar (vhabitacion dts){
       sSQL="update habitacion set estado='Ocupado'"+
               " where idhabitacion=?";
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getId_habitacion());
           
           int n=pst.executeUpdate();
           if (n!=0){
               return true;
           }
           else {
               return false;
           } 
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
    } 
    /* metodo que elimina datos de la tabla habitacion de la base de datos
     */ 
    public boolean eliminar(vhabitacion dts){
        //consulta sql de inserción de datos 
        sSQL="delete from habitacion where idhabitacion=?";
        try {
            //se almacena en el pst la consulta
           PreparedStatement pst=cn.prepareCall(sSQL);
           /*al pst se le almacena los valores de acuerdo al indice (indice de acuerdo
           con los ?,?,?) en su mismo orden */
           pst.setInt(1, dts.getId_habitacion());
           int n=pst.executeUpdate();/*el executeUpdate ejecuta la consulta y la 
           variable n almacenará el resultado de ejecucion del statement */
           
           /*condicion si se cumple o no la  insercion de registros 
           en la tabla habitaciones
           */
           if(n!=0){
               return true;
           }else{
               return false;
           }
        } catch (Exception e) {
            JOptionPane.showInputDialog(null, e);
            return false;
        }
    }
}
