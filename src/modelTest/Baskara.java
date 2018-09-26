package modelTest;

public class Baskara {

    private Funcao funcao;

    public Baskara() {
    }

    public Baskara(Funcao funcao) {
        this.funcao = funcao;
    }

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

    public float caculaRaizUm() {
         return (-funcao.getValorB() + this.caculaDelta())/
                   2*funcao.getValorA();
    }

    public float caculaRaizDois() {
         return (-funcao.getValorB() - this.caculaDelta())/
                   2*funcao.getValorA();
    }
}
