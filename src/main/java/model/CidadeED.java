package model;

import javax.persistence.*;

@Entity
@Table (name = "CIDADES")
public class CidadeED {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "ID_CIDADE")
	private long id;

	@Column (name = "NOME")
	private String nome;

	@OneToOne
	@JoinColumn (name = "ESTADO",
				referencedColumnName = "ID_ESTADO",
				foreignKey = @ForeignKey(name = "FK_ESTADO_ID_ESTADO"))
	private EstadoED estadoED;

	public CidadeED() {
	}

	public CidadeED(String nome, EstadoED estadoED) {
		this.nome = nome;
		this.estadoED = estadoED;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoED getEstadoED() {
		return estadoED;
	}

	public void setEstadoED(EstadoED estadoED) {
		this.estadoED = estadoED;
	}

	@Override
	public String toString() {
		return "CidadeED{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", estadoED=" + estadoED +
				'}';
	}
}
