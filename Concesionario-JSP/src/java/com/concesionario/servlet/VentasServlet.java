/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concesionario.servlet;

import com.concesionario.ejb.ClientesFacadeLocal;
import com.concesionario.ejb.VehiculosFacadeLocal;
import com.concesionario.ejb.VentasFacadeLocal;
import com.concesionario.entity.Clientes;
import com.concesionario.entity.Vehiculos;
import com.concesionario.entity.Ventas;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Luis Angel
 */
public class VentasServlet extends HttpServlet {

    @EJB
    private VehiculosFacadeLocal vehiculosFacade;

    @EJB
    private ClientesFacadeLocal clientesFacade;

    @EJB
    private VentasFacadeLocal ventasFacade;

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

            if ("vistaVenta".equals(action)) {
                List<Ventas> findAll = ventasFacade.findAll();
                request.getSession().setAttribute("ventas", findAll);
                url = "vistaVentas.jsp";

            } else if ("comprar".equals(action)) {
                Ventas v = new Ventas();
                Clientes c = clientesFacade.find(request.getParameter("doc"));
                Vehiculos veh = vehiculosFacade.find(request.getParameter("mat"));

                if (c != null) {
                    v.setMat(veh);
                    v.setDoc(c);
                    v.setCantidad(Integer.parseInt(request.getParameter("cantidad")));
                    v.setValor((Integer.parseInt(request.getParameter("cantidad"))) * (Integer.parseInt(request.getParameter("valor"))));
                    ventasFacade.create(v);
                }
                url = "index.jsp";

            } else if ("editarCompra".equals(action)) {
                Ventas v = new Ventas();
                Clientes c = clientesFacade.find(request.getParameter("doc"));
                Vehiculos veh = vehiculosFacade.find(request.getParameter("mat"));

                if (c != null) {
                    v.setMat(veh);
                    v.setDoc(c);
                    v.setCantidad(Integer.parseInt(request.getParameter("cantidad")));
                    v.setValor((Integer.parseInt(request.getParameter("cantidad"))) * Integer.parseInt(veh.getValor()));
                    ventasFacade.edit(v);
                }
                url = "VentasServlet?action=vistaVenta";

            } else if ("eliminar".equals(action)) {
                int id = Integer.parseInt(request.getParameter("id"));
                Ventas v = ventasFacade.find(id);
                ventasFacade.remove(v);
                url = "VentasServlet?action=vistaVenta";
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
