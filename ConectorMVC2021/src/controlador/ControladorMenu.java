
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Frm_Editar;
import vista.Frm_Eliminar;
import vista.Frm_Insertar;
import vista.Frm_Menu;
import vista.Frm_Mostrar;

public class ControladorMenu implements ActionListener{
    Frm_Menu vMe = new Frm_Menu();
    Frm_Insertar vIn = new Frm_Insertar();
    Frm_Mostrar vMo = new Frm_Mostrar();
    Frm_Editar vEd = new Frm_Editar();
    Frm_Eliminar vEl = new Frm_Eliminar();
    
    public ControladorMenu(Frm_Menu vMe, Frm_Insertar VIn, Frm_Mostrar vMo, Frm_Editar vEd, Frm_Eliminar vEl){
        this.vMe = vMe;
        this.vIn = VIn;
        this.vMo = vMo;
        this.vEd = vEd;
        this.vEl = vEl;
        //Esto es solo una prueba!!!
        
        vMe.btnInsertar.addActionListener(this);
        vMe.btnMostrar.addActionListener(this);
        vMe.btnActualizar.addActionListener(this);
        vMe.btnEliminar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vMe.btnInsertar){
            vIn.setVisible(true);
            vIn.setLocationRelativeTo(null);
        } 
        if(e.getSource()== vMe.btnMostrar){
            vMo.setVisible(true);
            vMo.setLocationRelativeTo(null);
        }
        if(e.getSource() == vMe.btnActualizar){
            vEd.setVisible(true);
            vEd.setLocationRelativeTo(null);
        }
        if(e.getSource()== vMe.btnEliminar){
            vEl.setVisible(true);
            vEl.setLocationRelativeTo(null);
        }
    }
    
}
