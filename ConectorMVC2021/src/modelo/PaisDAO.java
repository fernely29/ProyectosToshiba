package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;

public class PaisDAO implements ConsultasDAO{ 

    @Override
    public void insertar(PaisVO p) {
        Conector c = new Conector();
        try {
            c.conectar();
            String consulta= "INSERT INTO tbl_pais(nombre_pais, capital_pais, poblacion_pais) VALUES ('"+p.getNombre_pais()+"','"+p.getCapital_pais()+"',"+p.getPoblacion_pais()+");";
            c.consultas_multiples(consulta);
        } catch (Exception e) {
            System.err.println("Mensaje Insertar "+e.getMessage());
        }
        c.desconectar();
    }

    @Override
    public void actualizar(PaisVO p) {
        Conector c = new Conector();
        try {
            c.conectar();
            String consulta = "UPDATE tbl_pais SET nombre_pais='"+p.getNombre_pais()+"', capital_pais='"+p.getCapital_pais()+"',"
                    + "poblacion_pais='"+p.getPoblacion_pais()+"' WHERE id='"+p.getId_pais()+"';";
            c.consultas_multiples(consulta);
        } catch (Exception e) {
            System.err.println("Mensaje de Actualizar: "+e.getMessage());
        }
        c.desconectar();
    }

    @Override
    public void eliminar(PaisVO p) {
        Conector c = new Conector();
        try {
            c.conectar();
            String consulta = "DELETE FROM tbl_pais WHERE id='"+p.getId_pais()+"';";
            c.consultas_multiples(consulta);
        } catch (Exception e) {
            System.err.println("Mensaje de Eliminar: "+e.getMessage());
        }
        c.desconectar();
    }

    @Override
    public ArrayList<PaisVO> consultarTabla() {
        Conector c =  new Conector();
        ArrayList<PaisVO> info = new ArrayList<>();
        try {
            c.conectar();
            String consulta= "SELECT *FROM tbl_pais;";
            ResultSet rs = c.consulta_datos(consulta);
            while(rs.next()){
                PaisVO pvo = new PaisVO();
                pvo.setId_pais(rs.getInt(1));
                pvo.setNombre_pais(rs.getString(2));
                pvo.setCapital_pais(rs.getString(3));
                pvo.setPoblacion_pais(rs.getLong(4));
                info.add(pvo);
            }
            c.desconectar();
        } catch (Exception e) {
            System.err.println("Mensaje mostrar Datos: "+e.getMessage());
        }                       
        return info;
    }
    
}
