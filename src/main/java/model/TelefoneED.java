package model;

import javax.persistence.*;

@Entity
@Table(name = "TELEFONES")
public class TelefoneED {

	@Id
    @Column(name = "ID_TELEFONE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

	@Column(name = "NUMERO")
	private String numero;

	@Column (name = "DDD")
	private String ddd;


	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_TELEFONE")

	private TipoTelefoneED tipoTelefoneED;

	public TelefoneED() {
	}

	public TelefoneED(String numero, String ddd, TipoTelefoneED tipoTelefoneED) {
		this.numero = numero;
		this.ddd = ddd;
		this.tipoTelefoneED = tipoTelefoneED;
	}

    public long getId() {
        return id;
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

	@Override
	public String toString() {
		return
				"DDD:"+ ddd + " Numero:" + numero + " - " + tipoTelefoneED ;
	}
}
