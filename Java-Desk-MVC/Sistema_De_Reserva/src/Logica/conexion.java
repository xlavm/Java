package Logica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/* @author Luis Angel */
public class conexion {
    public String db="basereserva";//nombre de la base de datos 
    public String url="jdbc:mysql://127.0.0.1/" +db;/*en esta dirección puede ir la ip
    o el nombre del servidor que es localhost o si estamos en red, le indicamos la ip
    de la computadora que contiene el servidor*/
    public String user="root";//usuario de nuestro administrador de bd
    public String pass="";//la contraseña del administrador de bd

    public conexion() {
    }
    
    public Connection conectar(){
        Connection link=null;//variable que hace instancia a la clase conecction
        try {
            /*cargamos el driver de la conexion jdbc */
            Class.forName("org.gjt.mm.mysql.Driver");
            /*para obtener la ruta que va en forName(), ampliamos nuestro 
            mysql-connectr-java-5.1.45 que se encuentra en Libraries y nos vamos
            al final en org.gjt.mm.mysql la ruta sería: org.gjt.mm.mysql.Driver*/
            
            /*le decimos a la variable
            link que cree un enlace hacia la base de datos*/
            link=DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;//al final se debe de devolver la cadena de conexion
    }
}

