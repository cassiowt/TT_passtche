package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


@Entity (name = "PESSOAS")
@Inheritance(strategy=InheritanceType.JOINED)
public class PessoaED {

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

	@Column (name = "TIPO_PESSOA")
	@Enumerated(EnumType.STRING)
	private Tipo_PessoaED tipo_PessoaED;

    @JoinColumn(name = "ID_ENDERECO",
            referencedColumnName = "ID_ENDERECO",
            foreignKey = @ForeignKey(name = "FK_ENDERECO_ID_ENDERECO"))
	@OneToOne
    private EnderecoED enderecoED;

	@OneToMany (cascade={CascadeType.ALL})
	@JoinColumn(name= "ID_PESSOA",
                foreignKey = @ForeignKey(name = "FK_PESSOA_ID_PESSOA"))
	private Collection <TelefoneED> telefones = new ArrayList<TelefoneED>();

	public PessoaED() {
	}

	public PessoaED(String nome, Date dataNascimento, String email, Tipo_PessoaED tipo_PessoaED, EnderecoED enderecoED) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.tipo_PessoaED = tipo_PessoaED;
		this.enderecoED = enderecoED;

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

	public Tipo_PessoaED getTipo_PessoaED() {
		return tipo_PessoaED;
	}

	public void setTipo_PessoaED(Tipo_PessoaED tipo_PessoaED) {
		this.tipo_PessoaED = tipo_PessoaED;
	}

	public EnderecoED getEnderecoED() {
		return enderecoED;
	}

	public void setEnderecoED(EnderecoED enderecoED) {
		this.enderecoED = enderecoED;
	}

	}

