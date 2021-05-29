package ejercicioconmetodos;

import java.util.Scanner;

public class Matrices {

    private int mati;

    public Matrices(int mati) {
        this.mati = mati;
    }

    public Matrices() {
    }

    public void llenarMatriz(int a[][]) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Agregar dato");
                a[i][j] = entrada.nextInt();
            }
        }
    }

    public void mostrarMatriz(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
