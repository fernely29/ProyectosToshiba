package ejerciciointerfaces;

public class SegundoPrimaria implements Tablas {

    public SegundoPrimaria() {
    }

    @Override
    public void mostrarTablas() {
        System.out.println("----------Tabla del 3-------------");
        for (int i = 1; i <= 10; i++) {
            int tabla = 3;
            System.out.println(tabla + "*" + i + "=" + tabla * i);
        }
        System.out.println("----------Tabla del 4-------------");
        for (int i = 0; i <= 10; i++) {
            int tabla = 4;
            System.out.println(tabla + "*" + i + "=" + tabla * i);
        }

    }

    @Override
    public void mostrarAlumnos(int cantidad) {
        System.out.println("La cantidad de alumnos para el grado es: " + cantidad);
    }

}
