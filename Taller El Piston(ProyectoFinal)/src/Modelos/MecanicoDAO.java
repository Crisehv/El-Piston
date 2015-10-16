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
    ResultSet consulta;
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
    public ResultSet buscar(int codigodpi){
        
        try{
            Cone.conectar();
            Conn = Cone.obtenerConexion();
            Statement comando = Conn.createStatement();
            
            //Buscar un registro
            consulta = comando.executeQuery("select * from mecanicos where dpiMecanico="+codigodpi);
            return consulta;
        }
        catch(Exception e){
            return consulta;
        }
    }
    
    public String editar(String dpiMecanico,String apellidos, String nombre, String direccion, String telefono, String especialidad, String estatus){
        
        String respuesta;
        
        try{
            Cone.conectar();
            Conn = Cone.obtenerConexion();
            Statement comando = Conn.createStatement();
           
            //Editar registro
            if (dpiMecanico.equals(""))
                respuesta = "Ingrese un codigo valido";
            else{
                comando.executeUpdate("update mecanicos set apellidos = '"+apellidos+"', nombre = '"+nombre+"', direccion = '"+direccion+"', telefono = '"+telefono+"', especialidad = '"+especialidad+"', estatus = '"+estatus+"' where dpiMecanico = "+dpiMecanico);
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
            if (dpiMecanico.equals(""))
                respuesta = "Ingrese un codigo valido";
            else{
                comando.executeUpdate("delete from mecanicos where dpiMecanico = "+dpiMecanico);
            respuesta = "Registro eliminado";
            }
            return respuesta;
        }
        
        catch (Exception e){
            return "Hubo un error al momento de eliminar..."+e;
        }
    }
}



