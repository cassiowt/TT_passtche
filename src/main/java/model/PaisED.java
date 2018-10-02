package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "PAISES")
public class PaisED implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "ID_PAIS")
	private long id;

	@Column (name = "NOME")
	private String nome;

	public PaisED (){}

	public PaisED(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "PaisED{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				'}';
	}
}
