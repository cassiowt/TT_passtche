package rn;

import dao.PaisDAO;
import model.PaisED;
import net.bytebuddy.implementation.bytecode.Throw;

public class PaisRN {

    PaisDAO paisDAO = new PaisDAO();

    public long createPais(PaisED pais){

        long id = 0;
        try {
            if(pais.getNome().length() > 5)
              id =  paisDAO.save(pais);
            else throw new Exception("Pais invalido");
        } catch (Exception e){
            e.getMessage();
            e.printStackTrace();
        }
        return id;
    }

    public PaisED busca(long id){
        PaisED paisED = new PaisED();
        try {

              paisED  = (PaisED) paisDAO.find(PaisED.class, id );

        } catch (Exception e){
            e.getMessage();
            e.printStackTrace();
        }
        return paisED;
    }

    public static void main(String[] args) {
        //TestCreated();

        PaisED pais =  new PaisED();

        PaisRN paisRN = new PaisRN();

        System.out.println(paisRN.busca(2));

        



    }

    private static void TestCreated() {
        PaisED pais =  new PaisED("Polina");

        PaisRN paisRN = new PaisRN();

        paisRN.createPais(pais);
    }
}
