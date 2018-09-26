package modelTest;

public class Baskara {

    private Funcao funcao;

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public float caculaDelta() {
        return (funcao.getValorB()*funcao.getValorB())
                - 4 * funcao.getValorA()
                 * funcao.getValorC();
    }
}
