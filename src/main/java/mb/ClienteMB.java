package mb;

import controller.Util;
import model.*;
import rn.ClienteRN;
import rn.UsuarioRN;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class ClienteMB {

    private ClienteED cliente;
    private ClienteRN clienteRN;
    private UsuarioRN usuarioRN;
    private TelefoneED telefone;
    private List<TelefoneED> telefones;
    private UsuarioED usuario;
    private EnderecoED endereco;

    public ClienteMB() {
        cliente = new ClienteED();
        clienteRN = new ClienteRN();
        usuarioRN = new UsuarioRN();
        telefone = new TelefoneED();
        telefones = new ArrayList<TelefoneED>();
        usuario = new UsuarioED();
        endereco = new EnderecoED();
    }


    public String saveCliente() {


        this.usuario.setEmail(cliente.getEmail());
        this.usuario.setTipoUsuarioED(TipoUsuarioED.CLIENTE);

        this.cliente.setUsuarioED(this.usuario);
        this.cliente.setTipo_PessoaED(TipoPessoaED.CONSUMIDOR);
        this.cliente.setEnderecoED(null);

        System.out.println(cliente);

        long idu = usuarioRN.createUsuario(usuario);
        long id  = clienteRN.createCliente(cliente);
        if (id > 0 ) {
            Util.mensages("Usuário", "Salvo com Sucesso");
            return "listaCliente.xhtml";
        }
        Util.mensages("Usuário", "Erro ao Salvar");
        return "";
    }

    public ClienteED buscaCliente(Long id) {

        ClienteED cliente = clienteRN.findCliente(id);
        System.out.println(cliente);

        return cliente;
    }

    public List<ClienteED> getClientes(){
        List<ClienteED> cs  = clienteRN.findAllCliente();
        System.out.println(cs);
        return cs;
    }

    public void addTelefone() {
        System.out.println(telefone);
        this.cliente.getTelefones().add(this.telefone);
    }

    public TelefoneED getTelefone() {
        return telefone;
    }

    public void setTelefone(TelefoneED telefone) {
        this.telefone = telefone;
    }

    public ClienteED getCliente() {
        return cliente;
    }

    public void setCliente(ClienteED cliente) {
        this.cliente = cliente;
    }

    public UsuarioED getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioED usuario) {
        this.usuario = usuario;
    }
}
