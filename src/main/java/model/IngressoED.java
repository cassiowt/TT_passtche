package model;

import javax.persistence.*;
import java.util.Date;


@Entity(name = "INGRESSOS")
public class IngressoED {

	@Id
	@Column(name = "ID_INGRESSO")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "VALOR")
	private double valor;
	@Column(name = "EVENTO")
	private EventoED evento;
	@Column(name = "DATA_INICIO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicioVenda;
	@Column(name = "DATA_FIM")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFimVenda;
	@Column(name = "TOTAL")
	private int total;
	@Column(name = "SALDO")
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
