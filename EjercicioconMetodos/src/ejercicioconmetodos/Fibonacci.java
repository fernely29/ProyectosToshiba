package ejercicioconmetodos;
public class Fibonacci {
    private int serie;
    private int valor1;
    private int valor2;
    private int suma;

    public Fibonacci() {
    }

    public Fibonacci(int serie, int valor1, int valor2, int suma) {
        this.serie = serie;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.suma = suma;
    }
    public void mostrarValorInicial(){
        System.out.println(valor1);
        serie=10;
        suma =1;
        valor2=1;
        for (int i = 0; i < serie; i++) {
            System.out.println(suma);
            suma= valor1+valor2;
            valor1= valor2;
            valor2=suma;
        }
    }
}
