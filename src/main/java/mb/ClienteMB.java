package mb;

import model.ClienteED;
import model.TelefoneED;
import model.UsuarioED;
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

    public void addTelefone() {
        System.out.println(telefone);
        telefones.add(this.telefone);
    }
}
