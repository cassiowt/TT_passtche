package model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "CLIENTES")
public class ClienteED extends PessoaED {



	@Column (name = "CPF", length = 11)
	private String cpf;
	@Column (name = "HOBBY", length = 300)
	private String hobby;
	@Column (name = "CARTAO", length = 16)
	private String cartao;


	public ClienteED() {
	}


	public ClienteED(String nome, Date dataNascimento, String email, Tipo_PessoaED tipo_PessoaED, EnderecoED enderecoED, TelefoneED telefoneED, String cpf, String hobby, String cartao) {
		super(nome, dataNascimento, email, tipo_PessoaED, enderecoED);
		this.cpf = cpf;
		this.hobby = hobby;
		this.cartao = cartao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public ClienteED(String cartao) {
		this.cartao = cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
}
