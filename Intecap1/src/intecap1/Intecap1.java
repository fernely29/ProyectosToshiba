/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intecap1;

import java.util.Scanner;

/**
 *
 * @author Telma Morales
 */
public class Intecap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*   int variableA=1, variableB=12, variableC=29, variableD=49, variableE=30, variableF=3;
        String cadenaA="Hola", cadenaB="Adios", cadenaC="JAVA", cadenaD="Mundo", cadenaE="Intecap", cadenaF="Android";
        System.out.println(variableA+" "+variableB+" "+variableC+" "+variableD+" "+variableE+" "+variableF);
        System.out.println(cadenaA+" "+cadenaD+" "+cadenaC+" "+cadenaE+" "+cadenaF+" "+cadenaB);
        
        byte variable1=1;
        short variable =2;
        int entero= 100;
        long largo=1000;
        float flotante= 45;
        double decimal = 4.3;
        char caracter = 'A';
        boolean logico= false;
        System.out.println(variable1);
        System.out.println(variable);
        System.out.println(entero);
        System.out.println(largo);
        System.out.println(flotante);
        System.out.println(decimal);
        System.out.println(caracter);
        System.out.println(logico);
        
        int suma, resta, multi, division, valor1=10, valor2=5, residuo;
        suma= valor1+valor2;
        resta= valor1-valor2;
        multi= valor1*valor2;
        division= valor1/valor2;
        residuo=valor1%valor2;
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La division es: "+division);
        System.out.println("La multiplicacion es: "+multi);
        System.out.println("El residuo es: "+residuo);*/
     Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
while (num != 0) {
            if (num > 0) {
                System.out.println("POSITIVO");
            } else {
                System.out.println("NEGATIVO");
            }
}
        System.out.println("Fin del WHILE");
    }
    
}
