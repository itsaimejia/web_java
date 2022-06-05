/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christian
 */
public class ClaseConexion {
  
  static String bd="prueba";
  static String login="root";
  static String password="";
  static String url="jdbc:mysql://localhost/"+ bd;
  Connection con=null;
  
  public ClaseConexion() {
        try{  
        //obtenemos el driver de myql
            Class.forName("com.mysql.jdbc.Driver");
        //obtenemos la conexion
            con=DriverManager.getConnection(url, login ,password);
            
            //si con no es nulo, significa que si se logro conectar
            if(con !=null){
            System.out.println("Connecting database ["+con+"] ok");
            }
            
            } catch (SQLException e) { //excepción generada por la conexión
               System.out.println("excepción conexión "+ e.getMessage());
                
             }catch(ClassNotFoundException e)//excepción generada por no encontrar el driver
            {
                System.out.println("excepción driver "+ e.getMessage());

            }
        }

    public Connection getCon() {
        return con;
    }
        
    public void disconnect(){
        System.out.println("closing database: ["+con+"] ok");
        if(con!=null)
        {
            try{
                con.close();
                
            
        }catch(SQLException e)
                {
                System.out.println(e);
             }
        }
    
    }
}
