package app;

import model.EstadoED;
import rn.EstadoRN;
import model.PaisED;
import rn.PaisRN;

import java.util.ArrayList;
import java.util.List;

public class TesteRNEstado {


    static PaisRN paisRN = new PaisRN();
    static EstadoRN estadoRN = new EstadoRN();
    static EstadoED estado =  new EstadoED();


    public static void main(String[] args) {
        adicionaEstado();
     //   buscaEstado();
      //  buscaTodosEstados();
      //  alteraEstado(2l);
      //  deletaEstado(2l);
    }

    private  static void deletaEstado(long idEstado){
        EstadoED p = estadoRN.findEstado(idEstado);
        p.setNome("Polonia");
        estadoRN.deleteEstado(p);
    }

    private  static void alteraEstado(long idEstado){
        EstadoED p = estadoRN.findEstado(idEstado);
        p.setNome("Polonia");
        estadoRN.alterEstado(p);
    }

    private static void buscaEstado() {

        System.out.println(estadoRN.findEstado(2));
    }
    private static void buscaTodosEstados() {
        List<EstadoED> estado =  new ArrayList<EstadoED>();
        estadoRN.findAllEstados().forEach(i-> System.out.println(i));
    }

    private static void adicionaEstado() {
        PaisED pais = paisRN.findPais(8l);
        EstadoED estado =  new EstadoED("Rio Grande do Sul","RS", pais);
        estadoRN.createEstado(estado);
    }
}
