package ejemplomvc;
import controlador.Controlador;
import vista.Frm_Operaciones;
import modelo.ModeloLogica;
public class EjemploMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frm_Operaciones op = new Frm_Operaciones();
        ModeloLogica ml = new ModeloLogica();
        Controlador c= new Controlador(op, ml);
        op.setVisible(true);
    }
    
}
