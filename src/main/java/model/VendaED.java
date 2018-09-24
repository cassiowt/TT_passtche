package model;

import javax.persistence.*;
import java.util.Date;

@Entity (name = "VENDAS")
public class VendaED {

	@Id
	@Column(name = "ID_VENDA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column (name = "DATA_VENDA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataVenda;

	@Column (name = "QUANTIDADE")
	private int quantidadeVenda;

	@Column (name = "VALOR_TOTAL_VENDA")
	private double valorTotalVenda;

	@OneToOne
	@JoinColumn(name= "ID_INGRESSO")
	private IngressoED ingresso;

	@OneToOne
	@JoinColumn(name= "ID_PRODUTO")
	private ProdutoED produto;

	@OneToOne
	@JoinColumn(name= "ID_PESSOA")
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
