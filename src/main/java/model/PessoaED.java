package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "PESSOAS")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PessoaED {


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
	private TipoPessoaED tipo_PessoaED;

	@OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ID_ENDERECO",
            referencedColumnName = "ID_ENDERECO",
            foreignKey = @ForeignKey(name = "FK_ENDERECO_ID_ENDERECO"))
    private EnderecoED enderecoED;

	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name= "ID_PESSOA",
                foreignKey = @ForeignKey(name = "FK_PESSOA_ID_PESSOA"))
	private Collection <TelefoneED> telefones = new ArrayList<TelefoneED>();

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "ID_USUARIO",
			referencedColumnName = "ID_USUARIO",
			foreignKey = @ForeignKey(name = "FK_USUARIO_ID_USUARIO"))
	private UsuarioED usuarioED;

	public PessoaED() {
	}

	public PessoaED(String nome, Date dataNascimento, String email, TipoPessoaED tipo_PessoaED, EnderecoED enderecoED, Collection <TelefoneED> telefones, UsuarioED usuarioED) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.tipo_PessoaED = tipo_PessoaED;
		this.enderecoED = enderecoED;
		this.telefones = telefones;
		this.usuarioED = usuarioED;
	}

	public PessoaED(String nome, Date dataNascimento, String email, TipoPessoaED tipo_PessoaED) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.tipo_PessoaED = tipo_PessoaED;

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

	public TipoPessoaED getTipo_PessoaED() {
		return tipo_PessoaED;
	}

	public void setTipo_PessoaED(TipoPessoaED tipo_PessoaED) {
		this.tipo_PessoaED = tipo_PessoaED;
	}

	public Collection<TelefoneED> getTelefones() {
		return telefones;
	}

	public void setTelefones(Collection<TelefoneED> telefones) {
		this.telefones = telefones;
	}

	public UsuarioED getUsuarioED() {
		return usuarioED;
	}

	public void setUsuarioED(UsuarioED usuarioED) {
		this.usuarioED = usuarioED;
	}

	@Override
	public String toString() {
		return "PessoaED{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", dataNascimento=" + dataNascimento +
				", email='" + email + '\'' +
				", tipo_PessoaED=" + tipo_PessoaED +
				", enderecoED=" + enderecoED +
				", telefones=" + telefones +
				", usuarioED=" + usuarioED +
				'}';
	}
}


