/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Telma Morales
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter("C:\\Users\\Telma Morales\\Desktop\\EjercicoArchivo.doc", true);
            pw = new PrintWriter(fw);
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el su nombre");
            String nombre= entrada.nextLine();
            pw.print(nombre+" ");
            System.out.println("Ingrese su apellido");
            String apellido = entrada.nextLine();
            pw.println(apellido+" ");
            System.out.println("Ingrese una ciudad");
            String ciudad= entrada.nextLine();
            pw.println(ciudad);
            //System.out.println("Recorrido del 0 al 100");
            for (int i = 0; i < 100; i++) {
                pw.print(i+", ");                
            }
            System.out.println("Arreglo de dimension 5");
            double []valores = new double[10];
            for (int i = 0; i < 10; i++) {
                System.out.println("Ingrese el valor para posicion "+(i+1));
                valores[i]=entrada.nextInt();
            }
            for (int i = 0; i < 10; i++) {
                pw.println("Valor en la posición "+(i+1)+": "+valores[i]);
            }
            System.out.println("Matriz de 6X6");
            String matriz[][] = new String[6][6];
            for (int i = 0; i <matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println("Ingrese el dato para la posición "+matriz[i][j]);
                    matriz[i][j] = entrada.nextLine();
                }
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j <matriz[i].length; j++) {
                    pw.print(matriz[i][j]+"|");
                }
                pw.println();
            }
            fw.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        
        File archivo;
        FileReader fr;
        BufferedReader br;
        try {
             archivo = new File("C:\\Users\\Telma Morales\\Desktop\\EjercicoArchivo.doc");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
             String lineas;
            while((lineas = br.readLine())!=null){
                System.out.println(lineas);
            }
        } catch (Exception ex) {
              System.err.println(ex);
        }
        
    }
    
}
