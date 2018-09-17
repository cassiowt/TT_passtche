package model;

import java.util.Date;

public class IngressoED {

	private double valor;

	private EventoED evento;

	private Date dataInicioVenda;

	private Date dataFimVenda;

	private int total;

	private int saldo;


	public IngressoED() {

	}

	public IngressoED(double valor, EventoED evento, Date dataInicioVenda, Date dataFimVenda, int total, int saldo) {
		this.valor = valor;
		this.evento = evento;
		this.dataInicioVenda = dataInicioVenda;
		this.dataFimVenda = dataFimVenda;
		this.total = total;
		this.saldo = saldo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public EventoED getEvento() {
		return evento;
	}

	public void setEvento(EventoED evento) {
		this.evento = evento;
	}

	public Date getDataInicioVenda() {
		return dataInicioVenda;
	}

	public void setDataInicioVenda(Date dataInicioVenda) {
		this.dataInicioVenda = dataInicioVenda;
	}

	public Date getDataFimVenda() {
		return dataFimVenda;
	}

	public void setDataFimVenda(Date dataFimVenda) {
		this.dataFimVenda = dataFimVenda;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}
