/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import usuarios.Usuario;

/**
 *
 * @author itsai
 */


public class UsuariosAcciones {
    private ClaseConexion con;
    public UsuariosAcciones(ClaseConexion con){
        this.con = con; 
    }
    
    public boolean insert(Usuario user){
        String sql ="insert into user values(?,?,?,?,?,?)";
        try{
            PreparedStatement ps = con.getCon().prepareStatement(sql);
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getApaterno());
            ps.setString(3, user.getAmaterno());
            ps.setString(4, user.getCorreo());
            ps.setString(5, user.getUsername());
            ps.setString(6, user.getPassword());
            int res = ps.executeUpdate();
            if(res >= 1)
                return true;
            else
                return false;
        }catch(SQLException ex){
            return false;
        }
    }
    
    public boolean delete(String nombre){
        String sql ="delete from user where nombre=(?)";
        try{
            PreparedStatement ps = con.getCon().prepareStatement(sql);
            ps.setString(1, nombre);
            int res = ps.executeUpdate();
            if(res >= 1)
                return true;
            else
                return false;
                
        }catch(SQLException ex){
           return false; 
        }
    }
    
    public Usuario select(String nombre){
        Usuario user = new Usuario();
        String sql = "select * from user where nombre=(?)";
        try{
            PreparedStatement ps = con.getCon().prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            System.out.println(rs);
            if(!rs.wasNull()){
                while (rs.next()) {                
                    user.setNombre(rs.getString("nombre"));
                    user.setApaterno(rs.getString("paterno")); 
                    user.setAmaterno(rs.getString("materno"));
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                }
                rs.close();
                return user;
            }else{
                return null;
            }
            
            
            
        }catch(SQLException ex){
            return null;
        }
    }
    
    public boolean update(Usuario user){
        String sql ="update user set nombre=(?), paterno=(?), materno=(?) where nombre=(?)";
        try{
            PreparedStatement ps = con.getCon().prepareStatement(sql);
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getApaterno());
            ps.setString(3, user.getAmaterno());
            ps.setString(4, user.getNombre());
            int res = ps.executeUpdate();
            System.out.println(res);
            if(res >= 1)
                return true;
            else
                return false;
                
        }catch(SQLException ex){
           return false; 
        }
    }
    
    public List<Usuario> getUsuarios(){
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        Usuario user;
        String sql = "select * from user";
        try{
            PreparedStatement ps = con.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user = new Usuario();
                user.setNombre(rs.getString("nombre"));
                user.setApaterno(rs.getString("paterno")); 
                user.setAmaterno(rs.getString("materno"));
                user.setCorreo(rs.getString("correo"));
                
                System.out.println(user);
                listaUsuarios.add(user);
            }
            rs.close();  
            
        }catch(SQLException ex){
            return null;
        }
        return listaUsuarios;
        
    }
}
