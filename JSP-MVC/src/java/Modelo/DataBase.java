package Modelo;
/**@author Luis Angel */
public class DataBase {

    private String driver;
    private String url;
    private String usuario;
    private String contraseña;

    public DataBase() {
        this.driver = "com.mysql.jdbc.Driver";
        this.url = "jdbc:mysql://localhost/jsp_mvc_db";
        this.usuario = "root";
        this.contraseña = "";
    }
    //Getter and Setter
    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
