/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclaseabastracta;

/**
 *
 * @author Telma Morales
 */
public abstract class Trabajador {

    public String nombre;
    public String apellido;
    public int edad;
    public String direccion;
    public double sueldo;
   
    public abstract void comision();
    public abstract void sueldoAnual();
}
