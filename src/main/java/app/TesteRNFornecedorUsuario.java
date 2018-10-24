package app;

import model.*;
import rn.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteRNFornecedorUsuario {

    static BairroRN bairroRN = new BairroRN();
    static EnderecoRN enderecoRN = new EnderecoRN();
    static FornecedorRN fornecedorRN = new FornecedorRN();
    static UsuarioRN usuarioRN = new UsuarioRN();
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public static void main(String[] args) {

        try {
            adcionaFornecedor();
            //  buscarCliente();
            // adicionarUsuario();
            // buscaEndereco();
            // adicionaEndereco();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private static void adicionarUsuario() {
        FornecedorED fornecedor = new FornecedorED();
        fornecedor = fornecedorRN.findFornecedor(3l);
        System.out.println(fornecedor);
        UsuarioED u = new UsuarioED(fornecedor.getEmail(), "123", TipoUsuarioED.ADMIN);
        usuarioRN.createUsuario(u);
    }

    private static void buscarFornecedor() {
        FornecedorED fornecedor = new FornecedorED();
        fornecedor = fornecedorRN.findFornecedor(3l);
        System.out.println(fornecedor);

    }

    private static void adcionaFornecedor() throws ParseException {
        EnderecoED end = enderecoRN.findEndereco(1l);
        UsuarioED u = new UsuarioED("admin@gmail.com", "123", TipoUsuarioED.ADMIN);
        usuarioRN.createUsuario(u);
        FornecedorED c = new FornecedorED("LUCAS FORNECEDOR", sdf.parse("12/12/1999"), "55@55.COM", TipoPessoaED.VENDEDOR,
                "12345678901", "PassTT", 10, "123456");

        fornecedorRN.createFornecedor(c);
    }

    private static void buscaEndereco() {
        EnderecoED endereco = new EnderecoED();
        System.out.println(enderecoRN.findEndereco(1));
    }

    private static void adicionaEndereco() {
        BairroED bairro = bairroRN.findBairro(1l);
        EnderecoED endereco = new EnderecoED("California, ", 2525,
                "casa", "90000", TipoLogradouroED.RUA, bairro, true);
        enderecoRN.saveEndereco(endereco);
    }

}


