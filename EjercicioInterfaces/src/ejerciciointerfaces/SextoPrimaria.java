package ejerciciointerfaces;
public class SextoPrimaria implements Tablas{

    public SextoPrimaria() {
    }

    public void mostrarTablas() {
        System.out.println("----------Tabla del 11-------------");
        for (int i = 1; i <= 10; i++) {
            int tabla = 11;
            System.out.println(tabla + "*" + i + "=" + tabla * i);
        }
        System.out.println("----------Tabla del 12-------------");
        for (int i = 0; i <= 10; i++) {
            int tabla = 12;
            System.out.println(tabla + "*" + i + "=" + tabla * i);
        }

    }


    public void mostrarAlumnos(int cantidad) {
        System.out.println("La cantidad de alumnos para el grado es: " + cantidad);
    }        
}
