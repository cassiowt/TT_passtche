package mb;

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


    public EnderecoMB() {
        enderecoRN = new EnderecoRN();
        endereco = new EnderecoED();
        cidades = new ArrayList<>();

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
}
