package mb;

import controller.Util;
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
    private EnderecoED endereco;

    public ClienteMB() {
        cliente = new ClienteED();
        clienteRN = new ClienteRN();
        telefone = new TelefoneED();
        telefones = new ArrayList<TelefoneED>();
        endereco = new EnderecoED();
    }

    public ClienteED getCliente() {
        return cliente;
    }

    public void setCliente(ClienteED cliente) {
        this.cliente = cliente;
    }

    public String saveCliente() {
        this.cliente.setEnderecoED(null);

        System.out.println(cliente);
        long  id = clienteRN.createCliente(cliente);
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

    public TelefoneED getTelefone() {
        return telefone;
    }

    public void setTelefone(TelefoneED telefone) {
        this.telefone = telefone;
    }

    public void addTelefone() {
        System.out.println(telefone);
        cliente.getTelefones().add(this.telefone);
    }
}
