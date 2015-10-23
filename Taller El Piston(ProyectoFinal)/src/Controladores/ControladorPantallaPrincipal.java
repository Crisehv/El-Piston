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
    JDAutoss VistaAutos;
    JDvistaAMVR VistaAMVR;
    JDMecanico VistaMecanico;
    JDClientes VistaClientes;
    JDCancelacionYEntregaDV VistaCancelacionYEntrega;
    JDAnticipo VistaAnticipo;
    JDFallas VistaFallas;
    
    public ControladorPantallaPrincipal(JFPantallaPrincipal VistaPrincipal){
        
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPrincipal.btnAgregarMec.addActionListener(this);
        this.VistaPrincipal.btnAgregarClien.addActionListener(this);
        this.VistaPrincipal.btnAgregarAuto.addActionListener(this);
        this.VistaPrincipal.btnRegistrarAnti.addActionListener(this);
        this.VistaPrincipal.btnCanEn.addActionListener(this);
        this.VistaPrincipal.btnAMAUVAR.addActionListener(this);
        this.VistaPrincipal.btnfallas.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent E){
        if(VistaPrincipal.btnAgregarAuto == E.getSource()){
            
            VistaAutos = new JDAutoss(VistaPrincipal, true);
            VistaAutos.setLocationRelativeTo(null);
            VistaAutos.setVisible(true);
        }
        
            if(VistaPrincipal.btnAMAUVAR==E.getSource())
            {
                VistaAMVR= new JDvistaAMVR(VistaPrincipal,true);
                VistaAMVR.setLocationRelativeTo(null);
                VistaAMVR.setVisible(true);
                
                
            }
            
        
            if(VistaPrincipal.btnAgregarMec == E.getSource())
            {
                VistaMecanico = new JDMecanico (VistaPrincipal, true);
                VistaMecanico.setLocationRelativeTo(null);
                VistaMecanico.setVisible(true);
        }
    
            if(VistaPrincipal.btnAgregarClien == E.getSource())
            {
                VistaClientes = new JDClientes (VistaPrincipal, true);
                VistaClientes.setLocationRelativeTo(null);
                VistaClientes.setVisible(true);
            }
            
            if(VistaPrincipal.btnCanEn == E.getSource())
            {
                VistaCancelacionYEntrega = new JDCancelacionYEntregaDV (VistaPrincipal, true);
                VistaCancelacionYEntrega.setLocationRelativeTo(null);
                VistaCancelacionYEntrega.setVisible(true);
            }
    
            if(VistaPrincipal.btnRegistrarAnti == E.getSource())
            {
                VistaAnticipo = new JDAnticipo (VistaPrincipal, true);
                VistaAnticipo.setLocationRelativeTo(null);
                VistaAnticipo.setVisible(true);
            }
            if(VistaPrincipal.btnfallas == E.getSource())
            {
                VistaFallas = new JDFallas(VistaPrincipal, true);
                VistaFallas.setLocationRelativeTo(null);
                VistaFallas.setVisible(true);
            }
    }
}
