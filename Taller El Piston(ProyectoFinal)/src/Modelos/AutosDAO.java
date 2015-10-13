/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class AutosDAO {
    String Placa;
    int Modelo;
    String Tipo;
    String Color;
    String Estatus;
    String DPICliente;
    
    Connection Con;
    ResultSet Consulta;
    
    //Conexion Conec = new Conexion();
    
    public void IngresarAfiliados(){
        
        
        /*try
        {
             JOptionPane.showMessageDialog(null, Conec.conectar());
            Con=Conec.getConexion();
            Statement comando=Con.createStatement();
            comando.executeUpdate("insert into afiliados() values(NULL,'"+DPI+"', '"+Nombre+"', '"+Apellido+"', '"+NumTel+"', '"+Direccion+"', '"+Edad+"', '"+Departamento+"', '"+Aldea+"', '"+Genero+"')");
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"hubo un erro al insertar registro"+e);
            
        }
        
    
    }
    */
        
        
        
}
}

