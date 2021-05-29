package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.ModeloLogico;
import vista.FrmTraductor;

public class Controlador implements ActionListener{
    FrmTraductor vista = new FrmTraductor();
    ModeloLogico modelo = new ModeloLogico();

    public Controlador(FrmTraductor vista, ModeloLogico modelo) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnTraducir.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
    }
    public void traducir(){
        modelo.setPalabra(vista.jcomboSeleccionar.getSelectedIndex());
        modelo.Traducir();       
    }
    public void limpiar(){
        vista.jcomboSeleccionar.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnTraducir){
            this.traducir();
        }
        else{
           if(e.getSource() == vista.btnLimpiar){
               this.limpiar();
           } 
        }
    }
    
}
