/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import Utilitis.Connector;
import Utilitis.Security;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mendezgonzalez.9
 */
public class ControladorUsers extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     Connector connector;
    Security seguro;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws SQLException{
        String usuario;
        String Contraseña;
        String Correo;
       if(request.getParameter("action").equals("Registro")){
        try{
        usuario = request.getParameter("TxtRegUname");
        Contraseña = request.getParameter("TxtRegPword");
        Correo = request.getParameter("TxtRegEmail");
         seguro=Security.getInstance(usuario, Contraseña);
         Contraseña =seguro.encrypt(Contraseña, "0");
         connector = Connector.getConnection(usuario, Contraseña);
         connector.Register(usuario, Contraseña,Correo);
           response.sendRedirect("index.jsp");
        }catch(Exception ex){
          System.out.print(ex.getMessage());
            
        }
           
    }
       if(request.getParameter("action").equals("Login")){
        try{
        usuario = request.getParameter("TxtLogUname");
        Contraseña = request.getParameter("TxtLogPword");
        
         seguro=Security.getInstance(usuario, Contraseña);
         Contraseña =seguro.encrypt(Contraseña, "0");
         connector = Connector.getConnection(usuario, Contraseña);
         if(connector.Authenicate(usuario,Contraseña)==true){
           response.sendRedirect("index.jsp");
         }else{
            throw new SQLException();
         }
        }catch(Exception ex){
          System.out.print(ex.getMessage());
            
        }
           
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
        try{
        processRequest(request, response);
        }catch(Exception ex){
            System.out.print(ex.getMessage());
        }
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
        try{
        processRequest(request, response);
                }catch(Exception ex){
            System.out.print(ex.getMessage());
        }
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
