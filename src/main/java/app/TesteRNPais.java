package app;

import model.PaisED;
import rn.PaisRN;

import java.util.ArrayList;
import java.util.List;

public class TesteRNPais {

    static PaisRN paisRN = new PaisRN();
    static PaisED pais =  new PaisED();

    public static void main(String[] args) {
//        adicionaPais();
//        buscaPais();
//        buscaTodosPaises();
//        alteraPais(2l);
        deletaPais(2l);
    }

    private  static void deletaPais(long idPais){
        PaisED p = paisRN.findPais(idPais);
        p.setNome("Polonia");
        paisRN.deletePais(p);
    }

    private  static void alteraPais(long idPais){
        PaisED p = paisRN.findPais(idPais);
        p.setNome("Polonia");
        paisRN.alterPais(p);
    }

    private static void buscaPais() {

        System.out.println(paisRN.findPais(2));
    }
    private static void buscaTodosPaises() {
        List<PaisED> pais =  new ArrayList<PaisED>();
        paisRN.findAllPais().forEach(i-> System.out.println(i));
    }

    private static void adicionaPais() {
        PaisED pais =  new PaisED("Argentina");
           paisRN.createPais(pais);
    }
}
