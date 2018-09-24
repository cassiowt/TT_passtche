package model;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table (name = "EVENTOS")
public class EventoED {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "ID_EVENTO")
	private long id;

	@Column (name = "NOME", length = 50)
	private String nome;

	@Column (name = "CODIGO")
	private String codigo;

	@Column (name = "PRECO")
	private double preco;

	@Column (name = "QUANTIDADE_LUGAR")
	private int lugares;

	@Column (name = "DESCRICAO", length = 250)
	private String descricao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column (name = "DATA_EVENTO")
	private Date dataEvento;

	@OneToOne
	@JoinColumn (name = "ID_LOCAL", referencedColumnName = "ID_LOCAL")
	private LocalEventoED localEventoED;

	@Enumerated(EnumType.STRING)
	private TipoEventoED tipoEventoED;

	public EventoED() { }

	public EventoED(String nome, String codigo, double preco, int lugares, String descricao, Date dataEvento, LocalEventoED localEventoED, TipoEventoED tipoEventoED) {
		this.nome = nome;
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
