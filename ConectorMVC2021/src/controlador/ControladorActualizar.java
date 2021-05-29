/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.Frm_Editar;
import vista.Frm_Mostrar;

/**
 *
 * @author FERNE
 */
public class ControladorActualizar implements ActionListener, MouseListener, WindowListener {

    Frm_Editar editar = new Frm_Editar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();

    public ControladorActualizar(Frm_Editar editar, PaisVO pvo, PaisDAO pdao) {
        this.editar = editar;
        this.pvo = pvo;
        this.pdao = pdao;
        editar.btnActualizar.addActionListener(this);
        editar.btnCancelar.addActionListener(this);
        editar.addWindowListener(this);
        editar.tblDatos.addMouseListener(this);
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
        editar.tblDatos.setModel(m);
    }

    private void agregar() {
        int seleccionar;
        seleccionar = editar.tblDatos.getSelectedRow();
        pvo.setId_pais((int) editar.tblDatos.getValueAt(seleccionar, 0));
        editar.txtPais.setText(String.valueOf(editar.tblDatos.getValueAt(seleccionar, 1)));
        editar.txtCapital.setText(String.valueOf(editar.tblDatos.getValueAt(seleccionar, 2)));
        editar.txtPoblacion.setText(String.valueOf(editar.tblDatos.getValueAt(seleccionar, 3)));
    }

    private void modificar() {
        pvo.getId_pais();
        pvo.setNombre_pais(editar.txtPais.getText());
        pvo.setCapital_pais(editar.txtCapital.getText());
        pvo.setPoblacion_pais(Long.parseLong(editar.txtPoblacion.getText()));
        pdao.actualizar(pvo);
    }

    public void limpiar() {
        editar.txtPais.setText("");
        editar.txtCapital.setText("");
        editar.txtPoblacion.setText("");
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == editar.btnActualizar) {
            if (true) {
                this.modificar();
                JOptionPane.showMessageDialog(null, "Datos Modificados correctamente");
                limpiar();
            }

        }
        if (e.getSource() == editar.btnCancelar) {  
            int respuesta = JOptionPane.showConfirmDialog(null, "Desea cancelar la operacion");
            if(respuesta == JOptionPane.YES_NO_OPTION){
                limpiar();
                
            }if(respuesta == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Puede continuar editando");
            }
            
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        agregar();
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

}
