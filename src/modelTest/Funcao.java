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

    @Override
    public String toString() {
        return "Funcao{" +
                "valorA=" + valorA +
                ", ValorB=" + ValorB +
                ", ValorC=" + ValorC +
                '}';
    }
}
