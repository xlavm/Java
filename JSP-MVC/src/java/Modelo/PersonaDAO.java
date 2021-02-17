package Modelo;
import java.util.*;
import java.sql.*;
import Entidad.PersonaDTO;
/**@author Luis Angel*/
public class PersonaDAO implements Operaciones {

    DataBase db = new DataBase();

    @Override
    public String insertar(Object obj) {
        //hacemos un casting para traducir el parametro de tipo objeto a tipo persona
        PersonaDTO p = (PersonaDTO) obj;

        //para conectarme a mysql necesito:
        Connection conn;
        PreparedStatement pst;
        //creamos una sentencia preparada de tipo sql para la consulta
        //la sentencia preparada evita inyección de codigo, los valores van en incognito
        String sentenciaSql = "insert into persona values (?,?,?,?)";
        String respuesta="";
        //nos conectamos a la base de datos 
        try {
            //cargamos el driver
            Class.forName(db.getDriver());
            conn = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContraseña());
            //preparamos la consulta
            pst = conn.prepareStatement(sentenciaSql);
            //establecemos los valores de las incognitas de la consulta
            pst.setInt(1, p.getId());//el 1 equivale al primer ?
            pst.setString(2, p.getNombres());
            pst.setString(3, p.getApellidos());
            pst.setInt(4, p.getEdad());
            //ejecutamos la consulta
            //el update es para inserciones, modificaciones y eliminaciones
            //para consultas select, se hace executeQuery
            int filas = pst.executeUpdate();
            respuesta="se registraron: "+filas+" elementos";
            //cerramos la conexion
            conn.close();
        } catch (Exception e) {   
        }
        return respuesta;
    }

    @Override
    public String eliminar(Object obj) {
        return null;
    }
    @Override
    public String modificar(Object obj) {
        return null;
    }
    @Override
    public List<PersonaDTO> consultar() {
        List<PersonaDTO> datos = new ArrayList<>();
        //para conectarme a mysql necesito:
        Connection conn;
        PreparedStatement pst;
        //variable que recupera los datos que retorna la consulta
        ResultSet rs;
        //creamos una sentencia preparada de tipo sql para la consulta
        //la sentencia preparada evita inyección de codigo, los valores van en incognito
        String sentenciaSql = "select * from persona";
        //nos conectamos a la base de datos 
        try {
             //cargamos el driver
            Class.forName(db.getDriver());
            conn = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContraseña());
            //preparamos la consulta
            pst = conn.prepareStatement(sentenciaSql);
            //ejecutamos la consulta y guardamos los resultados en el rs
            rs = pst.executeQuery();
            //hacemos un recorrido en el rs y llenamos la List datos
            while(rs.next()){
                //rs.getInt("nombre_columna_en_bd")
                datos.add(new PersonaDTO(rs.getInt("id"), rs.getString("nombres"), rs.getString("apellidos"), rs.getInt("edad")));
            }
            conn.close();
        } catch (Exception e) {
        }
        return datos;
    }
    
    @Override
    public List<?> filtrar(String campo, String criterio) {
        return null;
    }
}
