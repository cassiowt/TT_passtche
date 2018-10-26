package model;

import javax.persistence.*;

@Entity
@Table (name = "IMAGENS")
public class ImagemED {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "ID_IMAGEM")
	private long id;

	@Column (name = "ENDERECO")
	private String endereco;

	@Column (name = "TAMANHO")
	private int tamanho;

	public ImagemED() { }

	public ImagemED(String endereco, int tamanho) {
		this.endereco = endereco;
		this.tamanho = tamanho; }

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
