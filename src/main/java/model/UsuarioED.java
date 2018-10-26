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

	public UsuarioED(String email, String senha, TipoUsuarioED tipoUsuarioED) {
		this.email = email;
		this.senha = senha;
		this.tipoUsuarioED = tipoUsuarioED;
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

	@Override
	public String toString() {
		return "UsuarioED{" +
				"id=" + id +
				", email='" + email + '\'' +
				", senha='" + senha + '\'' +
				", tipoUsuarioED=" + tipoUsuarioED +
				", dataCriacao=" + dataCriacao +
				", dataAlteracao=" + dataAlteracao +
				'}';
	}
}
