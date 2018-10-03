package app;

import model.BairroED;
import model.CidadeED;
import model.EstadoED;
import rn.BairroRN;
import rn.CidadeRN;

import java.util.ArrayList;
import java.util.List;

import static app.TesteRNCidade.cidadeRN;

public class TesteRNBairro {

    static BairroRN bairroRN = new BairroRN();

    public static void main(String[] args) {
        adicionaBairro();
        buscaBairro();
        buscaTodosBairros();
        alteraBairro();
        deletaBairro();
    }


    private static void alteraBairro() {
        BairroED b = bairroRN.findBairro(1l);
        b.setNome("Centro");
        bairroRN.alterBairro(b);

    }

    private static void deletaBairro() {
        BairroED b = bairroRN.findBairro(1l);
        bairroRN.deletaBairro(b);

    }


        private static void buscaBairro() {
        BairroED b =  new BairroED();
        System.out.println(bairroRN.findBairro(2));
    }

    private static void buscaTodosBairros() {
        List<BairroED> bairros =  new ArrayList<BairroED>();
        bairroRN.findAllBairro().forEach(i -> System.out.println(i));

    }

    private static void adicionaBairro() {
        CidadeED c = cidadeRN.findCidade(1l);


        BairroED b =  new BairroED("Centro", c);
        bairroRN.createBairro(b);
    }
}
