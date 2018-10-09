package app;

import model.BairroED;
import model.EnderecoED;
import model.PaisED;
import model.TipoLogradouroED;
import rn.BairroRN;
import rn.EnderecoRN;
import rn.PaisRN;

import java.util.ArrayList;
import java.util.List;

public class TesteRNEndereco {

    static BairroRN bairroRN = new BairroRN();
    static EnderecoRN enderecoRN = new EnderecoRN();

    public static void main(String[] args) {

        adicionaEndereco();


    }

    private static void buscaEndereco() {
        EnderecoED endereco =  new EnderecoED();
        System.out.println(enderecoRN.findEndereco(2));
    }

    private static void adicionaEndereco() {
        BairroED bairro = bairroRN.findBairro(1l);
        EnderecoED endereco =  new EnderecoED("California, ", 2525,
                "casa", "90000", TipoLogradouroED.RUA, bairro, true );
        enderecoRN.saveEndereco(endereco);
    }



}
