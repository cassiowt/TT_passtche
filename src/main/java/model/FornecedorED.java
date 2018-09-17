package mo

public class FornecedorED extends  {

	private String cnpj;

	private String nomeEmpresa;

	private int percentualComissao;

	private String contaBsncaria;

	public FornecedorED() {
	}

	public FornecedorED(String cnpj, String nomeEmpresa, int percentualComissao, String contaBsncaria) {
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
