/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import conexion.ClaseConexion;
import conexion.UsuariosAcciones;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import usuarios.Usuario;

/**
 *
 * @author itsai
 */
public class NavbarController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd;
        
        if(request.getParameter("btnInicio")!= null){
            request.getRequestDispatcher("admin.jsp").forward(request,response);
        }
        if(request.getParameter("btnIrLogin")!= null){
            rd=request.getRequestDispatcher("login.jsp");
            rd.forward(request,response);
        }
        if(request.getParameter("btnIrRegistro")!= null){
            rd=request.getRequestDispatcher("registro.jsp");
            rd.forward(request,response);
        }
        if(request.getParameter("btnTablaUsuarios") !=null){
            request.getRequestDispatcher("tabla.jsp").forward(request,response);
            
        }
    }

    

}
