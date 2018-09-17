package model;

public class UsuarioED {

	private String email;

	private String senha;

	private TipoUsuarioED tipoUsuarioED;

	private PessoaED pessoaED;

	public UsuarioED() {
	}

	public UsuarioED(String email, String senha, TipoUsuarioED tipoUsuarioED, PessoaED pessoaED) {
		this.email = email;
		this.senha = senha;
		this.tipoUsuarioED = tipoUsuarioED;
		this.pessoaED = pessoaED;
	}

	public String getEmail() {
		return email;
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
}
