package model;

public class EnderecoED {

    private String rua;

    private int numero;

    private String complemento;

    private String cep;

    private TipoLogradouroED tipoLogradouro;

    private BairroED bairro;

    private boolean valido;


    public EnderecoED() {
    }

    public EnderecoED(String rua, int numero, String complemento, String cep, TipoLogradouroED tipoLogradouro, BairroED bairro, boolean valido) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.tipoLogradouro = tipoLogradouro;
        this.bairro = bairro;
        this.valido = valido;
    }

    public EnderecoED(String rua) {
        this.rua = rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

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
        this.tipoLogradouro = tipoLogradouro;
    }

    public void setBairro(BairroED bairro) {
        this.bairro = bairro;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }
}


