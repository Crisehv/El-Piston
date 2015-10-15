/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class AsignarMecanicoVehiculoRepararDAO {
    
    String fecha;
    String descripcion;
    int dpimecanico;
    String placa;
    String estatus;
    
     public void insertarReparaciones(String fecha,String descripcion,int dpimecanico,String placa,String estatus)
    {
        this.fecha=fecha;
        this.descripcion=descripcion;
        this.dpimecanico=dpimecanico;
        this.placa=placa;
        this.estatus=estatus;
        
         /*
        
        try
        {
           
            
            JOptionPane.showMessageDialog(null, conex.conectar());
            conn=conex.getConexion();
            Statement comando=conn.createStatement();
            comando.executeUpdate("insert into clientes() values(NULL,'"+apellidos+"','"+nombre+"','"+direccion+"','"+telefono+"')");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "hubo un erro al insertar registro ");
        }
        
    }
        */
    
    
    
    
}
}