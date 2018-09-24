package model;


import javax.persistence.*;
import java.util.Date;

@Entity(name = "USUARIOS")
public class UsuarioED {

	@Id
	@Column(name = "ID_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "SENHA")
	private String senha;

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_USUARIO")
	private TipoUsuarioED tipoUsuarioED;

	@JoinColumn(name = "ID_PESSOA",
				referencedColumnName = "ID_PESSOA",
				foreignKey = @ForeignKey(name="FK_PESSOA_ID_PESSOA"))
	@OneToOne
	private PessoaED pessoaED;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_CRIACAO")
	private Date dataCriacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_ALTERACAO")
	private Date dataAlteracao;

	public UsuarioED() {
		this.dataAlteracao = new Date();
		this.dataCriacao = new Date();
	}

	public UsuarioED(String email, String senha, TipoUsuarioED tipoUsuarioED, PessoaED pessoaED) {
		this.email = email;
		this.senha = senha;
		this.tipoUsuarioED = tipoUsuarioED;
		this.pessoaED = pessoaED;
		this.dataAlteracao = new Date();
		this.dataCriacao = new Date();
	}

	public String getEmail() {
		return email;
	}

	public long getId() {
		return id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuarioED getTipoUsuarioED() {
		return tipoUsuarioED;
	}

	public void setTipoUsuarioED(TipoUsuarioED tipoUsuarioED) {
		this.tipoUsuarioED = tipoUsuarioED;
	}

	public PessoaED getPessoaED() {
		return pessoaED;
	}

	public void setPessoaED(PessoaED pessoaED) {
		this.pessoaED = pessoaED;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
}
