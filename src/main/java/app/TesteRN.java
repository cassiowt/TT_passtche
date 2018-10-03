package app;

import model.PaisED;
import rn.PaisRN;

import java.util.ArrayList;
import java.util.List;

public class TesteRN {

    static PaisRN paisRN = new PaisRN();

    public static void main(String[] args) {
        //adicionaPais();
        //buscaPais();
        //buscaTodosPaises();
        //alteraPais();
        deletaPais();
    }


    private static void alteraPais() {
        PaisED p = paisRN.findPais(5l);
        p.setNome("Belgrado");
        paisRN.alterPais(p);

    }

    private static void deletaPais() {
        PaisED p = paisRN.findPais(1l);
        paisRN.deletePais(p);

    }


        private static void buscaPais() {
        PaisED pais =  new PaisED();
        System.out.println(paisRN.findPais(2));
    }

    private static void buscaTodosPaises() {
        List<PaisED> paises =  new ArrayList<PaisED>();
        paisRN.findAllPais().forEach(i -> System.out.println(i));

    }

    private static void adicionaPais() {
        PaisED pais =  new PaisED("Servia");
        paisRN.createPais(pais);
    }
}
