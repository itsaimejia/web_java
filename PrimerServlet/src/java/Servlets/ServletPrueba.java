
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import conexion.UsuariosAcciones;
import conexion.ClaseConexion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import usuarios.Usuario;

import static java.lang.System.out;

public class ServletPrueba extends HttpServlet {
    @Override 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String nombre=request.getParameter("nombre");
        String apaterno=request.getParameter("apaterno");
        String amaterno=request.getParameter("amaterno");
        String correo=request.getParameter("correo");
        String username=request.getParameter("username");
        String password = request.getParameter("password");
        
        
        Usuario user = new Usuario();
        user.setNombre(nombre);
        user.setAmaterno(amaterno);
        user.setApaterno(apaterno);
        user.setUsername(username);
        user.setPassword(password);
        user.setCorreo(correo);
        
        System.out.println(user.toString());
        
        ClaseConexion con = new ClaseConexion();
        UsuariosAcciones accion = new UsuariosAcciones(con);
        
        System.out.println(request.getParameter("btnGuardar"));
        System.out.println(request.getParameter("btnEliminar"));
        System.out.println(request.getParameter("btnConsultar"));
        //--------------------------------------------------------
        if(request.getParameter("btnGuardar") != null){
            boolean guardado = accion.insert(user);
            if(guardado){
                response.setContentType("text/html");
                PrintWriter printWriter = response.getWriter();
                    printWriter.print("<html>");
                    printWriter.print("<body>");
                    printWriter.print("<h1>Guardado</h1>");
                    printWriter.print("<p> Nombre : " + nombre + "</p>");
                    printWriter.print("<p> Apellido paterno : " + apaterno + "</p>");
                    printWriter.print("<p> Apellido materno : " + amaterno + "</p>");
                    printWriter.print("</body>");
                    printWriter.print("</html>");
                    printWriter.close();
            }else{
                response.setContentType("text/html");
                PrintWriter printWriter = response.getWriter();
                    printWriter.print("<html>");
                    printWriter.print("<body>");
                    printWriter.print("<h1>Hubo un error</h1>");
                    printWriter.print("<p> Error </p>");
                    printWriter.print("</body>");
                    printWriter.print("</html>");
                    printWriter.close();
            }
        }
        //------------------------------------------------------------------
        if(request.getParameter("btnConsultar") != null){
            Usuario actual = accion.select(nombre);
            System.out.println(actual);
            if(actual.getNombre() != null){
                response.setContentType("text/html");
                PrintWriter printWriter = response.getWriter();
                    printWriter.print("<html>");
                    printWriter.print("<body>");
                    printWriter.print("<h1>Usuario encontrado: </h1>");
                    printWriter.print(" <form action=\"servlet_uno\" name=\"formulario\" method=\"post\">");
                    printWriter.print("<table>");
                    printWriter.print("<tr>");
                    printWriter.print("<td>Nombre</td>");
                    printWriter.print("<td><input name=\"user\" value=\""+actual.getNombre()+"\"/></td>");
                    printWriter.print("</tr>");
                    printWriter.print("<tr>");
                    printWriter.print("<td>Apellido paterno</td>");
                    printWriter.print("<td><input name=\"apaterno\" value=\""+actual.getApaterno()+"\" /></td>");
                    printWriter.print("</tr>");
                    printWriter.print("<tr>");
                    printWriter.print("<td>Apellido materno</td>");
                    printWriter.print("<td><input name=\"amaterno\" value=\""+actual.getAmaterno()+"\" /></td>");
                    printWriter.print("</tr>");
                    printWriter.print("</table>");
                    printWriter.print("<input type=\"submit\"  value=\"Guardar cambios\"  name=\"btnUpdate\"/>");
                    printWriter.print("</body>");
                    printWriter.print("</html>");
                    printWriter.close();
            
            }else{
                response.setContentType("text/html");
                PrintWriter printWriter = response.getWriter();
                    printWriter.print("<html>");
                    printWriter.print("<body>");
                    printWriter.print("<h1>Hubo un error</h1>");
                    printWriter.print("<p> No existe el usuario</p>");
                    printWriter.print("</body>");
                    printWriter.print("</html>");
                    printWriter.close();
            }
        }
        //--------------------------------------------------
        if(request.getParameter("btnEliminar") != null){
            boolean borrado = accion.delete(nombre);
            System.out.println("borrado en serv: "+borrado);
            if(borrado==true){
                System.out.println("por que no entra aquiiiiiiii");
                response.setContentType("text/html");
                PrintWriter printWriter = response.getWriter();
                    printWriter.print("<html>");
                    printWriter.print("<body>");
                    printWriter.print("<h1>Eliminado</h1>");
                    printWriter.print("<p> Nombre : " + nombre + "</p>");
                    printWriter.print("</body>");
                    printWriter.print("</html>");
                    printWriter.close();
            }else{
                response.setContentType("text/html");
                PrintWriter printWriter = response.getWriter();
                    printWriter.print("<html>");
                    printWriter.print("<body>");
                    printWriter.print("<h1>Hubo un error</h1>");
                    printWriter.print("<p> No existe el usuario</p>");
                    printWriter.print("</body>");
                    printWriter.print("</html>");
                    printWriter.close();
            }
        }
        //---------------------------------------------------
        
        if(request.getParameter("btnUpdate") != null){
            boolean guardado = accion.update(user);
            
            if(guardado){
                response.setContentType("text/html");
                PrintWriter printWriter = response.getWriter();
                    printWriter.print("<html>");
                    printWriter.print("<body>");
                    printWriter.print("<h1>Cambios guardados</h1>");
                    printWriter.print("<p> Nombre : " + nombre + "</p>");
                    printWriter.print("<p> Apellido paterno : " + apaterno + "</p>");
                    printWriter.print("<p> Apellido materno : " + amaterno + "</p>");
                    printWriter.print("</body>");
                    printWriter.print("</html>");
                    printWriter.close();
            }else{
                response.setContentType("text/html");
                PrintWriter printWriter = response.getWriter();
                    printWriter.print("<html>");
                    printWriter.print("<body>");
                    printWriter.print("<h1>Hubo un error</h1>");
                    printWriter.print("<p> Error </p>");
                    printWriter.print("</body>");
                    printWriter.print("</html>");
                    printWriter.close();
            }
        }
    }   
}
