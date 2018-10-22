package mb;

import model.ClienteED;
import model.TelefoneED;
import rn.ClienteRN;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class ClienteMB {

    private ClienteED cliente;
    private ClienteRN clienteRN;
    private TelefoneED telefone;
    private ArrayList<TelefoneED> telefones;

    public ClienteMB() {
        cliente = new ClienteED();
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

    public ArrayList<ClienteED> getClientes(){
        return (ArrayList<ClienteED>) clienteRN.findAllCliente();
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
