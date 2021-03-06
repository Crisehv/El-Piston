/*
 * To change this template, choose Tools | Templates
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
 * @author alumno
 */
public class AsignarMecanicoVehiculoRepararDAO {
    
   
    String dpimecanico;
    String placa;
    int idFalla;
    String estatus;
     //Variables de conexion
    Conexion conex=new Conexion();
    Connection conn;
    ResultSet consulta;
    
    
    
    /////////////datos para buscar
    String dpimecanico1;
    String nombre;
    String nombr2;
     String dpimecanico2;
    String apellidos;
    String dpimecanico3;
    
    public AsignarMecanicoVehiculoRepararDAO(String dpimecanico1, String nombre) {
        this.dpimecanico1 = dpimecanico1;
        this.nombre = nombre;
        
    }

    public String getDpimecanico1() {
        return dpimecanico1;
    }

    public void setDpimecanico1(String dpimecanico1) {
        this.dpimecanico1 = dpimecanico1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
    
    
    
    
    
    
    

    public AsignarMecanicoVehiculoRepararDAO() {
    }
  
    
   public void Asignacion(String placa,String dpiMecanico,int idFalla)
    {
        this.placa=placa;
        this.dpimecanico=dpiMecanico;
        this.idFalla=idFalla;
        
        
        try
        {
            
            
            conn=conex.obtenerConexion();
            Statement comando=conn.createStatement();
            comando.executeUpdate("insert into asignaciones() values(NULL,'"+placa+"','"+dpiMecanico+"','"+idFalla+"')");
            JOptionPane.showMessageDialog(null, "Ingresado Exitosamente");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "hubo un erro al insertar registro "+e);
        }
        
    }
   
   
   
   
   
    public ArrayList<AsignarMecanicoVehiculoRepararDAO> Busquedageneral()
          {
           try{
            conex.conectar();
            conn = conex.obtenerConexion();
            Statement comando = conn.createStatement();
            ArrayList<AsignarMecanicoVehiculoRepararDAO> ListaProductos=new ArrayList<AsignarMecanicoVehiculoRepararDAO>();
            
            //buscar
        consulta=comando.executeQuery("select placa, estatus from automoviles");
            
            if(consulta.next())
            {
                do{
                    AsignarMecanicoVehiculoRepararDAO nuevoProducto=new AsignarMecanicoVehiculoRepararDAO(consulta.getString("placa"),consulta.getString("estatus"));
                    ListaProductos.add(nuevoProducto);
                }while(consulta.next());
                return ListaProductos;
            }
            else return null;
            
            
            
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,"ocurrio un error" );
               return null;
           }     
          }
         
        
           
           
           ////////////
       
         public ArrayList<AsignarMecanicoVehiculoRepararDAO> Busquedageneral2()
          {
           try{
            conex.conectar();
            conn = conex.obtenerConexion();
            Statement comando = conn.createStatement();
            ArrayList<AsignarMecanicoVehiculoRepararDAO> ListaProductos=new ArrayList<AsignarMecanicoVehiculoRepararDAO>();
            
            //buscar
           
             consulta=comando.executeQuery("select dpiMecanico, estatus from mecanicos");
            
            if(consulta.next())
            {
                do{
                    AsignarMecanicoVehiculoRepararDAO nuevoProducto=new AsignarMecanicoVehiculoRepararDAO(consulta.getString("dpiMecanico"),consulta.getString("estatus"));
                    ListaProductos.add(nuevoProducto);
                }while(consulta.next());
                return ListaProductos;
            }
            else return null;
            
            
            
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,"ocurrio un error" );
               return null;
           }     
          }
           ////////////
       
         public ArrayList<AsignarMecanicoVehiculoRepararDAO> Busquedageneral3()
          {
           try{
            conex.conectar();
            conn = conex.obtenerConexion();
            Statement comando = conn.createStatement();
            ArrayList<AsignarMecanicoVehiculoRepararDAO> ListaProductos=new ArrayList<AsignarMecanicoVehiculoRepararDAO>();
            
            //buscar
            consulta=comando.executeQuery("select idFalla, fecha from fallas");
            
            if(consulta.next())
            {
                do{
                    AsignarMecanicoVehiculoRepararDAO nuevoProducto=new AsignarMecanicoVehiculoRepararDAO(consulta.getString("idFalla"),consulta.getString("fecha"));
                    ListaProductos.add(nuevoProducto);
                }while(consulta.next());
                return ListaProductos;
            }
            else return null;
            
            
            
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,"ocurrio un error" );
               return null;
           }     
          }
            @Override
           
           public String toString ()
           {
              return nombre;
                              
            }
           public String toString2 ()
           {
              return nombre;
                              
            }
            public String toString3 ()
           {
              return nombre;
                              
            }
            
            
            //actualizacion del estatus en automoviles
      public String CambioEstatus(String Placa, String estatus){
      String respuesta;
        try{
            conex.conectar();
            conn = conex.obtenerConexion();
            Statement comando = conn.createStatement();
           
            
            //Editar registro
            if (Placa.equals(""))
                respuesta = "Error";
            else{
               
            
                comando.executeUpdate("update automoviles set estatus = '"+estatus+"' where placa='"+Placa+"'");
                
            
            respuesta = "Estatus Cambiado = EN REPARACIÓN";
            }
            return respuesta;
        }
        
        catch (Exception e){
            return "Hubo un error al momento de actualizar... aki     "+e;
        }
    }
            
   
   
}