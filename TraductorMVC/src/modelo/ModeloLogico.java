package modelo;

import javax.swing.JOptionPane;

public class ModeloLogico {

    public ModeloLogico() {
    }
    private int palabra;

    public int getPalabra() {
        return palabra;
    }

    public void setPalabra(int palabra) {
        this.palabra = palabra;
    }
    public void Traducir(){
                
        switch(palabra){
            case 1:
                JOptionPane.showMessageDialog(null, "Hen");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Chicken");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Pencil");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Eraser");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Ruler");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Book");
                break;
        }              
    }    
}
