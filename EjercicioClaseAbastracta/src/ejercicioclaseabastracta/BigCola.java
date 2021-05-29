package ejercicioclaseabastracta;
public class BigCola extends Trabajador{

    @Override
    public void comision() {
        double comision = sueldo*0.25;
            double sueldoTotal= comision+sueldo;
    }

    @Override
    public void sueldoAnual() {
        double sueldoAnual = sueldo*12;
        System.out.println("el sueldo Anual es:"+sueldoAnual);
    }
    
}
