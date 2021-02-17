package Modelo;
import java.util.List;
/**@author Luis Angel*/
public interface Operaciones {
    
    public String insertar(Object obj);
    public String eliminar(Object obj);
    public String modificar(Object obj);
    public List<?> consultar();
    public List<?> filtrar(String campo, String criterio);
}
