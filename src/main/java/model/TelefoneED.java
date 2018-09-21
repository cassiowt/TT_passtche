package model;

import javax.persistence.*;

@Entity
@Table(name = "TELEFONES")
public class TelefoneED {

    @Id
    @Column(name = "TELEFONE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

	private String numero;

	private String ddd;

	private TipoTelefoneED tipoTelefoneED;

	public TelefoneED() {
	}

	public TelefoneED(String numero, String ddd, TipoTelefoneED tipoTelefoneED) {
		this.numero = numero;
		this.ddd = ddd;
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

	public TipoTelefoneED getTipoTelefoneED() {
		return tipoTelefoneED;
	}

	public void setTipoTelefoneED(TipoTelefoneED tipoTelefoneED) {
		this.tipoTelefoneED = tipoTelefoneED;
	}
}
