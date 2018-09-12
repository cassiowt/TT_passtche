package model;

public class BairroED {

    private String nome;

    private CidadeED cidadeED;

    public BairroED() { }

    public BairroED(String nome, CidadeED cidadeED) {
        this.nome = nome;
        this.cidadeED = cidadeED;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CidadeED getCidadeED() {
        return cidadeED;
    }

    public void setCidadeED(CidadeED cidadeED) {
        this.cidadeED = cidadeED;
    }
}


