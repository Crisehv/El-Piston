package Modelos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class FallasDAO {
    
    Connection conn; 
    Conexion conexion = new Conexion(); 
    
    public void insertarFalla(String fecha, String descripcion, int monto, String placa)
    {
         try{
            conexion.conectar();
            conn = conexion.obtenerConexion();
            Statement comando = conn.createStatement();
            comando.executeUpdate("insert into fallas values(null, '"+fecha+"', '"+descripcion+"', '"+monto+"','"+placa+"')");
            JOptionPane.showMessageDialog(null, "Se agrego una falla");
         }
    catch(Exception E){
            
            JOptionPane.showMessageDialog(null, "Ocurrio un error al ingresar la falla " +E.getMessage());
        }
    }
    
}
