package model;

public enum TipoEventoED {

	FUTEBOL(1),CINEMA(2), TEATRO(3),SHOW(4);

    private int valor;

	TipoEventoED(int valorOpcao) {
		this.valor = valorOpcao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}