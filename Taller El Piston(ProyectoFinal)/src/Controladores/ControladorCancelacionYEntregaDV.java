/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.AutosDAO;
import Modelos.ClientesDAD;
import Vistas.JDCancelacionYEntregaDV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

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
        if(VistaCanYEntDV.BtnBuscarCliente == e.getSource())
        {
            ClientesDAD nuevocliente = null;
            AutosDAO auto = null;
            ResultSet busqueda, busqueda2;
            
            busqueda = nuevocliente.buscar(Integer.parseInt(VistaCanYEntDV.TxtCodigoCliente.getText()));
            busqueda2= auto.buscar(Integer.parseInt(VistaCanYEntDV.TxtCodigoCliente.getText()));
            
            try
            {
                if(busqueda.next())
                {
                VistaCanYEntDV.TxtNombreCliente.setText(busqueda.getString("nombre"));
                VistaCanYEntDV.TxtApellidoCliente.setText(busqueda.getString("apellidos"));
                if(busqueda2.next())
                {
                VistaCanYEntDV.TxtPlacaVehiculo.setText(busqueda.getString("placa"));
                VistaCanYEntDV.TxtTipoVehiculo.setText(busqueda.getString("tipo"));
                VistaCanYEntDV.TxtModeloVehiculo.setText(busqueda.getString("modelo"));
                VistaCanYEntDV.TxtEstatusVehiculo.setText(busqueda.getString("estatus"));
                }
                
                }
            }
            catch(Exception ex)
            {
               JOptionPane.showMessageDialog(VistaCanYEntDV, "Hubo un error al obtener los datos"+ex);         
            }
            
        }
    }
            
    
}
