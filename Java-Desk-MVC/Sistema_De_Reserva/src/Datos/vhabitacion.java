package Datos;
/*** @author Luis Angel*/
/* esta es una clase persistente que nos permitirá formar los objetos  que 
serán almacenados
 */
public class vhabitacion {
    private int id_habitacion;
    private String numero;
    private String piso;
    private String descripcion;
    private String caracteristicas;
    private double precio_diario;
    private String estado;
    private String tipo_habitacion;
    //constructor 
    public vhabitacion(int id_habitacion, String numero, String piso, String 
    descripcion, String caracteristicas, double precio_diario, String estado, 
    String tipo_habitacion) {
        this.id_habitacion = id_habitacion;
        this.numero = numero;
        this.piso = piso;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.precio_diario = precio_diario;
        this.estado = estado;
        this.tipo_habitacion = tipo_habitacion;
    }
    //constructor vacio
    public vhabitacion() {
    }
    //getter and setter
    public int getId_habitacion() {
        return id_habitacion;
    }
    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getPiso() {
        return piso;
    }
    public void setPiso(String piso) {
        this.piso = piso;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getCaracteristicas() {
        return caracteristicas;
    }
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    public double getPrecio_diario() {
        return precio_diario;
    }
    public void setPrecio_diario(double precio_diario) {
        this.precio_diario = precio_diario;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTipo_habitacion() {
        return tipo_habitacion;
    }
    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    } 
}
