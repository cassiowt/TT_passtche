package model;

public enum TipoLogradouroED {

	AVENIDA(1), RUA(2), TRAVESSA(3);

	private final int valor;

	TipoLogradouroED(int valorOpcao){
		this.valor = valorOpcao;
	}
	public int getValor(){
		return valor;
	}

}
