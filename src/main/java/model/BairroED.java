package model;

import javax.persistence.*;

@Entity
@Table (name = "BAIRROS")
public class BairroED {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_BAIRRO")
    private long id;

    @Column (name = "NOME" )
    private String nome;

    @OneToOne
    @JoinColumn (name = "CIDADE",
                referencedColumnName = "ID_CIDADE",
                foreignKey = @ForeignKey(name = "FK_CIDADE_ID_CIDADE"))
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


