
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
         
         
         ////busquda 

        AsignarMecanicoVehiculoRepararDAO productoAbuscar=new AsignarMecanicoVehiculoRepararDAO();
        ArrayList<AsignarMecanicoVehiculoRepararDAO> productosencontrados;
        productosencontrados=productoAbuscar.Busquedageneral();
        try
        {
            for(int i=0;i<productosencontrados.size();i++)
            {
                AsignarMecanicoVehiculoRepararDAO NuevoProducto=new AsignarMecanicoVehiculoRepararDAO(productosencontrados.get(i).getNombre(),productosencontrados.get(i).getDpimecanico1());
                VistaAMVR.JCplaca.addItem(NuevoProducto);
            }
  
        }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null, "Hubo un error"+E);
        }
         /////
 
     }
     
     public void actionPerformed(ActionEvent E){
        
         AsignarMecanicoVehiculoRepararDAO nuevaAsignacion=new AsignarMecanicoVehiculoRepararDAO();
        nuevaAsignacion.Asignacion(VistaAMVR.JCplaca.getSelectedItem().toString(),VistaAMVR.JCmecanico.getSelectedItem().toString(),Integer.parseInt(VistaAMVR.JCidfalla.getSelectedItem().toString()));
       
}
   
    
    
      
    
    
}
