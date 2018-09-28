package model;

import javax.persistence.*;

@Entity
@Table(name = "PRODUTOS")
public class ProdutoED {
	@Id
	@Column(name = "ID_PRODUTO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne
	@JoinColumn(name = "EVENTO",
			referencedColumnName = "ID_EVENTO",
			foreignKey = @ForeignKey(name = "FK_EVENTO_ID_EVENTO"))
	private EventoED evento;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "VALOR")
	private double valor;

	@Column(name = "TOTAL")
	private int total;

	@Column(name = "SALDO")
	private int saldo;

	public ProdutoED(String nome, String descricao, double valor, int total, int saldo) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.total = total;
		this.saldo = saldo; }



	public ProdutoED() { }

	public String getNome() {
		return nome; }

	public void setNome(String nome) {
		this.nome = nome; }

	public String getDescricao() {
		return descricao; }

	public void setDescricao(String descricao) {
		this.descricao = descricao; }

	public double getValor() {
		return valor; }

	public void setValor(double valor) {
		this.valor = valor; }

	public int getTotal() {
		return total; }

	public void setTotal(int total) {
		this.total = total; }

	public int getSaldo() {
		return saldo; }

	public void setSaldo(int saldo) {
		this.saldo = saldo; }

	public EventoED getEvento() {
		return evento;
	}

	public void setEvento(EventoED evento) {
		this.evento = evento;
	}
}
