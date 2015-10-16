/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.JDAnticipo;
import Modelos.AnticiposDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Zuany
 */
public class ControladorVistaAnticipos implements ActionListener  {
    
    JDAnticipo vistaAnticipo;
    String info = "";
    
    public ControladorVistaAnticipos(JDAnticipo vistaAnticipo){
       
        this.vistaAnticipo = vistaAnticipo;
        
        vistaAnticipo.BtnBuscarAnticipo.addActionListener(this);
        vistaAnticipo.BtnGuardarAnticipo.addActionListener(this);
        vistaAnticipo.CBIdFalla.addActionListener(this);
        vistaAnticipo.txtIdAnticipo.addActionListener(this);
        vistaAnticipo.txtIdFallaAnticipo.addActionListener(this);
        vistaAnticipo.btnEliminarAnticipo.addActionListener(this);
        vistaAnticipo.txtMontoAnticipo.addActionListener(this);
    }
     
    public void actionPerformed(ActionEvent e){
        //Busqueda
        
        AnticiposDAO fallaABuscar = new AnticiposDAO();
        ArrayList<AnticiposDAO> fallaEncontrada;
        fallaEncontrada = fallaABuscar.BusquedaGeneral();
        
        try{
            for(int i=0; i<fallaEncontrada.size(); i++){
                AnticiposDAO nuevoAnticipo = new AnticiposDAO(fallaEncontrada.get(i).getIdFalla());
            }
        }
        catch(Exception es){
            JOptionPane.showMessageDialog(null, "Hubo un erro"+es);
        }
    
    
         String info = " ";
         
         info = info + vistaAnticipo.CBIdFalla.getSelectedItem().toString();
         vistaAnticipo.txtIdFallaAnticipo.setText(info);
         
        
        if(e.getSource() == vistaAnticipo.BtnGuardarAnticipo){
        AnticiposDAO nuevoAnticipo = new AnticiposDAO();
        nuevoAnticipo.GuardarAnticipo(Integer.parseInt(vistaAnticipo.txtMontoAnticipo.getText()),vistaAnticipo.txtIdFallaAnticipo.toString());
        }
        
        if(e.getSource() == vistaAnticipo.BtnBuscarAnticipo){
            AnticiposDAO nuevaBusqueda = new AnticiposDAO();
            nuevaBusqueda.Buscar(Integer.parseInt(vistaAnticipo.txtIdAnticipo.getText()));
        }
        
        if(e.getSource()== vistaAnticipo.btnEliminarAnticipo){
            AnticiposDAO nuevaEliminacion = new AnticiposDAO();
            nuevaEliminacion.eliminar(vistaAnticipo.txtIdAnticipo.getText());
        }
        }
    
}
