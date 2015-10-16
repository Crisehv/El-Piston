/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.JDCancelacionYEntregaDV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author KokinG7
 */
public class ControladorCancelacionYEntregaDV implements ActionListener {
    
    JDCancelacionYEntregaDV VistaCanYEntDV;
    
    public ControladorCancelacionYEntregaDV (JDCancelacionYEntregaDV VistaCanYEntDV)
    {
        this.VistaCanYEntDV=VistaCanYEntDV;
        VistaCanYEntDV.BtnBuscarCliente.addActionListener(this);
        VistaCanYEntDV.BtnBuscarAnticipo.addActionListener(this);
        VistaCanYEntDV.BtnEntregarVehiculo.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
    }
            
    
}
