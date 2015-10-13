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
 * @author Criss
 */
public class ControladorPantallaPrincipal implements ActionListener{
    
    JFPantallaPrincipal VistaPrincipal = new JFPantallaPrincipal();
    JDAutomoviles VistaAutos;
    public ControladorPantallaPrincipal(JFPantallaPrincipal VistaPrincipal){
        
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPrincipal.btnAgregarMec.addActionListener(this);
        this.VistaPrincipal.btnAgregarClien.addActionListener(this);
        this.VistaPrincipal.btnAgregarAuto.addActionListener(this);
        this.VistaPrincipal.btnRegistrarAnti.addActionListener(this);
        this.VistaPrincipal.btnCanEn.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent E){
        if(VistaPrincipal.btnAgregarAuto == E.getSource()){
            
            VistaAutos = new JDAutomoviles(VistaPrincipal, true);
            VistaAutos.setLocationRelativeTo(null);
            VistaAutos.setVisible(true);
        }
    }
    
}