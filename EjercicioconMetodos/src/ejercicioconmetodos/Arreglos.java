package ejercicioconmetodos;

import java.util.Scanner;

public class Arreglos {
private int arreglo;

    public Arreglos() {
    }

    public Arreglos(int arreglo) {
        this.arreglo = arreglo;
    }
    public void llenarArreglo(int a[]){
        Scanner entrada = new Scanner(System.in);         
        for (int i = 0; i < a.length; i++) {
            System.out.println("Agregue el valor en la posición: "+i);
            a[i]=entrada.nextInt();
        }
    }
    public void mostrarArreglo(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println("El valor en la posición "+i+" es: "+a[i]);
        }
    }

}
