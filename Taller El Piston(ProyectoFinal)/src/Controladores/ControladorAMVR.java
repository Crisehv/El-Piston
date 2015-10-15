
package Controladores;

import Vistas.JDvistaAMVR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAMVR implements ActionListener{
    
     JDvistaAMVR VistaAMVR;
     
     public ControladorAMVR(JDvistaAMVR VistaAMVR)
     {
         this.VistaAMVR=VistaAMVR;
         this.VistaAMVR.cmdamvr.addActionListener(this);
     }
     
     public void actionPerformed(ActionEvent E){
        
                  
}
   
    
    
      
    
    
}
