package Controlador;

import Entidad.PersonaDTO;
import Modelo.PersonaDAO;
import java.io.*;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**@author Luis Angel*/
@WebServlet(name = "PersonaServlet", urlPatterns = {"/PersonaServlet"})
public class PersonaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //creamos instancias de las variables a utilizar
            PersonaDAO dao = new PersonaDAO();
            PersonaDTO dto = new PersonaDTO();
            List<PersonaDTO> datos = new ArrayList<>();
            
            String respuesta = "";
            //se encarga de despachar las solicitudes que llegan al servlet
            RequestDispatcher rd = null;
            
            try {
                //validamos si se le ha dado clic al boton insertar
                if(request.getParameter("btninsertar")!= null){
                    //agregamos los valores de la vista al objeto dto
                    dto.setId(Integer.parseInt(request.getParameter("txtid")));
                    dto.setNombres(request.getParameter("txtnombres"));
                    dto.setApellidos(request.getParameter("txtapellidos"));
                    dto.setEdad(Integer.parseInt(request.getParameter("txtedad")));
                    //insertamos en la bd el obj dto a través del obj dao
                    respuesta= dao.insertar(dto);
                    //mandamos la respuesta a la vista
                    request.setAttribute("respuesta", respuesta);
                }
                
                //por ultimo vamos a despachar o mostrar la pagina deseada,
                //en este caso la index.jsp para que se vean los datos previamente modificados
                rd= request.getRequestDispatcher("index.jsp");
            } catch (Exception e) {
            }
            //ejecutamos la respuesta
            rd.forward(request, response);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
