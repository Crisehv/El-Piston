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
 * @author Joseph
 */
public class MecanicoDAO {
    String dpiMecanico;
    String apellidos;
    String nombre;
    String direccion;
    String telefono;
    String especialidad;
    String estatus;
    
    Connection Conn;
    Conexion Cone = new Conexion();
    
    public void InsertarMecanicos(String dpiMecanico,String apellidos, String nombre, String direccion, String telefono, String especialidad, String estatus){
        
        this.dpiMecanico = dpiMecanico;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.estatus = estatus;
        
        try{
            
            
            Conn = Cone.obtenerConexion();
            Statement Comando = Conn.createStatement();
            Comando.executeUpdate("insert into mecanicos() values( '"+dpiMecanico+"', '"+apellidos+"', '"+nombre+"','"+direccion+"','"+telefono+"','"+especialidad+"', '"+estatus+"')");
        }
 catch(Exception E){
            
            JOptionPane.showMessageDialog(null, "Ocurrio un error al ingresar los datos..."+E);
    }
}
}

