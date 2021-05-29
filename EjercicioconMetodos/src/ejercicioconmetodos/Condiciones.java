package ejercicioconmetodos;

public class Condiciones {

    private int edad;

    public Condiciones() {
    }

    public Condiciones(int edad) {
        this.edad = edad;
    }

    public void edad(int edadPersona) {
        if (edadPersona >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
