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
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Joseph
 */
public class ControladorMecanico implements ActionListener{
    JDMecanico VistaMecanico;
    
    public  ControladorMecanico (JDMecanico VistaMecanico){
        this.VistaMecanico = VistaMecanico;
        this.VistaMecanico.btnagregar.addActionListener(this);
        this.VistaMecanico.btnbuscar.addActionListener(this);
        this.VistaMecanico.btneditar.addActionListener(this);
    }
    
     public void actionPerformed(ActionEvent E){
         if (VistaMecanico.btnagregar== E.getSource())
         {
             JOptionPane.showMessageDialog(null, "controlador ON");
     MecanicoDAO nuevoMecanico = new MecanicoDAO();
    nuevoMecanico.InsertarMecanicos(VistaMecanico.txtdpi.getText(), VistaMecanico.txtape.getText(), VistaMecanico.txtnom.getText(),VistaMecanico.txtdire.getText(),VistaMecanico.txttele.getText(),VistaMecanico.txtesp.getText(), VistaMecanico.txtest.getText());
}
  if (VistaMecanico.btnbuscar== E.getSource())
  {
 MecanicoDAO nuevoMecanico = new MecanicoDAO();
         ResultSet datosobtenidos;
         
         datosobtenidos =  nuevoMecanico.buscar(Integer.parseInt(VistaMecanico.txtdpi.getText()));
         
         try
         {
             if(datosobtenidos.next())
             {
                 VistaMecanico.txtape.setText(datosobtenidos.getString("apellidos"));
                 VistaMecanico.txtnom.setText(datosobtenidos.getString("nombre"));
                 VistaMecanico.txtdire.setText(datosobtenidos.getString("direccion"));
                 VistaMecanico.txttele.setText(datosobtenidos.getString("telefono"));
                 VistaMecanico.txtesp.setText(datosobtenidos.getString("especialidad"));
                 VistaMecanico.txtest.setText(datosobtenidos.getString("estatus"));
             }
             else JOptionPane.showMessageDialog(null, "NO HAY REGISTROS PARA EL CÓDIGO");
         }
         catch(Exception e)
                 {
                     JOptionPane.showMessageDialog(null, "Hubo un error al obtener los datos"+e);
                 }        // TODO ad
  }
  if (VistaMecanico.btneditar== E.getSource())
  {
   MecanicoDAO nuevoMecanico = new MecanicoDAO();
    String Edicion;
        Edicion = nuevoMecanico.editar(VistaMecanico.txtdpi.getText(), VistaMecanico.txtape.getText(), VistaMecanico.txtnom.getText(), VistaMecanico.txtdire.getText(), VistaMecanico.txttele.getText(), VistaMecanico.txtesp.getText(), VistaMecanico.txtest.getText());
        
        JOptionPane.showMessageDialog(null, Edicion);  // TODO add your handling code here:
    }                        
  }
}
     
