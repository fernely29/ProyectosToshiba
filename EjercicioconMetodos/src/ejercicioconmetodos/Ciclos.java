package ejercicioconmetodos;

public class Ciclos {

    private int i;

    public Ciclos() {
    }

    public Ciclos(int i) {
        this.i = i;
    }

    public void cicloFor() {
        for (i = 1; i <= 10; ++i) {
            System.out.println(i);
        }
    }

    public void cicloWhile() {
        int contador=2;
        while (contador <= 10) {            
            System.out.println(contador);
            contador= contador+2;
        }
    }
}
