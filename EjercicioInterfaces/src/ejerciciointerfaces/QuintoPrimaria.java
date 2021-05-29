package ejerciciointerfaces;
public class QuintoPrimaria implements Tablas{

    public QuintoPrimaria() {
    }

    public void mostrarTablas() {
        System.out.println("----------Tabla del 9-------------");
        for (int i = 1; i <= 10; i++) {
            int tabla = 9;
            System.out.println(tabla + "*" + i + "=" + tabla * i);
        }
        System.out.println("----------Tabla del 10-------------");
        for (int i = 0; i <= 10; i++) {
            int tabla = 10;
            System.out.println(tabla + "*" + i + "=" + tabla * i);
        }

    }


    public void mostrarAlumnos(int cantidad) {
        System.out.println("La cantidad de alumnos para el grado es: " + cantidad);
    }        
}
