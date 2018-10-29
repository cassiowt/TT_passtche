package model;


import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name="FORNECEDORES")
public class FornecedorED extends PessoaED {
	@Column(name = "CNPJ", length = 30)
	private String cnpj;

	@Column(name = "NOME_EMPRESA", length = 100)
	private String nomeEmpresa;

	@Column(name = "PERCENTUAL_COMISSAO", length = 2)
	private int percentualComissao;

	@Column(name = "CONTA", length = 11)
	private String contaBancaria;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "ID_TELEFONE",
			referencedColumnName = "ID_TELEFONE",
			foreignKey = @ForeignKey(name = "FK_TELEFONE_ID_TELEFONE_CONTATO"))
	private TelefoneED telefoneContato;

	public TelefoneED getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(TelefoneED telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public FornecedorED() {
	}

	public FornecedorED(String nome, Date dataNascimento, String email, TipoPessoaED tipo_PessoaED, EnderecoED enderecoED, Collection<TelefoneED> telefones, UsuarioED usuarioED,
						String cnpj, String nomeEmpresa, int percentualComissao, String contaBsncaria) {
		super(nome, dataNascimento, email, tipo_PessoaED, enderecoED, telefones, usuarioED);

		this.cnpj = cnpj;
		this.nomeEmpresa = nomeEmpresa;
		this.percentualComissao = percentualComissao;
		this.contaBancaria = contaBsncaria;
	}


	public FornecedorED(String nome, Date dataNascimento, String email, TipoPessoaED tipo_PessoaED, String cnpj, String nomeEmpresa, int percentualComissao, String contaBsncaria) {
		super(nome, dataNascimento, email, tipo_PessoaED);

		this.cnpj = cnpj;
		this.nomeEmpresa = nomeEmpresa;
		this.percentualComissao = percentualComissao;
		this.contaBancaria = contaBsncaria;
	}
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public int getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(int percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	public String getContaBancaria() {
		return contaBancaria;
	}

	public void setContaBancaria(String contaBsncaria) {
		this.contaBancaria = contaBancaria;
	}
}
