package model;

public class ImagemED {

	private String endereco;

	private int tamanho;

	public ImagemED() {
	}

	public ImagemED(String endereco, int tamanho) {
		this.endereco = endereco;
		this.tamanho = tamanho;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}
