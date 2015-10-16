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
    ResultSet consulta;
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
} 
public ResultSet buscar(int codigodpi){
        
        try{
            Cone.conectar();
            Conn = Cone.obtenerConexion();
            Statement comando = Conn.createStatement();
            
            //Buscar un registro
            consulta = comando.executeQuery("select * from clientes where dpiclientes="+codigodpi);
            return consulta;
        }
        catch(Exception e){
            return consulta;
        }
    }
    
    public String editar(String dpiclientes, String apellidos, String nombre, String direccion, String telefono){
        
        String respuesta;
        
        try{
            Cone.conectar();
            Conn = Cone.obtenerConexion();
            Statement comando = Conn.createStatement();
           
            //Editar registro
            if (dpiclientes.equals(""))
                respuesta = "Ingrese un codigo valido";
            else{
                comando.executeUpdate("update clientes set apellidos = '"+apellidos+"', nombre = '"+nombre+"', direccion = '"+direccion+"', telefono = '"+telefono+"' where dpiMecanico = "+dpiclientes);
            respuesta = "Registro actualizado exitosamente";
            }
            return respuesta;
        }
        
        catch (Exception e){
            return "Hubo un error al momento de actualizar..."+e;
        }
    }
    
    public String eliminar(String dpiMecanico){
        
        String respuesta;
        
        try{
            Cone.conectar();
            Conn = Cone.obtenerConexion();
            Statement comando = Conn.createStatement();
            
            //Editar registro
            if (dpiclientes.equals(""))
                respuesta = "Ingrese un codigo valido";
            else{
                comando.executeUpdate("delete from clientes where dpiclientes = "+dpiclientes);
            respuesta = "Registro eliminado";
            }
            return respuesta;
        }
        
        catch (Exception e){
            return "Hubo un error al momento de eliminar..."+e;
        }
    }
}
