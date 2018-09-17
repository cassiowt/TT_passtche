package model;

import java.util.Date;

public class VendaED {

	private Date dataVenda;

	private int quantidadeVenda;

	private double valorTotalVenda;

	private ClienteED cliente;

	private IngressoED ingressoED;

	private ProdutoED produtoED;

	public VendaED() {
	}

    public VendaED(Date dataVenda, int quantidadeVenda, double valorTotalVenda, ClienteED cliente, IngressoED ingressoED, ProdutoED produtoED) {
        this.dataVenda = dataVenda;
        this.quantidadeVenda = quantidadeVenda;
        this.valorTotalVenda = valorTotalVenda;
        this.cliente = cliente;
        this.ingressoED = ingressoED;
        this.produtoED = produtoED;
    }

    public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public int getQuantidadeVenda() {
		return quantidadeVenda;
	}

	public void setQuantidadeVenda(int quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}

	public double getValorTotalVenda() {
		return valorTotalVenda;
	}

	public void setValorTotalVenda(double valorTotalVenda) {
		this.valorTotalVenda = valorTotalVenda;
	}

	public ClienteED getCliente() {
		return cliente;
	}

	public void setCliente(ClienteED cliente) {
		this.cliente = cliente;
	}

	public IngressoED getIngressoED() {
		return ingressoED;
	}

	public void setIngressoED(IngressoED ingressoED) {
		this.ingressoED = ingressoED;
	}

	public ProdutoED getProdutoED() {
		return produtoED;
	}

	public void setProdutoED(ProdutoED produtoED) {
		this.produtoED = produtoED;
	}
}
