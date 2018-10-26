package rn;

import dao.ClienteDAO;
import model.ClienteED;

import java.util.ArrayList;
import java.util.List;

public class ClienteRN {

    private ClienteDAO clienteDAO = new ClienteDAO();

    public long createCliente(ClienteED Cliente) {
        long id = 0;
        try {
            if (Cliente.getNome().length() > 5)
                id = clienteDAO.save(Cliente);
            else throw new Exception("Cliente invalido");
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return id;
    }

    public void alterCliente(ClienteED cliente) {
        try {
            clienteDAO.update(cliente);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void deleteCliente(ClienteED Cliente) {
        try {
            clienteDAO.delete(Cliente);
        } catch (Exception e) {

            e.getMessage();
        }
    }

    public ClienteED findCliente(long id) {
        ClienteED Cliente = new ClienteED();
        try {
            Cliente = (ClienteED) clienteDAO.find(ClienteED.class, id);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return Cliente;
    }

    public List<ClienteED> findAllCliente() {
        List<ClienteED> Clientees = new ArrayList<ClienteED>();
        try {
            Clientees = clienteDAO.findAll(ClienteED.class);
        } catch (Exception e) {

            e.getMessage();
            e.printStackTrace();
        }
        return Clientees;
    }
}
