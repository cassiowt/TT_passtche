package model;

public class TelefoneED {

	private String numero;

	private String ddd;

	private PessoaED pessoaED;

	private TipoTelefoneED tipoTelefoneED;

	public TelefoneED() {
	}

	public TelefoneED(String numero, String ddd, PessoaED pessoaED, TipoTelefoneED tipoTelefoneED) {
		this.numero = numero;
		this.ddd = ddd;
		this.pessoaED = pessoaED;
		this.tipoTelefoneED = tipoTelefoneED;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public PessoaED getPessoaED() {
		return pessoaED;
	}

	public void setPessoaED(PessoaED pessoaED) {
		this.pessoaED = pessoaED;
	}

	public TipoTelefoneED getTipoTelefoneED() {
		return tipoTelefoneED;
	}

	public void setTipoTelefoneED(TipoTelefoneED tipoTelefoneED) {
		this.tipoTelefoneED = tipoTelefoneED;
	}
}
