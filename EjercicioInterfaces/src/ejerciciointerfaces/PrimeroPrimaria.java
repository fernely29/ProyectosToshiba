package ejerciciointerfaces;

public class PrimeroPrimaria implements Tablas{  
    public PrimeroPrimaria() {
    }
public void mostrarAlumnos(int cantidad){
    System.out.println("La cantidad de alumnos para el grado es: "+cantidad);    
}
    public void mostrarTablas() {        
        System.out.println("----------Tabla del 1-------------");
        for (int i = 1; i <=10; i++) {
            int tabla=1;
            System.out.println(tabla+"*"+i+"="+tabla*i);            
        }
        System.out.println("----------Tabla del 2-------------");
        for (int i = 0; i <=10; i++) {
            int tabla= 2;
            System.out.println(tabla+"*"+i+"="+tabla*i);            
        }
    }        
}
