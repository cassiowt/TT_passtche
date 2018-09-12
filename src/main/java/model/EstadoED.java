package model;

public class EstadoED {

	private String nome;

	private String sigla;

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
