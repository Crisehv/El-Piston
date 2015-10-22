
package Controladores;

import Modelos.FallasDAO;
import Vistas.JDFallas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class controladorFallas implements ActionListener{
    
    JDFallas vistaFallas;
    
    public controladorFallas(JDFallas vistaFallas)
    {
        this.vistaFallas = vistaFallas; 
        this.vistaFallas.btnAgregarFalla.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.vistaFallas.btnAgregarFalla)
        {
            JOptionPane.showMessageDialog(null, "Controlador fallas funcionando!");
            FallasDAO nuevaFalla = new FallasDAO(); 
            nuevaFalla.insertarFalla(this.vistaFallas.txtFecha.getText(),this.vistaFallas.txtDescripcion.getText()
                                      , Integer.parseInt(this.vistaFallas.txtMonto.getText()),this.vistaFallas.txtPlaca.getText());
        }
    }
    
}
