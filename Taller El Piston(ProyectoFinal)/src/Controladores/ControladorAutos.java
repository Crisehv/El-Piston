/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;


import Modelos.*;
import Vistas.*;
import Vistas.JDMecanico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Joseph
 */
public class ControladorAutos implements ActionListener{
    JDAutoss VistaAutos;
    
    public  ControladorAutos (JDAutoss VistaAutos){
        this.VistaAutos = VistaAutos;
        this.VistaAutos.btnagregar.addActionListener(this);
    }
    
     public void actionPerformed(ActionEvent E){
     AutosDAO nuevoAuto = new AutosDAO();
    nuevoAuto.InsertarAutos(VistaAutos.txtplaca.getText(), Integer.parseInt(VistaAutos.txtmode.getText()), VistaAutos.txttipo.getText(),VistaAutos.txtcolor.getText(),VistaAutos.txtest.getText());
}
}
