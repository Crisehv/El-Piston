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
public class AutosDAO {
    String placa;
    int modelo,idcliente;
    String tipo;
    String color;
    String estatus;
    
    Connection Conn;
    Conexion Cone = new Conexion();
    ResultSet consulta;
    
    public void InsertarAutos(String placa, int modelo, String tipo, String color, String estatus){
        
        this.placa= placa;
        this.modelo= modelo;
        this.tipo = tipo;
        this.color = color;
        this.estatus = estatus;
        
        try{
            
             JOptionPane.showMessageDialog(null, Cone.conectar());
            Conn = Cone.obtenerConexion();
            Statement Comando = Conn.createStatement();
            Comando.executeUpdate("insert into automoviles values( '"+placa+"', '"+modelo+"', '"+tipo+"','"+color+"','"+estatus+"')");
        }
 catch(Exception E){
            
            JOptionPane.showMessageDialog(null, "Ocurrio un error al ingresar los datos..."+E);
    }
    }
        
    public ResultSet buscar(int idcliente){
        try{
            Cone.conectar();
            Conn = Cone.obtenerConexion();
            Statement comando = Conn.createStatement();
            
            //Buscar un registro
            consulta = comando.executeQuery("select * from automoviles where dpiclientes="+idcliente);
            return consulta;
        }
        catch(Exception e){
            return consulta;
        }
    }
} 
