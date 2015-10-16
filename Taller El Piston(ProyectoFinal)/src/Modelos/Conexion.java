package Modelos;

import java.sql.*;
public class Conexion {
    
    public static Connection conn; 
    String resp;
    public String conectar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); 
            conn = DriverManager.getConnection("jdbc:mysql://secure172.inmotionhosting.com:3306/nitrow5_tallerelpistonumg","nitrow5_umg4","@E4umg"); 
            System.out.println("Se ha conectado correctamente a la base de datos"); 
            resp="se ha conectad";
            return resp;
        }catch(Exception e)
        {
             System.out.println(" NO se ha conectado correctamente a la base de datos " + e.getMessage()); 
        resp= "no se ha conectado";
        return resp;
        }
    }
    
    
    public Connection obtenerConexion()
    {
        return conn; 
    }
}
