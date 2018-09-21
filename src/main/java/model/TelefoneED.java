package model;


import javax.persistence.*;

@Entity(name = "TELEFONES")
public class TelefoneED {

	@Id
	@Column(name = "ID_TELEFONE")
	private String numero;
	@Column (name = "DDD")
	private String ddd;


	private PessoaED pessoaED;

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_TELEFONE")
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
