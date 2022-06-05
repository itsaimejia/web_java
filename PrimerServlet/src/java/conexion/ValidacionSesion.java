/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import usuarios.Usuario;

/**
 *
 * @author itsai
 */
public class ValidacionSesion {
    ClaseConexion con;
    
    public ValidacionSesion(ClaseConexion con)
    {
        this.con=con;
    }
    
    public Usuario login(String user, String pass)
    {
        try{
            String sql="select * from user where username=(?) and password=(?)  limit 1";
                PreparedStatement ps =con.getCon().prepareStatement(sql);
                ps.setString(1,user);
                ps.setString(2,pass);
                //System.out.print(user);
                //System.out.print(pass);
                ResultSet rs=ps.executeQuery();
                Usuario usuario=new Usuario();
                //System.out.print(usuario);
                while(rs.next()){
                usuario.setNombre(rs.getString("nombre"));
                usuario.setUsername(rs.getString("username"));
                usuario.setPassword(rs.getString("password"));
                usuario.setApaterno(rs.getString("paterno"));
                usuario.setAmaterno(rs.getString("materno"));
                }
             
           return usuario;
        }catch(SQLException e){
            System.out.println("Error ValidacionSesion.login"+ e.getMessage());
             return null;
        }
    }
    
}
