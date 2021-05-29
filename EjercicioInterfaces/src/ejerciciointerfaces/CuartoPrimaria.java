package ejerciciointerfaces;
public class CuartoPrimaria implements Tablas{

    public CuartoPrimaria() {
    }

    public void mostrarTablas() {
        System.out.println("----------Tabla del 7-------------");
        for (int i = 1; i <= 10; i++) {
            int tabla = 7;
            System.out.println(tabla + "*" + i + "=" + tabla * i);
        }
        System.out.println("----------Tabla del 8-------------");
        for (int i = 0; i <= 10; i++) {
            int tabla = 8;
            System.out.println(tabla + "*" + i + "=" + tabla * i);
        }

    }


    public void mostrarAlumnos(int cantidad) {
        System.out.println("La cantidad de alumnos para el grado es: " + cantidad);
    }    
}
