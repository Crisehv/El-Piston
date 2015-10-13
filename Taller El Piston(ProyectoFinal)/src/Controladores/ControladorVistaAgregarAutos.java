/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Julio
 */
public class ControladorVistaAgregarAutos implements ActionListener {
    JDAutomoviles VistaAgregarAutos;
    
    public ControladorVistaAgregarAutos(JDAutomoviles VistaAgregarAutos){
        
        this.VistaAgregarAutos = VistaAgregarAutos;
        this.VistaAgregarAutos.cmdagregar.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent E){
        
        //AfiliadosDAO NuevoAfiliado = new AfiliadosDAO();
        //NuevoAfiliado.IngresarAfiliados(Integer.parseInt(VistaAgregarAfiliados.txtDPI.getText()), VistaAgregarAfiliados.txtNombre.getText(),VistaAgregarAfiliados.txtApellido.getText(),Integer.parseInt(VistaAgregarAfiliados.txtNumTel.getText()),VistaAgregarAfiliados.txtDireccion.getText(),Integer.parseInt(VistaAgregarAfiliados.txtEdad.getText()), VistaAgregarAfiliados.txtDepa.getText(),VistaAgregarAfiliados.txtAldea.getText(),VistaAgregarAfiliados.txtGenero.getText()  );
                
}
}

