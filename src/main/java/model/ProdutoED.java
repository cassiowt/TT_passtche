package model;

public class ProdutoED {

	private String nome;

	private String descricao;

	private double valor;

	private int total;

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
}
