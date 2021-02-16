/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concesionario.servlet;

import com.concesionario.ejb.VehiculosFacadeLocal;
import com.concesionario.entity.Vehiculos;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Luis Angel
 */
public class VehiculosServlet extends HttpServlet {

    @EJB
    private VehiculosFacadeLocal vehiculosFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String action = request.getParameter("action");
            String url = "index.jsp";

            if ("vistaVehiculo".equals(action)) {
                List<Vehiculos> findAll = vehiculosFacade.findAll();
                request.getSession().setAttribute("vehiculos", findAll);
                url = "vistaVehiculos.jsp";

            } else if ("agregar".equals(action)) {
                Vehiculos c = new Vehiculos();
                c.setMat(request.getParameter("mat"));
                c.setMarca(request.getParameter("marca"));
                c.setModelo(request.getParameter("modelo"));
                c.setValor(request.getParameter("valor"));
                c.setFoto(request.getParameter("foto").getBytes());                
                vehiculosFacade.create(c);
                //llama al mismo formulario, manteniendo sus datos
                request.getRequestDispatcher("/registroVehiculos.jsp?accion=editar").forward(request, response);

            } else if ("editar".equals(action)) {
                Vehiculos c = new Vehiculos();
                c.setMat(request.getParameter("mat"));
                c.setMarca(request.getParameter("marca"));
                c.setModelo(request.getParameter("modelo"));
                c.setValor(request.getParameter("valor"));
                c.setFoto(request.getParameter("foto").getBytes());
                vehiculosFacade.edit(c);
                //llama al mismo formulario, manteniendo sus datos
                request.getRequestDispatcher("/registroVehiculos.jsp?accion=editar").forward(request, response);

            } else if ("eliminar".equals(action)) {
                String mat = request.getParameter("mat");
                Vehiculos c = vehiculosFacade.find(mat);
                vehiculosFacade.remove(c);
                url = "VehiculosServlet?action=vistaVehiculo";

            } else if ("buscar".equals(action)) {
                String mat = request.getParameter("busqueda");
                List<Vehiculos> findAll = vehiculosFacade.findAll();
                request.getSession().setAttribute("vehiculos", findAll);
                request.getSession().setAttribute("parametro", mat);
                url = "resultadoBusquador.jsp";

            } else if ("cargarVehiculos".equals(action)) {
                List<Vehiculos> findAll = vehiculosFacade.findAll();
                request.getSession().setAttribute("vehiculos", findAll);
                url = "index.jsp";

            }

            response.sendRedirect(url);
            
        } finally {
            out.close();
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
