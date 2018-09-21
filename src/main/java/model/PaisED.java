package model;

import javax.persistence.*;

@Entity
@Table (name = "PAISES")
public class PaisED {

	@Id
	@GeneratedValue
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
}
