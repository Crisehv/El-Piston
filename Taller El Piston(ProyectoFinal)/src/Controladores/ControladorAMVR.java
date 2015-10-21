
package Controladores;

import Modelos.AsignarMecanicoVehiculoRepararDAO;
import Vistas.JDvistaAMVR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorAMVR implements ActionListener{
    
     JDvistaAMVR VistaAMVR;
     
     public ControladorAMVR(JDvistaAMVR VistaAMVR)
     {
         this.VistaAMVR=VistaAMVR;
         this.VistaAMVR.cmdamvr.addActionListener(this);
         this.VistaAMVR.btncambio.addActionListener(this);
         VistaAMVR.txtestatus.setText("En Reparación");
         
         ////busquda 

        AsignarMecanicoVehiculoRepararDAO productoAbuscar=new AsignarMecanicoVehiculoRepararDAO();
        ArrayList<AsignarMecanicoVehiculoRepararDAO> productosencontrados;
        productosencontrados=productoAbuscar.Busquedageneral();
        try
        {
            for(int i=0;i<productosencontrados.size();i++)
            {
                AsignarMecanicoVehiculoRepararDAO NuevoProducto=new AsignarMecanicoVehiculoRepararDAO(productosencontrados.get(i).getNombre(),productosencontrados.get(i).getDpimecanico1());
                VistaAMVR.JCmecanico.addItem(NuevoProducto);
            }
  
        }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null, "Hubo un error"+E);
        }
         /////
        
        
         ////busquda 

        AsignarMecanicoVehiculoRepararDAO buscar2=new AsignarMecanicoVehiculoRepararDAO();
        
        ArrayList<AsignarMecanicoVehiculoRepararDAO> encontrado2;
              encontrado2=buscar2.Busquedageneral2();
        try
        {
            for(int i=0;i<encontrado2.size();i++)
            {
                AsignarMecanicoVehiculoRepararDAO NuevoProducto=new AsignarMecanicoVehiculoRepararDAO(encontrado2.get(i).getNombre(),encontrado2.get(i).getDpimecanico1());
                VistaAMVR.JCplaca.addItem(NuevoProducto);
            }
  
        }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null, "Hubo un error "+E);
        }
         /////
        
        
          ////busquda 

        AsignarMecanicoVehiculoRepararDAO productoAbuscar3=new AsignarMecanicoVehiculoRepararDAO();
        
        ArrayList<AsignarMecanicoVehiculoRepararDAO> productosencontrados3;
      
       productosencontrados3=productoAbuscar3.Busquedageneral3();
        try
        {
            for(int i=0;i<productosencontrados3.size();i++)
            {
                AsignarMecanicoVehiculoRepararDAO NuevoProducto=new AsignarMecanicoVehiculoRepararDAO(productosencontrados3.get(i).getNombre(),productosencontrados3.get(i).getDpimecanico1());
                VistaAMVR.JCidfalla.addItem(NuevoProducto);
            }
  
        }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null, "Hubo un error "+E);
        }
         /////
        
        
 
     }
     
     public void actionPerformed(ActionEvent E){
        
        if(VistaAMVR.cmdamvr==E.getSource())
            {
           AsignarMecanicoVehiculoRepararDAO nuevaAsignacion=new AsignarMecanicoVehiculoRepararDAO();
           AsignarMecanicoVehiculoRepararDAO cambiar=new  AsignarMecanicoVehiculoRepararDAO();
           nuevaAsignacion.Asignacion(VistaAMVR.JCmecanico.getSelectedItem().toString(),VistaAMVR.JCplaca.getSelectedItem().toString(),Integer.parseInt(VistaAMVR.JCidfalla.getSelectedItem().toString()));
           JOptionPane.showMessageDialog(null,cambiar.CambioEstatus(VistaAMVR.JCmecanico.getSelectedItem().toString(), VistaAMVR.txtestatus.getText()));    
         
}
   
    
    
      
     }
    
}
