package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table (name = "LOCAL_EVENTOS")
public class LocalEventoED {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_LOCAL_EVENTO")
    private long id;

    @Column (name = "NOME")
	private String nome;

    @Column (name = "ESTACIONAMENTO")
	private boolean estacionamento;

    @Column (name = "URL_MAPA")
	private String urlMapa;

    @Column (name = "ACESSIBILIDADE")
	private boolean acessibilidade;

    @OneToMany
    @JoinColumn (name = "ID_LOCAL_EVENTO", referencedColumnName = "ID_LOCAL_EVENTO")
	private Collection<ImagemED> imagems = new ArrayList<ImagemED>();

    public LocalEventoED() { }

    public LocalEventoED(String nome, boolean estacionamento, String urlMapa, boolean acessibilidade) {
        this.nome = nome;
        this.estacionamento = estacionamento;
        this.urlMapa = urlMapa;
        this.acessibilidade = acessibilidade;
 }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(boolean estacionamento) {
        this.estacionamento = estacionamento;
    }

    public String getUrlMapa() {
        return urlMapa;
    }

    public void setUrlMapa(String urlMapa) {
        this.urlMapa = urlMapa;
    }

    public boolean isAcessibilidade() {
        return acessibilidade;
    }

    public void setAcessibilidade(boolean acessibilidade) {
        this.acessibilidade = acessibilidade;
    }

    public Collection<ImagemED> getImagems() {
        return imagems;
    }

    public void setImagems(Collection<ImagemED> imagems) {
        this.imagems = imagems;
    }
}
