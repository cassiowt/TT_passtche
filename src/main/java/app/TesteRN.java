package app;

import model.PaisED;
import rn.PaisRN;

public class TesteRN {


    public static void main(String[] args) {
        adicionaPais();
        buscaPais();
    }

    private static void buscaPais() {
        PaisED pais =  new PaisED();
        PaisRN paisRN = new PaisRN();
        System.out.println(paisRN.findPais(2));
    }

    private static void adicionaPais() {
        PaisED pais =  new PaisED("Ukrania");
        PaisRN paisRN = new PaisRN();
        paisRN.createPais(pais);
    }
}
