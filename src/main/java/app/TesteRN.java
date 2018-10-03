package app;

import model.PaisED;
import rn.PaisRN;

import java.util.ArrayList;
import java.util.List;

public class TesteRN {

    static PaisRN paisRN = new PaisRN();

    public static void main(String[] args) {
        adicionaPais();
        buscaPais();
    }

    private static void buscaPais() {
        PaisED pais =  new PaisED();
        System.out.println(paisRN.findPais(2));
    }

    private static void buscaTodosPaises() {
        List<PaisED> paises =  new ArrayList<PaisED>();
        paises = paisRN.findAllPais();
        paises.forEach(pais -> System.out.println(pais));
    }

    private static void adicionaPais() {
        PaisED pais =  new PaisED("Ukrania");
        paisRN.createPais(pais);
    }
}
