package mb;

import model.BairroED;
import model.CidadeED;
import model.EnderecoED;
import rn.EnderecoRN;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class EnderecoMB {
    private EnderecoED endereco;
    private EnderecoRN enderecoRN;
    private ArrayList<CidadeED> cidades;
    private ArrayList<BairroED> bairros;
    private Long idCidade;
    private boolean selectBairros = false;


    public EnderecoMB() {
        enderecoRN = new EnderecoRN();
        endereco = new EnderecoED();
        cidades = new ArrayList<>();
        bairros = new ArrayList<>();
    }

    public void setEndereco(EnderecoED endereco) {
        this.endereco = endereco;
    }

    public String saveEndereco() {

        System.out.println(endereco);
        enderecoRN.saveEndereco(endereco);
        return "listaCliente";
    }

    public EnderecoED getEndereco() {
        return endereco;
    }


    public ArrayList<CidadeED> getCidades() {

      return   enderecoRN.findAllCidades();

    }

    public ArrayList<BairroED> getBairros() {

        return   enderecoRN.findBairroByCidade(this.idCidade);

    }

    public Long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }

    public boolean isSelectBairros() {
        return selectBairros;
    }

    public void alterSelectBairros() {
        this.selectBairros = true;
    }
}
