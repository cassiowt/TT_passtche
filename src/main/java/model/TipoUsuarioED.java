package model;

public enum  TipoUsuarioED {

	ADMIN(4, "Administrador"), VISITANTE(1, "Visitante"), CLIENTE(2, "Cliante"), FORNECEDOR(3, "Fornecedor");


	private final int valor;
	private final String descricao;


	TipoUsuarioED(int valorOpcao, String valorDescricao){
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
