package mb;

import model.ClienteED;
import rn.ClienteRN;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ClienteMB {

    private ClienteED cliente;
    private ClienteRN clienteRN;

    public ClienteMB() {
        cliente= new ClienteED();

    }
    public ClienteED getCliente() {
        return cliente;
    }

    public void setCliente(ClienteED cliente) {
        this.cliente = cliente;
    }


    public String saveCliente() {
        System.out.println(cliente);
      //  ClienteED novoCliente = clienteRN.createCliente(setClienteED().setNome());

            return null;
        }

}
