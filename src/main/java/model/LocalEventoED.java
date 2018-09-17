package model;

public class LocalEventoED {

	private String nome;

	private boolean estacionamento;

	private String urlMapa;

	private boolean acessibilidade;

	private ImagemED[] imagemED;

    public LocalEventoED() {
    }

    public LocalEventoED(String nome, boolean estacionamento, String urlMapa, boolean acessibilidade, ImagemED[] imagemED) {
        this.nome = nome;
        this.estacionamento = estacionamento;
        this.urlMapa = urlMapa;
        this.acessibilidade = acessibilidade;
        this.imagemED = imagemED;
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

    public ImagemED[] getImagemED() {
        return imagemED;
    }

    public void setImagemED(ImagemED[] imagemED) {
        this.imagemED = imagemED;
    }
}
