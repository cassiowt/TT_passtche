package app;

import model.*;
import rn.BairroRN;
import rn.ClienteRN;
import rn.EnderecoRN;
import rn.UsuarioRN;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteRNClienteUsuario {

    static BairroRN bairroRN = new BairroRN();
    static EnderecoRN enderecoRN = new EnderecoRN();
    static ClienteRN clienteRN = new ClienteRN();
    static UsuarioRN usuarioRN = new UsuarioRN();
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {

        try {
            adcionaCliente() ;
          //  buscarCliente();
          // adicionarUsuario();
           // buscaEndereco();
           // adicionaEndereco();

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    private static void adicionarUsuario() {
        ClienteED cliente = new ClienteED();
        cliente = clienteRN.findCliente(3l);
        System.out.println(cliente);
        UsuarioED u = new  UsuarioED(cliente.getEmail(),"123",TipoUsuarioED.ADMIN);
        usuarioRN.createUsuario(u);
    }

    private static void buscarCliente() {
        ClienteED cliente = new ClienteED();
        cliente = clienteRN.findCliente(3l);
        System.out.println(cliente);

    }

    private static void adcionaCliente() throws ParseException {
        EnderecoED end = enderecoRN.findEndereco(1l);
        UsuarioED u = new  UsuarioED("admin@gmail.com","123",TipoUsuarioED.ADMIN);
        usuarioRN.createUsuario(u);
        ClienteED c = new ClienteED("Administrador",sdf.parse("12/12/2000"),"admin@gmail.com",TipoPessoaED.CONSUMIDOR,end,null, u
                ,"123456789",null,"123456678998");

        clienteRN.createCliente(c);
    }

    private static void buscaEndereco() {
        EnderecoED endereco =  new EnderecoED();
        System.out.println(enderecoRN.findEndereco(1));
    }

    private static void adicionaEndereco() {
        BairroED bairro = bairroRN.findBairro(1l);
        EnderecoED endereco =  new EnderecoED("California, ", 2525,
                "casa", "90000", TipoLogradouroED.RUA, bairro, true );
        enderecoRN.saveEndereco(endereco);
    }



}
