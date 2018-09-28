package imp;

public class Impressora  extends GenericImpressora{

    private String marca;
    private float carga;
    private boolean ligada;
    private boolean ocupada;


    public Impressora() {
    }

    public Impressora(String marca, float carga) {
        this.marca = marca;
        this.carga = carga;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }


    public String ligaImpressora(){
        if (this.isLigada()){
         return    super.ligado(true);
        }
        return super.ligado(false);

    }
}
