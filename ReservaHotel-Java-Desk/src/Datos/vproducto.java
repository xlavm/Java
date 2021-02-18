package Datos;
/*** @author Luis Angel*/
public class vproducto {
    private int idproducto;
    private String nombre;
    private String descripcion;
    private String unidad_medida;
    private Double precio;
    //constructor vacio
    public vproducto() {
    }
    //constructor
    public vproducto(int idproducto, String nombre, String descripcion, String unidad_medida, Double precio) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidad_medida = unidad_medida;
        this.precio = precio;
    }
    //setter and getter
    public int getIdproducto() {
        return idproducto;
    }
    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getUnidad_medida() {
        return unidad_medida;
    }
    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
