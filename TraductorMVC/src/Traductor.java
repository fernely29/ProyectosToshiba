
import controlador.Controlador;
import modelo.ModeloLogico;
import vista.FrmTraductor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Telma Morales
 */
public class Traductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrmTraductor tr = new FrmTraductor();
        ModeloLogico lg =  new ModeloLogico();
        Controlador c = new Controlador(tr, lg);
        tr.setVisible(true);
    }
    
}
