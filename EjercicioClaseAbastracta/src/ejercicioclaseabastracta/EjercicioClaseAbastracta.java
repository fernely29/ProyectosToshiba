package ejercicioclaseabastracta;

import java.util.Scanner;

public class EjercicioClaseAbastracta {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;        
        Trabajador empleadoCoca= new CocaCola();
        Trabajador empleadoPepsi = new Pepsi();
        Trabajador empleadoBig = new BigCola();
        
        do{
        System.out.println("Seleccione la empresa:");
        System.out.println("1.......Empresa CocaCola");
        System.out.println("2.......Empresa Pepsi");        
        System.out.println("3.......Empresa BigCola");
        System.out.println("4.......Salir");
        opcion= entrada.nextInt();
        switch(opcion){
            case 1:                       
                System.out.println("Empresa CocaCola");
                System.out.println("Ingrese Nombre del Empleado");
                empleadoCoca.nombre=entrada.next();
                System.out.println("Ingrese su apellido");
                empleadoCoca.apellido=entrada.next();
                System.out.println("Ingrese su edad");
                empleadoCoca.edad=entrada.nextInt();
                System.out.println("Ingrese su direccion");
                empleadoCoca.direccion=entrada.next();
                System.out.println("Ingrese su sueldo");
                empleadoCoca.sueldo=entrada.nextDouble();
                
                System.out.println("---------Datos Ingresado y sus Calculos son:--------------");
                System.out.println("El nombre del Empleado: "+empleadoCoca.nombre+" "+empleadoCoca.apellido);
                System.out.println("La edad del empleado es: "+empleadoCoca.edad);
                System.out.println("La direccion del empleado es: "+empleadoCoca.direccion);
                System.out.println("Su sueldo es de: "+empleadoCoca.sueldo);
                empleadoCoca.sueldoAnual();
                empleadoCoca.comision();
                
                break;
            case 2:
                System.out.println("Empresa Pepsi");                
                System.out.println("Ingrese Nombre del Empleado");
                empleadoPepsi.nombre=entrada.next();
                System.out.println("Ingrese su apellido");
                empleadoPepsi.apellido=entrada.next();
                System.out.println("Ingrese su edad");
                empleadoPepsi.edad=entrada.nextInt();
                System.out.println("Ingrese su direccion");
                empleadoPepsi.direccion=entrada.next();
                System.out.println("Ingrese su sueldo");
                empleadoPepsi.sueldo=entrada.nextDouble();
                
                System.out.println("---------Datos Ingresado y sus Calculos son:--------------");
                System.out.println("El nombre del Empleado: "+empleadoPepsi.nombre+" "+empleadoPepsi.apellido);
                System.out.println("La edad del empleado es: "+empleadoPepsi.edad);
                System.out.println("La direccion del empleado es: "+empleadoPepsi.direccion);
                System.out.println("Su sueldo es de: "+empleadoPepsi.sueldo);
                empleadoPepsi.sueldoAnual();
                empleadoPepsi.comision();
                break;            
            case 3:
                System.out.println("Empresa BigCola");                
                System.out.println("Ingrese Nombre del Empleado");
                empleadoBig.nombre=entrada.next();
                System.out.println("Ingrese su apellido");
                empleadoBig.apellido=entrada.next();
                System.out.println("Ingrese su edad");
                empleadoBig.edad=entrada.nextInt();
                System.out.println("Ingrese su direccion");
                empleadoBig.direccion=entrada.next();
                System.out.println("Ingrese su sueldo");
                empleadoBig.sueldo=entrada.nextDouble();
                
                System.out.println("---------Datos Ingresado y sus Calculos son:--------------");
                System.out.println("El nombre del Empleado: "+empleadoBig.nombre+" "+empleadoBig.apellido);
                System.out.println("La edad del empleado es: "+empleadoBig.edad);
                System.out.println("La direccion del empleado es: "+empleadoBig.direccion);
                System.out.println("Su sueldo es de: "+empleadoBig.sueldo);
                empleadoBig.sueldoAnual();
                empleadoBig.comision();
                break;
            case 4:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opcion Incorrecta");
                break;
        }
        }while(opcion!=4);
    }
    
}
