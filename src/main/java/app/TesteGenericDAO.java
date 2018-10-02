package app;

import imp.PaisDAO;
import model.PaisED;

import java.util.ArrayList;

public class TesteGenericDAO {

    static PaisDAO dao = new PaisDAO();

    static ArrayList<PaisED> paises = new ArrayList<PaisED>() {
        {
            add(new PaisED("Brasil"));
            add(new PaisED("Agertina"));
            add(new PaisED("Cuba"));
            add(new PaisED("Chile"));
        }
    };



    public static void main(String[] args) {

         dao.listAll(paises);

      /*  int numeroPaises = dao.getNumeroPaises(paises);

        System.out.println("Existem " + numeroPaises + " Paises");*/

    }
}
