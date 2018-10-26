package mb;

import model.*;
import rn.ClienteRN;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class ClienteMB {

    private ClienteED cliente;
    private ClienteRN clienteRN;
    private TelefoneED telefone;
    private List<TelefoneED> telefones;
    private UsuarioED usuario;

    public ClienteMB() {
        cliente = new ClienteED();
        clienteRN = new ClienteRN();
        telefone = new TelefoneED();
        telefones = new ArrayList<TelefoneED>();
        usuario = new UsuarioED();
    }

    public ClienteED getCliente() {
        return cliente;
    }

    public void setCliente(ClienteED cliente) {
        this.cliente = cliente;
    }

    public String saveCliente() {

        this.cliente.getUsuarioED().setTipoUsuarioED(TipoUsuarioED.CLIENTE);
        this.cliente.getUsuarioED().setEmail(cliente.getEmail());
        this.cliente.setTipo_PessoaED(TipoPessoaED.CONSUMIDOR);

        System.out.println(cliente);
        clienteRN.createCliente(cliente);
        return "listaCliente";
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

    public TelefoneED getTelefone() {
        return telefone;
    }

    public void setTelefone(TelefoneED telefone) {
        this.telefone = telefone;
    }

    public UsuarioED getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioED usuario) {
        this.usuario = usuario;
    }

    public void addTelefone() {
        System.out.println(telefone);
        cliente.getTelefones().add(this.telefone);

    }
}
