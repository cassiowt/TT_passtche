package model;

import java.util.Date;

public class LoginED {

	private Date dataLogon;

	private Date dataLogout;

	private UsuarioED usuarioED;

	public LoginED() {

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
}
