package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "PESSOAS")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PessoaED implements Serializable {

	@Id
	@Column(name = "ID_PESSOA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column (name = "NOME")
	private String nome;

	@Column (name = "NASCIMENTO")
	@Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;

	@Column (name = "EMAIL")
	private String email;
       
        @Column (name = "SENHA")
	private String senha;

	@OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ID_ENDERECO",
            referencedColumnName = "ID_ENDERECO",
            foreignKey = @ForeignKey(name = "FK_ENDERECO_ID_ENDERECO"))
    private EnderecoED enderecoED;

	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name= "ID_PESSOA",
                foreignKey = @ForeignKey(name = "FK_PESSOA_ID_PESSOA"))
	private Collection <TelefoneED> telefones = new ArrayList<TelefoneED>();

	public PessoaED() {
		telefones = new ArrayList<TelefoneED>();
	}

    public PessoaED(long id, String nome, Date dataNascimento, String email, String senha, boolean status, EnderecoED enderecoED) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.enderecoED = enderecoED;
    }    
        

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

	public String getNome() {
		return nome;
	}

	public long getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<TelefoneED> getTelefones() {
		return telefones;
	}

	public void setTelefones(Collection<TelefoneED> telefones) {
		this.telefones = telefones;
	}

    public EnderecoED getEnderecoED() {
        return enderecoED;
    }

    public void setEnderecoED(EnderecoED enderecoED) {
        this.enderecoED = enderecoED;
    }

    @Override
	public String toString() {
		return "PessoaED{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", dataNascimento=" + dataNascimento +
				", email='" + email + '\'' +
                                ", senha='" + "*****" + '\'' +
				", enderecoED=" + enderecoED +
				", telefones=" + telefones +
				'}';
	}
}


