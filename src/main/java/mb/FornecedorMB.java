package mb;

import model.FornecedorED;
import model.TelefoneED;
import model.UsuarioED;
import rn.FornecedorRN;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class FornecedorMB {

    private FornecedorED fornecedor;
    private FornecedorRN fornecedorRN;
    private TelefoneED telefone;
    private List<TelefoneED> telefones;
    private UsuarioED usuario;

    public FornecedorMB() {
        usuario = new UsuarioED();
        fornecedor = new FornecedorED();
        fornecedorRN = new FornecedorRN();
        telefone = new TelefoneED();
        telefones = new ArrayList<TelefoneED>();
    }

    public FornecedorED getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorED fornecedor){
        this.fornecedor = fornecedor;
    }

    public String saveFornecedor() {
        this.fornecedor.getUsuarioED().setEmail(fornecedor.getEmail());
        System.out.println(fornecedor);
        fornecedorRN.createFornecedor(fornecedor);
        return "listaFornecedor";
    }
    public List<FornecedorED> getFornecedores(){
        List<FornecedorED> fs  = fornecedorRN.findAllFornecedor();
        System.out.println(fs);
        return fs;
    }

    public TelefoneED getTelefone() {
        return telefone;
    }

    public void setTelefone(TelefoneED telefone) {
        this.telefone = telefone;
    }

    public void addTelefone() {
        System.out.println(telefone);
        fornecedor.getTelefones().add(this.telefone);
    }

    public UsuarioED getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioED usuario) {
        this.usuario = usuario;
    }
}
