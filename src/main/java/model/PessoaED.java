package model;

import java.util.Date;

public class PessoaED {

	private String nome;

	private Date dataNascimento;

	private String email;

	private Tipo_PessoaED tipo_PessoaED;

	private EnderecoED enderecoED;

	private TelefoneED telefoneED;

	public PessoaED() {
	}

	public PessoaED(String nome, Date dataNascimento, String email, Tipo_PessoaED tipo_PessoaED, EnderecoED enderecoED, TelefoneED telefoneED) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.tipo_PessoaED = tipo_PessoaED;
		this.enderecoED = enderecoED;
		this.telefoneED = telefoneED;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Tipo_PessoaED getTipo_PessoaED() {
		return tipo_PessoaED;
	}

	public void setTipo_PessoaED(Tipo_PessoaED tipo_PessoaED) {
		this.tipo_PessoaED = tipo_PessoaED;
	}

	public EnderecoED getEnderecoED() {
		return enderecoED;
	}

	public void setEnderecoED(EnderecoED enderecoED) {
		this.enderecoED = enderecoED;
	}

	public TelefoneED getTelefoneED() {
		return telefoneED;
	}

	public void setTelefoneED(TelefoneED telefoneED) {
		this.telefoneED = telefoneED;
	}
}
