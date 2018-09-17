package model;

import java.util.Date;

public class EventoED {

	private String nome;

	private Date data;

	private int local;

	private String codigo;

	private double preco;

	private int lugares;

	private String descricao;

	private Date dataEvento;

	private LocalEventoED localEventoED;

	private TipoEventoED tipoEventoED;

	public EventoED() {
	}

	public EventoED(String nome, Date data, int local, String codigo, double preco, int lugares, String descricao, Date dataEvento, LocalEventoED localEventoED, TipoEventoED tipoEventoED) {
		this.nome = nome;
		this.data = data;
		this.local = local;
		this.codigo = codigo;
		this.preco = preco;
		this.lugares = lugares;
		this.descricao = descricao;
		this.dataEvento = dataEvento;
		this.localEventoED = localEventoED;
		this.tipoEventoED = tipoEventoED;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getLocal() {
		return local;
	}

	public void setLocal(int local) {
		this.local = local;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public LocalEventoED getLocalEventoED() {
		return localEventoED;
	}

	public void setLocalEventoED(LocalEventoED localEventoED) {
		this.localEventoED = localEventoED;
	}

	public TipoEventoED getTipoEventoED() {
		return tipoEventoED;
	}

	public void setTipoEventoED(TipoEventoED tipoEventoED) {
		this.tipoEventoED = tipoEventoED;
	}
}
