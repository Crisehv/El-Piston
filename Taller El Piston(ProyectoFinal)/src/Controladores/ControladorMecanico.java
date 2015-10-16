/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;


import Modelos.MecanicoDAO;
import Vistas.JDMecanico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Joseph
 */
public class ControladorMecanico implements ActionListener{
    JDMecanico VistaMecanico;
    
    public  ControladorMecanico (JDMecanico VistaMecanico){
        this.VistaMecanico = VistaMecanico;
        this.VistaMecanico.btnagregar.addActionListener(this);
    }
    
     public void actionPerformed(ActionEvent E){
     MecanicoDAO nuevoMecanico = new MecanicoDAO();
    nuevoMecanico.InsertarMecanicos(VistaMecanico.txtdpi.getText(), VistaMecanico.txtape.getText(), VistaMecanico.txtnom.getText(),VistaMecanico.txtdire.getText(),VistaMecanico.txttele.getText(),VistaMecanico.txtesp.getText(), VistaMecanico.txtest.getText());
}
}
