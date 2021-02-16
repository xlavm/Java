/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concesionario.servlet;

import com.concesionario.ejb.ClientesFacadeLocal;
import com.concesionario.entity.Clientes;
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
public class ClientesServlet extends HttpServlet {

    @EJB
    private ClientesFacadeLocal clientesFacade;



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
            
            if ("vistaCliente".equals(action)){
                List<Clientes> findAll = clientesFacade.findAll();
                request.getSession().setAttribute("clientes", findAll);
                url = "vistaClientes.jsp"; 
                
            }else if ("login".equals(action)){
                String u = request.getParameter("username");
                String p = request.getParameter("password");
                boolean checklogin = clientesFacade.checkLogin(u, p);
                if(checklogin){
                    request.getSession().setAttribute("login", u);
                    url="index.jsp";
                }else{
                    url = "login.jsp?error=1";
                }
                
            }else if("agregar".equals(action)){
                Clientes c = new Clientes();
                c.setUsername(request.getParameter("username"));
                c.setPassword(request.getParameter("password"));
                c.setDoc(request.getParameter("doc"));
                c.setNombreCompleto(request.getParameter("nombre"));
                c.setTelefono(request.getParameter("telefono"));
                clientesFacade.create(c);
                url = "index.jsp";
                
            }else if("editar".equals(action)){
                 Clientes c = new Clientes();
                c.setUsername(request.getParameter("username"));
                c.setPassword(request.getParameter("password"));
                c.setDoc(request.getParameter("doc"));
                c.setNombreCompleto(request.getParameter("nombre"));
                c.setTelefono(request.getParameter("telefono"));
                clientesFacade.edit(c);
                url = "ClientesServlet?action=vistaCliente";
            
            }else if("eliminar".equals(action)){
                String doc = request.getParameter("doc");
                Clientes c = clientesFacade.find(doc);
                clientesFacade.remove(c);
                url = "ClientesServlet?action=vistaCliente";
            
            }else if("logout".equals(action)){
                request.getSession().removeAttribute("login");
                url = "login.jsp";
            }
            
            
            response.sendRedirect(url);
        }finally {
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
