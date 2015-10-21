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
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Joseph
 */
public class ControladorAutos implements ActionListener{
    JDAutoss VistaAutos;
    
    public  ControladorAutos (JDAutoss VistaAutos){
        this.VistaAutos = VistaAutos;
        this.VistaAutos.btnagregar.addActionListener(this);
        this.VistaAutos.btnbuscar.addActionListener(this);
        this.VistaAutos.btneditar.addActionListener(this);
    }
    
     public void actionPerformed(ActionEvent E){
         if (VistaAutos.btnagregar== E.getSource())
         {
             
     AutosDAO nuevoAuto = new AutosDAO();
    nuevoAuto.InsertarAutos(VistaAutos.txtplaca.getText(), Integer.parseInt(VistaAutos.txtmode.getText()), VistaAutos.txttipo.getText(),VistaAutos.txtcolor.getText(),VistaAutos.txtest.getText());
}
         else
             if (VistaAutos.btnbuscar== E.getSource())
  {
 AutosDAO nuevoAuto = new AutosDAO();
         ResultSet datosobtenidos;
         
         datosobtenidos =  nuevoAuto.buscar(Integer.parseInt(VistaAutos.txtdpi.getText()));
         
         try
         {
             if(datosobtenidos.next())
             {
                 VistaAutos.txtplaca.setText(datosobtenidos.getString("placa"));
                 VistaAutos.txtmode.setText(datosobtenidos.getString("modelo"));
                 VistaAutos.txttipo.setText(datosobtenidos.getString("tipo"));
                 VistaAutos.txtcolor.setText(datosobtenidos.getString("color"));
                 
                 VistaAutos.txtest.setText(datosobtenidos.getString("estatus"));
             }
             else JOptionPane.showMessageDialog(null, "NO HAY REGISTROS PARA EL CÓDIGO");
         }
         catch(Exception e)
                 {
                     JOptionPane.showMessageDialog(null, "Hubo un error al obtener los datos"+e);
                 }        // TODO ad
  }
  if (VistaAutos.btneditar== E.getSource())
  {
   AutosDAO nuevoAuto = new AutosDAO();
    String Edicion;
        Edicion = nuevoAuto.editar(VistaAutos.txtdpi.getText(), Integer.parseInt(VistaAutos.txtplaca.getText()), VistaAutos.txtmode.getText(), VistaAutos.txttipo.getText(), VistaAutos.txtcolor.getText(), VistaAutos.txtest.getText());
        
        JOptionPane.showMessageDialog(null, Edicion);
             
     
     
    
     }                        
  }

}
