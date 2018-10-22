package mb;

import model.ClienteED;
import model.TelefoneED;
import rn.FornecedorRN;
import model.FornecedorED;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class FornecedorMB {

    private FornecedorED fornecedor;
    private FornecedorRN fornecedorRN;
    private TelefoneED telefone;
    private List<TelefoneED> telefones;

    public FornecedorMB() {
        fornecedor = new FornecedorED();
        fornecedorRN = new FornecedorRN();
        telefones = new ArrayList<TelefoneED>();
    }

    public FornecedorED getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorED fornecedor){
        this.fornecedor = fornecedor;
    }

    public FornecedorMB(FornecedorED fornecedor){
        this.fornecedor = fornecedor;
    }

    public String saveFornecedor() {

        System.out.println(fornecedor);
        fornecedorRN.createFornecedor(fornecedor);
        return null;
    }
    public List<FornecedorED> getFornecedores(){
        List<FornecedorED> cs  = fornecedorRN.findAllFornecedor();
        System.out.println(cs);
        return cs;
    }

    public TelefoneED getTelefone() {
        return telefone;
    }

    public void setTelefone(TelefoneED telefone) {
        this.telefone = telefone;
    }

    public void addTelefone(TelefoneED telefone) {
        telefones.add(telefone);
    }
}
