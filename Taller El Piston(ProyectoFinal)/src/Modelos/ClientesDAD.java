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
 * @author nitroherman
 */
public class ClientesDAD {
    String dpiclientes;
    String apellidos;
    String nombre;
    String direccion;
    String telefono;
    
    
    Connection Conn;
    Conexion Cone = new Conexion();
    public void InsertarClientes(String dpiclientes, String apellidos, String nombre, String direccion, String telefono){
        
        this.dpiclientes= dpiclientes;
        this.apellidos= apellidos;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        
         try{
            
             JOptionPane.showMessageDialog(null, Cone.conectar());
            Conn = Cone.obtenerConexion();
            Statement Comando = Conn.createStatement();
            Comando.executeUpdate("insert into clientes values( '"+dpiclientes+"', '"+apellidos+"', '"+nombre+"','"+direccion+"','"+telefono+"')");
        }
 catch(Exception E){
            
            JOptionPane.showMessageDialog(null, "Ocurrio un error al ingresar los datos..."+E);
    }
} }
