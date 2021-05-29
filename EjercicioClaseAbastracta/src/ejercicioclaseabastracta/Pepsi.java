package ejercicioclaseabastracta;

public class Pepsi extends Trabajador {

    @Override
    public void comision() {
        double comision = sueldo * 0.30;
        double sueldoTotal = comision + sueldo;
    }

    @Override
    public void sueldoAnual() {
        double sueldoAnual = sueldo*12;
        System.out.println("el sueldo Anual es:"+sueldoAnual);
    }
}
