package ejerciciointerfaces;

public class TerceroPrimaria implements Tablas{

    public TerceroPrimaria() {
    }

    
    public void mostrarTablas() {
        System.out.println("----------Tabla del 5-------------");
        for (int i = 1; i <= 10; i++) {
            int tabla = 5;
            System.out.println(tabla + "*" + i + "=" + tabla * i);
        }
        System.out.println("----------Tabla del 6-------------");
        for (int i = 0; i <= 10; i++) {
            int tabla = 6;
            System.out.println(tabla + "*" + i + "=" + tabla * i);
        }

    }

  
    public void mostrarAlumnos(int cantidad) {
        System.out.println("La cantidad de alumnos para el grado es: " + cantidad);
    }
}
