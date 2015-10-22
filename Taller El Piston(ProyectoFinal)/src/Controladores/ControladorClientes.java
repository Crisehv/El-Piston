/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;


import Modelos.ClientesDAD;
import Vistas.JDClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author nitroherman
 */
public class ControladorClientes implements ActionListener{
    JDClientes VistaClientes;
    
    public  ControladorClientes (JDClientes VistaClientes){
        this.VistaClientes = VistaClientes;
        this.VistaClientes.btnagregar.addActionListener(this);
    }
    
     public void actionPerformed(ActionEvent E){
         
              ClientesDAD nuevoCliente = new ClientesDAD();
    nuevoCliente.InsertarClientes(VistaClientes.txtdpicliente.getText(), VistaClientes.txtapellidos.getText(), VistaClientes.txtnombrecliente.getText(), VistaClientes.txtdireccionclientes.getText(), VistaClientes.txttelefonoclientes.getText());

}
     
}