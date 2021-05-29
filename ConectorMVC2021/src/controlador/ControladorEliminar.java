/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.Frm_Eliminar;

/**
 *
 * @author FERNE
 */
public class ControladorEliminar implements MouseListener, WindowListener{
    
    Frm_Eliminar vista = new Frm_Eliminar();
    PaisDAO pdao = new PaisDAO();
    PaisVO pvo = new PaisVO();
    
    public ControladorEliminar(Frm_Eliminar vista, PaisDAO pdao, PaisVO pvo){
        this.vista = vista;
        this.pdao = pdao;
        this.pvo = pvo;
        
        vista.addWindowListener(this);
        vista.tblDatos.addMouseListener(this);        
    }
    private void mostrar() {
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnCount(0);
        m.addColumn("ID");
        m.addColumn("Nombre del Pais");
        m.addColumn("Capital del País");
        m.addColumn("Población");

        for (PaisVO pvo : pdao.consultarTabla()) {
            m.addRow(new Object[]{pvo.getId_pais(), pvo.getNombre_pais(), pvo.getCapital_pais(), pvo.getPoblacion_pais()});
        }
        vista.tblDatos.setModel(m);
    }
    private void eliminar(){
        pvo.getId_pais();
        pdao.eliminar(pvo);
    }
    private void seleccionarDato(){
        int fila;
        fila = vista.tblDatos.getSelectedRow();
        pvo.setId_pais((int) vista.tblDatos.getValueAt(fila, 0));
        int dato = vista.jOpcion.showConfirmDialog(null, "Desea eliminar el dato "+String.valueOf(vista.tblDatos.getValueAt(fila, 1)),"",vista.jOpcion.ERROR_MESSAGE);
        if(dato == vista.jOpcion.YES_OPTION){
            this.eliminar();
            vista.jOpcion.showMessageDialog(null, "Datos eliminado exitosamente");
        }else{
            
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getClickCount()==1){
            this.seleccionarDato();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        mostrar();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        mostrar();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}
