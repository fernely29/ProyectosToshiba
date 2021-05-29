package ejercicioconmetodos;

import java.util.Scanner;

public class EjercicioconMetodos {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("Menu Principal");
        System.out.println("1. Operaciones Arimetica");
        System.out.println("2. Condiciones");
        System.out.println("3. Ciclos");
        System.out.println("4. Arreglos");
        System.out.println("5. Matrices");
        System.out.println("6. Fibonacci");
        System.out.println("7. Salir");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Operaciones Aritmeticas");
                System.out.println("Ingrese el primer valor");
                int v1 = entrada.nextInt();
                System.out.println("Ingrese un segundo valor");
                int v2 = entrada.nextInt();
                OperacionesAritmeticas operacion = new OperacionesAritmeticas();
                operacion.suma(v1, v2);
                operacion.resta(v1, v2);
                operacion.multi(v1, v2);
                operacion.division(v1, v2);
                break;
            case 2:
                System.out.println("Opcion Condiciones");
                Condiciones condicion = new Condiciones();
                System.out.println("Ingrese una edad");
                int edad = entrada.nextInt();
                condicion.edad(edad);
                break;
            case 3:
                int opcion2;
                do {
                    System.out.println("Ciclos");
                    System.out.println("1. ciclo for");
                    System.out.println("2. ciclo while");
                    System.out.println("3. regresar");
                    opcion2 = entrada.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.println("Ciclo for");
                            Ciclos for1 = new Ciclos();
                            for1.cicloFor();
                            break;
                        case 2:
                            System.out.println("Ciclos While");
                            Ciclos while1 = new Ciclos();
                            while1.cicloWhile();
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                            break;
                    }
                } while (opcion2 != 3);
            case 4:
                System.out.println("Arreglos");
                System.out.println("Ingrese el tamaño del arreglo");
                int tamaño = entrada.nextInt();
                int valores[] = new int[tamaño];
                Arreglos arre = new Arreglos();
                arre.llenarArreglo(valores);
                arre.mostrarArreglo(valores);
                break;
            case 5:
                System.out.println("Matrices");
                int matriz[][] = new int[3][3];
                Matrices mat = new Matrices();
                mat.llenarMatriz(matriz);
                mat.mostrarMatriz(matriz);
                break;
            case 6:
                Fibonacci fibo = new Fibonacci();
                fibo.mostrarValorInicial();
                break;
            case 7:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        }while(opcion !=7);
    }
}
