package ejercicioconmetodos;

public class OperacionesAritmeticas {

    private int valor1;
    private int valor2;

    public OperacionesAritmeticas() {
    }

    public OperacionesAritmeticas(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void suma(int v1, int v2) {
        int suma1 = v1 + v2;
        System.out.println("El resultado de la suma es: " + suma1);
    }

    public void resta(int v1, int v2) {
        int resta1 = v1 - v2;
        System.out.println("El resultado de la suma es: " + resta1);
    }

    public void multi(int v1, int v2) {
        int multi1 = v1 * v2;
        System.out.println("El resultado de la suma es: " + multi1);
    }

    public void division(int v1, int v2) {
        int div = v1 / v2;
        System.out.println("El resultado de la suma es: " + div);
    }
}
