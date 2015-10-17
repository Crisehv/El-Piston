/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Zuany
 */

public class AnticiposDAO {
    int idAnticipo;
    int Monto;
    int idFalla;
    
      public AnticiposDAO( int idFalla, int Monto){
      
       this.idFalla = idFalla;
       this.Monto = Monto;
    }
      
    public AnticiposDAO(){}
    
    
    //VARIABLES De CONEXION
    Conexion conex = new Conexion();
    Connection conn;
    ResultSet Consulta;
   
    public int getIdAnticipo() {
        return idAnticipo;
    }

    public void setIdAnticipo(int idAnticipo) {
        this.idAnticipo = idAnticipo;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public int getIdFalla() {
        return idFalla;
    }

    public void setIdFalla(int idFalla) {
        this.idFalla = idFalla;
    }
   
    @Override
    public String toString(){    
        return idFalla+" ";
    } 
    public AnticiposDAO( String algo){}
    
    public String GuardarAnticipo(int Monto, String idFalla){
        try{
            conn = conex.obtenerConexion();
            Statement Comando = conn.createStatement();
            
            Comando.executeUpdate("insert into anticipos(montoAnticipo, idFalla) values('"+Monto+"','"+idFalla+"')");
            conn.close();
            return "registro de Anticipo Agregado Exitosamente";
        }
        catch(Exception e){
            return "Ocurrio un error al intentar agregar registro"+e;
        }
    }
    public ResultSet Buscar(int idAnticipo){
        try {
            conex.conectar();
            conn = conex.obtenerConexion();
            Statement Comando = conn.createStatement();
            
            Consulta = Comando.executeQuery("select * from anticipos where idAnticipo ="+idAnticipo);
            return Consulta;
        }
        
        catch(Exception E){
            return Consulta;
        }    
    }
    
    public String eliminar(String idAnticipo){
        String respuesta;
        try{
            conex.conectar();
            conn = conex.obtenerConexion();
            Statement comando = conn.createStatement();
            
            if(idAnticipo.equals(""))
                respuesta = "Ingrese un ID válido";
            else{
                comando.executeUpdate("delete from anticipos where idAnticipo"+idAnticipo);
            respuesta = "Registro eliminado";
            }
            
            return respuesta;
        }
        catch(Exception es){
            return "Hubo un erro al momento de elminar el anticipo..."+es;
        }
    }
    
  
    
    public ArrayList<AnticiposDAO> BusquedaGeneral(){
        try{
            conex.conectar();
            conn = conex.obtenerConexion();
            Statement comando = conn.createStatement();
            ArrayList<AnticiposDAO> ListaFalla=new ArrayList<AnticiposDAO>();
            
             Consulta=comando.executeQuery("select idFalla from fallas");
            
            if(Consulta.next())
            {
                do{
                    AnticiposDAO nuevoAnticipo=new AnticiposDAO(Consulta.getString ("idFalla"));
                   ListaFalla.add(nuevoAnticipo);
                }while(Consulta.next());
                return ListaFalla;
            }
            
            else{
                return null;
            }
        }
        catch(Exception ess){
            JOptionPane.showMessageDialog(null, "Ocurrio un erro al intentar cargar el ArrayList de anticipos");
            return null;
        }
    }
    
     
    
}

    

