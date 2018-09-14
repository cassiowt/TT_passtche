package model;

public enum TipoLogradouroED {

	ROTA(4, "Rota"), AVENIDA(1, "Av."), RUA(2, "Rua"), TRAVESSA(3, "Travessa");


	private final int valor;
	private final String descricao;




	TipoLogradouroED(int valorOpcao, String valorDescricao){
		this.valor = valorOpcao;
		this.descricao = valorDescricao;
	}
	public int getValor(){
		return valor;
	}

	public String getDescricao(){
		return descricao;
	}

}
