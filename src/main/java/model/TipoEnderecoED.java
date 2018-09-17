package model;

public enum TipoEnderecoED {

	RESIDENCIAL(1, "Residencial"), COMERCIAL(2, "Comercial"), OUTROS(3, "Outros");

	private final int valor;
	private final String descricao;

	TipoEnderecoED(int valorOpcao, String valorDescricao){
		this.valor = valorOpcao;
		this.descricao = valorDescricao; }

	public int getValor(){
		return valor;
	}

	public String getDescricao(){
		return descricao;
	}
	}
