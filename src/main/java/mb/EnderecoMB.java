package mb;

import model.*;
import rn.ClienteRN;
import rn.EnderecoRN;
import rn.FornecedorRN;

import java.util.ArrayList;

public class EnderecoMB {
    private EnderecoED endereco;
    private ClienteED cliente;
    private ClienteRN clienteRN;
    private FornecedorED fornecedor;
    private FornecedorRN fornecedorRN;

    public EnderecoMB() {
        endereco = new EnderecoED();
        cliente = new ClienteED();
        clienteRN = new ClienteRN();
        fornecedor = new FornecedorED();
        fornecedorRN = new FornecedorRN();
    }

    public EnderecoED. { return endereco;
    }

    public void setEndereco(EnderecoED endereco) {
        this.endereco = endereco;
    }

    public String saveEndereco() {

        System.out.println(endereco);
        EnderecoRN.saveEndereco(EnderecoED);
        return "listaCliente";
    }





}
