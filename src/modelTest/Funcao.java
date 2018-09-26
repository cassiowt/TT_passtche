package modelTest;

public class Funcao {

    private int valorA, ValorB, ValorC;

    public Funcao() {
    }

    public Funcao(int valorA, int valorB, int valorC) {
        this.valorA = valorA;
        this.ValorB = valorB;
        this.ValorC = valorC;
    }

    public int getValorA() {
        return valorA;
    }

    public int getValorB() {
        return ValorB;
    }

    public int getValorC() {
        return ValorC;
    }

    @Override
    public String toString() {
        return "Funcao = " +
                 valorA + "Xˆ2" +
                " + " + ValorB + "X" +
                " + " + ValorC ;
    }
}
