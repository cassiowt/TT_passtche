package model;

import javax.persistence.*;

@Entity
@Table (name = "ESTADOS")
public class EstadoED {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "ID_ESTADO")
	private long id;

	@Column (name = "NOME")
	private String nome;

	@Column (name = "SIGLA")
	private String sigla;

	@OneToOne
	@JoinColumn (name = "PAIS",
			referencedColumnName = "ID_PAIS",
			foreignKey = @ForeignKey(name = "FK_PAIS_ID_PAIS"))
	private PaisED paisED;

	public EstadoED(){

	}

	public EstadoED(String nome, String sigla, PaisED paisED) {
		this.nome = nome;
		this.sigla = sigla;
		this.paisED = paisED;
	}

	public String getNome() {
		return this.nome;
	}

	public String getSigla() {

		return this.sigla;
	}

	public PaisED getPaisED() {

		return this.paisED;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public void setSigla(String sigla) {

		this.sigla = sigla;
	}

	public void setPaisED(PaisED paisED) {

		this.paisED = paisED;
	}
}
