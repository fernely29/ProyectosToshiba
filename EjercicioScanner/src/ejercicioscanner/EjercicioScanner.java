package ejercicioscanner;

import java.util.Scanner;

public class EjercicioScanner {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre, cadena;
        int edad=0, yearNacimiento;
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        yearNacimiento= 2021-edad;      
       cadena = "El nombre ingresado es: "+nombre+" tiene "+edad+" años de edad y su año de nacimeinto es: "+yearNacimiento;
        System.out.println(cadena);
    }
    
}
