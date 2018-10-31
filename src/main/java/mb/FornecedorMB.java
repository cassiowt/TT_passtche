package mb;

import model.FornecedorED;
import model.TelefoneED;
import model.TipoUsuarioED;
import model.UsuarioED;
import rn.FornecedorRN;
import rn.TelefoneRN;
import rn.UsuarioRN;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class FornecedorMB {

    private FornecedorED fornecedor;
    private FornecedorRN fornecedorRN;
    private UsuarioRN usuarioRN;
    private TelefoneRN telefoneRN;
    private TelefoneED telefone;
    private TelefoneED telefoneContato;
    private List<TelefoneED> telefones;
    private UsuarioED usuario;

    public FornecedorMB() {
        usuario = new UsuarioED();
        fornecedor = new FornecedorED();
        usuarioRN = new UsuarioRN();
        telefoneRN = new TelefoneRN();
        fornecedorRN = new FornecedorRN();
        telefone = new TelefoneED();
        telefoneContato = new TelefoneED();
        telefones = new ArrayList<TelefoneED>();
    }

    public FornecedorED getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorED fornecedor){
        this.fornecedor = fornecedor;
    }

    public String saveFornecedor() {
        this.usuario.setEmail(fornecedor.getEmail());
        this.usuario.setTipoUsuarioED(TipoUsuarioED.FORNECEDOR);

        this.fornecedor.setTelefoneContato(this.telefoneContato);
        this.fornecedor.setUsuarioED(this.usuario);

        System.out.println(fornecedor);


        usuarioRN.createUsuario(this.usuario);
        telefoneRN.createTelefone(this.telefoneContato);
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

    public TelefoneED getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(TelefoneED telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
}
