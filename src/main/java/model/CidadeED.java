package model;

public class CidadeED {

	private String nome;
	private EstadoED estadoED;

	public CidadeED() {
	}

	public CidadeED(String nome, EstadoED estadoED) {
		this.nome = nome;
		this.estadoED = estadoED;
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
}
