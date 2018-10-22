package mb;

import model.ClienteED;
import model.TelefoneED;
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

    public ClienteMB() {
        cliente = new ClienteED();
        clienteRN = new ClienteRN();
        telefones = new ArrayList<TelefoneED>();
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
           return null;
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

    public void addTelefone(TelefoneED telefone) {
        telefones.add(telefone);
    }
}
