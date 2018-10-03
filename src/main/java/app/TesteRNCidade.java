package app;

import model.CidadeED;
import model.EstadoED;
import model.PaisED;
import rn.CidadeRN;
import rn.PaisRN;

import java.util.ArrayList;
import java.util.List;

public class TesteRNCidade {

    static CidadeRN cidadeRN = new CidadeRN();

    public static void main(String[] args) {
        adicionaCidade();
        buscaCidade();
        buscaTodasCidades();
        alteraCidade();
        deletaCidade();
    }


    private static void alteraCidade() {
        CidadeED c = cidadeRN.findCidade(1l);
        c.setNome("Canoas");
        cidadeRN.alterCidade(c);

    }

    private static void deletaCidade() {
        CidadeED c = cidadeRN.findCidade(1l);

        cidadeRN.deletaCidade(c);

    }


        private static void buscaCidade() {
        CidadeED pais =  new CidadeED();
        System.out.println(cidadeRN.findCidade(2));
    }

    private static void buscaTodasCidades() {
        List<CidadeED> cidades =  new ArrayList<CidadeED>();
        cidadeRN.findAllCidade().forEach(i -> System.out.println(i));

    }

    private static void adicionaCidade() {
        EstadoED e = estadoRN.findEstado(1l);


        CidadeED c =  new CidadeED("Porto Alegre", e);
        cidadeRN.createCidade(c);
    }
}
