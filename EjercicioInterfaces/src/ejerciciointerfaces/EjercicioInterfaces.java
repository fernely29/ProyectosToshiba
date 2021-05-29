package ejerciciointerfaces;

import java.util.Scanner;

public class EjercicioInterfaces {

    public static void main(String[] args) {
        // TODO code application logic here
        PrimeroPrimaria p1 = new PrimeroPrimaria();
        SegundoPrimaria p2 = new SegundoPrimaria();
        TerceroPrimaria p3 = new TerceroPrimaria();
        CuartoPrimaria p4 = new CuartoPrimaria();
        QuintoPrimaria p5 = new QuintoPrimaria();
        SextoPrimaria p6 = new SextoPrimaria();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu Principal");
            System.out.println("1.......Primero Primaria");
            System.out.println("2.......Segundo Primaria");
            System.out.println("3.......Tercero Primaria");
            System.out.println("4.......Cuarto Primaria");
            System.out.println("5.......Quinto Primaria");
            System.out.println("6.......Sexto Primaria");
            System.out.println("7.......Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido a Primero Primaria");
                    System.out.println("Ingrese la cantidad de Alumnos");
                    int cantidad = entrada.nextInt();
                    p1.mostrarAlumnos(cantidad);
                    System.out.println("Las tablas a aprende para el grado son:");
                    p1.mostrarTablas();
                    break;
                case 2:
                    System.out.println("Bienvenido a Segundo Primaria");
                    System.out.println("Ingrese la cantidad de Alumnos");
                    cantidad = entrada.nextInt();
                    p2.mostrarAlumnos(cantidad);
                    System.out.println("Las tablas a aprende para el grado son:");
                    p2.mostrarTablas();
                    break;
                case 3:
                    System.out.println("Bienvenido a Tercero Primaria");
                    System.out.println("Ingrese la cantidad de Alumnos");
                    cantidad = entrada.nextInt();
                    p3.mostrarAlumnos(cantidad);
                    System.out.println("Las tablas a aprende para el grado son:");
                    p3.mostrarTablas();
                    break;
                case 4:
                    System.out.println("Bienvenido a Cuarto Primaria");
                    System.out.println("Ingrese la cantidad de Alumnos");
                    cantidad = entrada.nextInt();
                    p4.mostrarAlumnos(cantidad);
                    System.out.println("Las tablas a aprende para el grado son:");
                    p4.mostrarTablas();
                    break;
                case 5:
                    System.out.println("Bienvenido a Quinto Primaria");
                    System.out.println("Ingrese la cantidad de Alumnos");
                    cantidad = entrada.nextInt();
                    p5.mostrarAlumnos(cantidad);
                    System.out.println("Las tablas a aprende para el grado son:");
                    p5.mostrarTablas();
                    break;
                case 6:
                    System.out.println("Bienvenido a Sexto Primaria");
                    System.out.println("Ingrese la cantidad de Alumnos");
                    cantidad = entrada.nextInt();
                    p6.mostrarAlumnos(cantidad);
                    System.out.println("Las tablas a aprende para el grado son:");
                    p6.mostrarTablas();
                    break;
                case 7:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 7);
    }

}
