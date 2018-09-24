package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
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
	private String contaBsncaria;

	public FornecedorED() {
	}

	public FornecedorED(String nome, Date dataNascimento, String email, Tipo_PessoaED tipo_PessoaED, EnderecoED enderecoED, Collection<TelefoneED> telefones, String cnpj, String nomeEmpresa, int percentualComissao, String contaBsncaria) {
		super(nome, dataNascimento, email, tipo_PessoaED, enderecoED, telefones);

		this.cnpj = cnpj;
		this.nomeEmpresa = nomeEmpresa;
		this.percentualComissao = percentualComissao;
		this.contaBsncaria = contaBsncaria;
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

	public String getContaBsncaria() {
		return contaBsncaria;
	}

	public void setContaBsncaria(String contaBsncaria) {
		this.contaBsncaria = contaBsncaria;
	}
}
