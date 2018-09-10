package model;

public class EnderecoED {

    private String rua;

    private int numero;

    private String complemento;

    private String cep;

    private TipoLogradouroED tipoLogradouro;

    private BairroED bairro;


    public void setRua(String rua) {
        this.rua = rua;}
    public String getRua() {
        return this.rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;

    }

    public int getNumero() {
        return this.numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return this.cep;
    }

    public TipoLogradouroED getTipoLogradouro() {
        return this.tipoLogradouro;
    }

    public BairroED getBairro() {
        return this.bairro;
    }

    public void setTipoLogradouro(TipoLogradouroED tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;}

    public void setBairro(BairroED bairro) {
        this.bairro = bairro;}
}
