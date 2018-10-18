package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name="CLIENTES")
public class ClienteED extends PessoaED {

	@Column (name = "CPF", length = 11)
	private String cpf;
	@Column (name = "HOBBY", length = 300)
	private String hobby;
	@Column (name = "CARTAO", length = 16)
	private String cartao;


	public ClienteED() {
	}

	public ClienteED(String nome, Date dataNascimento, String email, TipoPessoaED tipo_PessoaED, EnderecoED enderecoED, Collection<TelefoneED> telefones, String cpf, String hobby, String cartao) {
		super(nome, dataNascimento, email, tipo_PessoaED, enderecoED, telefones);
		this.cpf = cpf;
		this.hobby = hobby;
		this.cartao = cartao;
	}

	public ClienteED(String nome, Date dataNascimento, String email, TipoPessoaED tipo_PessoaED, String cpf, String hobby, String cartao) {
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

	@Override
	public String toString() {
		return "ClienteED{" +
				"cpf='" + cpf + '\'' +
				", hobby='" + hobby + '\'' +
				", cartao='" + cartao + '\'' +
				"} " + super.toString();
	}
}
