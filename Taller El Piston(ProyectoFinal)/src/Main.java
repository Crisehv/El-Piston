
import Controladores.*;
import Vistas.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Criss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFPantallaPrincipal frmPantallaPrincipal = new JFPantallaPrincipal();
        ControladorPantallaPrincipal ControladorPrincipal = new ControladorPantallaPrincipal(frmPantallaPrincipal);
        frmPantallaPrincipal.setExtendedState(frmPantallaPrincipal.MAXIMIZED_BOTH);
        frmPantallaPrincipal.setVisible(true);
        // TODO code application logic here
    }
    
}