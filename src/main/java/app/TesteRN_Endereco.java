package app;

import model.BairroED;
import model.EnderecoED;
import model.PaisED;
import model.TipoLogradouroED;
import rn.EnderecoRN;
import rn.PaisRN;

import java.util.ArrayList;
import java.util.List;

public class TesteRN_Endereco {

    static EnderecoRN enderecoRN = new EnderecoRN();

    public static void main(String[] args) {
        //adicionaPais();
        //buscaPais();
    }

    private static void buscaEndereco() {
        EnderecoED endereco =  new EnderecoED();
        System.out.println(enderecoRN.findEndereco(2));
    }

    private static void adicionaEndereco() {

        EnderecoED endereco =  new EnderecoED("California, ", 2525, "casa", "90000", TipoLogradouroED.RUA, new BairroED(), true );
        enderecoRN.saveEndereco(endereco);
    }
}
