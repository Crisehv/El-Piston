/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;


import Vistas.JDClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Joseph
 */
public class ControladorClientes implements ActionListener{
    JDClientes VistaClientes;
    
    public  ControladorClientes (JDClientes VistaMecanico){
        this.VistaClientes = VistaMecanico;
        this.VistaClientes.btnagregar.addActionListener(this);
    }
    
     public void actionPerformed(ActionEvent E){
    }
}
