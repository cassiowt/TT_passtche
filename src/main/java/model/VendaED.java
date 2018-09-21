package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity (name = "VENDAS")

public class VendaED {


	@Id
	@Column(name = "ID_VENDA")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column (name = "DATA_VENDA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataVenda;

	@Column (name = "QUANTIDADE")
	private int quantidadeVenda;
	@Column (name = "VALOR_TOTAL_VENDA")
	private double valorTotalVenda;

	@ManyToOne (cascade={CascadeType.ALL})
	@JoinColumn(name= "ID_PESSOA")
	private Collection<VendaED> vendas = new ArrayList<VendaED>();

	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name= "ID_VENDA")
	private Collection <IngressoED> ingressos = new ArrayList<IngressoED>();

	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name= "ID_VENDA")
	private Collection <ProdutoED> produtos = new ArrayList<ProdutoED>();

	private ClienteED cliente;

	public VendaED() {
	}

    public VendaED(Date dataVenda, int quantidadeVenda, double valorTotalVenda, ClienteED cliente,  ProdutoED produtoED) {
        this.dataVenda = dataVenda;
        this.quantidadeVenda = quantidadeVenda;
        this.valorTotalVenda = valorTotalVenda;
        this.cliente = cliente;

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






}
