package rn;

import dao.PaisDAO;
import model.PaisED;

public class PaisRN {

    PaisDAO paisDAO = new PaisDAO();

    public long createPais(PaisED pais){
        long id = 0;

        try {

       id =  paisDAO.save(pais);

        } catch (Exception e){
            e.printStackTrace();
        }
         return id;
    }

    public static void main(String[] args) {
       PaisED pais =  new PaisED("Brasil");
       PaisRN paisRN = new PaisRN();

       paisRN.createPais(pais);
    }
}
