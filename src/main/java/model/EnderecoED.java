package model;

import javax.persistence.*;

@Entity
@Table(name = "ENDERECOS")
public class EnderecoED {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID_ENDERECO")
    private long id;

    @Column (name = "RUA")
    private String rua;

    @Column (name = "NUMERO")
    private int numero;

    @Column (name = "COMPLEMENTO")
    private String complemento;

    @Column (name = "CEP")
    private String cep;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_LOGRADOURO")
    private TipoLogradouroED tipoLogradouro;

    @OneToOne
    @JoinColumn (name = "ID_BAIRRO",
                referencedColumnName = "ID_BAIRRO",
                foreignKey = @ForeignKey(name = "FK_BAIRRO_ID_BAIRRO"))
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

    public long getId() {
        return id;
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

    @Override
    public String toString() {
        return "EnderecoED{" +
                "id=" + id +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                ", tipoLogradouro=" + tipoLogradouro +
                ", bairro=" + bairro +
                ", valido=" + valido +
                '}';
    }
}


