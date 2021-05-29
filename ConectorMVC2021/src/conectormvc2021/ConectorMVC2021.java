package conectormvc2021;

import controlador.ControladorActualizar;
import controlador.ControladorEliminar;
import controlador.ControladorInsertar;
import controlador.ControladorMenu;
import controlador.ControladorMostrar;
import modelo.Conector;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.Frm_Editar;
import vista.Frm_Eliminar;
import vista.Frm_Insertar;
import vista.Frm_Menu;
import vista.Frm_Mostrar;

public class ConectorMVC2021 {

    public static void main(String[] args) {
        // TODO code application logic here
//        Conector c = new Conector();
//        c.conectar();

//Vistas
        Frm_Menu m = new Frm_Menu();
        Frm_Insertar fi = new Frm_Insertar();
        Frm_Mostrar fm = new Frm_Mostrar();
        Frm_Editar fe = new Frm_Editar();
        Frm_Eliminar feli = new Frm_Eliminar();
        
        //Accesos a los datos
        PaisVO pvo = new PaisVO();
        PaisDAO pdao = new PaisDAO();
        
        //Controladores        
        ControladorMenu cm = new ControladorMenu(m, fi, fm, fe, feli);
        ControladorInsertar ci = new ControladorInsertar(fi, pvo, pdao);
        ControladorMostrar cmo = new ControladorMostrar(fm, pvo, pdao);
        ControladorActualizar cac = new ControladorActualizar(fe, pvo, pdao);
        ControladorEliminar cel = new ControladorEliminar(feli, pdao, pvo);
     
        
        
        m.setVisible(true);
        m.setLocationRelativeTo(null);

    }

}
