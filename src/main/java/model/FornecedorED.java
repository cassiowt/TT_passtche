package model

import java.util.Date;

public class FornecedorED extends PessoaED {

	private String cnpj;

	private String nomeEmpresa;

	private int percentualComissao;

	private String contaBsncaria;

	public FornecedorED() {
	}

	public FornecedorED(String nome, Date dataNascimento, String email, Tipo_PessoaED tipo_PessoaED, EnderecoED enderecoED, TelefoneED telefoneED, String cnpj, String nomeEmpresa, int percentualComissao, String contaBsncaria) {
		super(nome, dataNascimento, email, tipo_PessoaED, enderecoED, telefoneED);
		this.cnpj = cnpj;
		this.nomeEmpresa = nomeEmpresa;
		this.percentualComissao = percentualComissao;
		this.contaBsncaria = contaBsncaria;
	}

	public static void main(String[] args) {
		System.out.println("teste");
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
