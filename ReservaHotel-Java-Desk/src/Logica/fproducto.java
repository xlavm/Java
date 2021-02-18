package Logica;
import Datos.vhabitacion;
import Datos.vproducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*** @author Luis Angel*/
public class fproducto {
    private conexion mysql=new conexion();//creamos una instancia a la cadena de conexion
    private Connection cn=mysql.conectar();//llamamos la funcion conectar 
    private String sSQL="";//variable donde se almacenará la cadena de conexion
    public int totalregistros;//variable que cuenta el total de registro que tiene
    /*metodo para mostrar los registros de la tabla habitacion 
    */
    public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo ;
       String [] titulos = {"ID", "Producto", "Descripción", "Unidad de Medida", "Precio"};
       String [] registro = new String [5];//vector que contendrá los registros
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);/*le llevamos los titulos al
       modelo
       */
       
       /* la siguiente linea es la instrucion que obtendrá todos los registros 
       de la habitacion (consulta sql)
       */
       sSQL = "select * from producto where nombre like '%"+ buscar +"%' order by idproducto desc";
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
                registro[0]=rs.getString("idproducto");
                registro[1]=rs.getString("nombre");
                registro[2]=rs.getString("descripcion");
                registro[3]=rs.getString("unidad_medida");
                registro[4]=rs.getString("precio_venta");
                totalregistros ++;
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
    public boolean insertar (vproducto dts){
         sSQL="insert into producto (nombre, descripcion, unidad_medida, precio_venta) values (?,?,?,?)";
           
        try {
           PreparedStatement pst=cn.prepareCall(sSQL);
           pst.setString(1, dts.getNombre());
           pst.setString(2, dts.getDescripcion());
           pst.setString(3, dts.getUnidad_medida());
           pst.setDouble(4, dts.getPrecio());
           int n=pst.executeUpdate();/*esta variable almacenará el resultado de
           ejecucion del statement
           */
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
    /* metodo para editar datos de la tabla habitaciones de la base de datos
    */
     public boolean editar (vproducto dts){
         sSQL="update producto set nombre=?, descripcion=?, unidad_medida=?, precio_venta=? where idproducto=?";
        try {
           PreparedStatement pst=cn.prepareCall(sSQL);
           pst.setString(1, dts.getNombre());
           pst.setString(2, dts.getDescripcion());
           pst.setString(3, dts.getUnidad_medida());
           pst.setDouble(4, dts.getPrecio());
           pst.setInt(5, dts.getIdproducto());
           int n=pst.executeUpdate();/*esta variable almacenará el resultado de
           ejecucion del statement
           */
           /*condicion si se cumple o no la  actualizacion de registros 
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
    /* metodo que elimina datos de la tabla habitacion de la base de datos
     */ 
    public boolean eliminar(vproducto dts){
         sSQL="delete from producto where idproducto=?";
        try {
           PreparedStatement pst=cn.prepareCall(sSQL);
           pst.setInt(1, dts.getIdproducto());
           int n=pst.executeUpdate();/*esta variable almacenará el resultado de
           ejecucion del statement
           */
           /*condicion si se cumple o no la  actualizacion de registros 
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
