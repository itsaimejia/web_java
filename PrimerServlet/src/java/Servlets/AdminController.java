/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import conexion.ValidacionSesion;
import conexion.ClaseConexion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import usuarios.Usuario;

/**
 *
 * @author itsai
 */
public class AdminController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String userParam=request.getParameter("user");
            String passParam=request.getParameter("pass");
            System.out.print(userParam);
            System.out.print(passParam);
            String msg="";
            HttpSession sesion=request.getSession();
            ClaseConexion con=new ClaseConexion();
            ValidacionSesion usercon=new ValidacionSesion(con);
            Usuario usuario=usercon.login(userParam, passParam);
            con.disconnect();
            RequestDispatcher rd;
            System.out.println("login "+request.getParameter("btnLogin"));
            System.out.println("registrar "+request.getParameter("btnRegistrar"));
            
            
            if(request.getParameter("btnIrRegistro")!= null){
                rd=request.getRequestDispatcher("/registro.jsp");
                rd.forward(request,response);
            }
            
            if(request.getParameter("btnLogin")!= null){
                if(usuario.getUsername()!= null){
                    sesion.setAttribute("usuario",usuario);
                    request.setAttribute("labelNombre", usuario.getNombre());
                    request.setAttribute("labelPaterno", usuario.getApaterno());
                    request.setAttribute("labelMaterno", usuario.getAmaterno());
                    rd=request.getRequestDispatcher("admin.jsp");
                    rd.forward(request,response);
                }else{
                    msg="Usuario y/o password incorrectos";
                    request.setAttribute("message", msg);
                    rd=request.getRequestDispatcher("/index.jsp");
                    rd.forward(request,response);
                }
            }
    }
}
