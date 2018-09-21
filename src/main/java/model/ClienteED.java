package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="CLIENTES")
public class ClienteED extends PessoaED {

	@Column(name = "CPF", length = 11)
	private String cpf;

	private String hobby;

	private String cartao;


	public ClienteED() {
	}


	public ClienteED(String nome, Date dataNascimento, String email, Tipo_PessoaED tipo_PessoaED, String cpf, String hobby, String cartao) {
		super(nome, dataNascimento, email, tipo_PessoaED);
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
