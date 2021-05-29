/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasedate;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Telma Morales
 */
public class ClaseDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date fecha = new Date();                    
        System.out.println("Año: "+(fecha.getYear()+1900));
        System.out.println("Mes: "+(fecha.getMonth()+1));
        System.out.println("Dia: "+fecha.getDate());
        
        
        
         Date fecha2 = new Date(121, 5, 3);
        System.out.println(fecha);
        System.out.println(fecha2);
        
        
        
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        System.out.println("La fecha actual es: "+formatoFecha.format(fecha));
        System.out.println("La hora actual es: "+formatoHora.format(fecha));
        
        
        
    }
    
}
