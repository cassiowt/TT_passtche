package model;

import javax.persistence.*;
import java.util.Date;

@Entity (name = "LOGINS")
public class LoginED {

	@Id
	@Column(name = "ID_LOGIN")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column (name = "DATA_LOGIN")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataLogon;

	@Temporal(TemporalType.TIMESTAMP)
	@Column (name = "DATA_LOGOUT")
	private Date dataLogout;

	@OneToOne
	private UsuarioED usuarioED;

	public LoginED() {
		usuarioED = new UsuarioED();
	}

	public LoginED(Date dataLogon, Date dataLogout, UsuarioED usuarioED) {
		this.dataLogon = dataLogon;
		this.dataLogout = dataLogout;
		this.usuarioED = usuarioED;
	}

	public Date getDataLogon() {
		return dataLogon;
	}

	public void setDataLogon(Date dataLogon) {
		this.dataLogon = dataLogon;
	}

	public Date getDataLogout() {
		return dataLogout;
	}

	public void setDataLogout(Date dataLogout) {
		this.dataLogout = dataLogout;
	}

	public UsuarioED getUsuarioED() {
		return usuarioED;
	}

	public void setUsuarioED(UsuarioED usuarioED) {
		this.usuarioED = usuarioED;
	}

	@Override
	public String toString() {
		return "LoginED{" +
				"id=" + id +
				", dataLogon=" + dataLogon +
				", dataLogout=" + dataLogout +
				", usuarioED=" + usuarioED +
				'}';
	}
}
