/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelos;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author nitroherman
 */
public class ClientesDAD {
    String dpiclientes;
    String apellidos;
    String nombre;
    String direccion;
    String telefono;
    
    
    Connection Con;
    ResultSet Consulta;
}
