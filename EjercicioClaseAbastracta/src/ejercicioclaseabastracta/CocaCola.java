package ejercicioclaseabastracta;

public class CocaCola extends Trabajador {

    @Override
    public void comision() {
        double comision = sueldo * 0.20;
        double sueldoTotal = comision + sueldo;
        System.out.println("La comision es de: "+comision);
        System.out.println("El sueldo total es: "+sueldoTotal);
    }

    @Override
    public void sueldoAnual() {
        double sueldoAnual = sueldo*12;
        System.out.println("el sueldo Anual es:"+sueldoAnual);
    }

}
