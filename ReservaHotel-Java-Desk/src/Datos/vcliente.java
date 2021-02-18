package Datos;
/*** @author Luis Angel*/
/* esta clase hereda todos los atributos y metodos de la clase persona
sin embargo se le añade el atributo codio_cliente porque sería su dato adicional
*/
public class vcliente extends vpersona{
    private String codigo_cliente;

    public vcliente() {
    }
    
    public vcliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }
    
    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }
    
}
