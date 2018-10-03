package rn;

import dao.PaisDAO;
import model.PaisED;

import java.util.ArrayList;
import java.util.List;

public class PaisRN {

    PaisDAO paisDAO = new PaisDAO();

    public long createPais(PaisED pais) {
        long id = 0;
        try {
            if (pais.getNome().length() > 5)
                id = paisDAO.save(pais);
            else throw new Exception("Pais invalido");
        } catch (Exception e) {
            e.getMessage();
        }
        return id;
    }

    public PaisED findPais(long id) {
        PaisED paisED = new PaisED();
        try {
            paisED = (PaisED) paisDAO.find(PaisED.class, id);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return paisED;

    }

    public List<PaisED> findAllPais() {
        List<PaisED> paises = new ArrayList<PaisED>();
        try {
            paises = paisDAO.findAll(PaisED.class);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return paises;
    }

    public void alterPais(PaisED pais) {
        try {
            paisDAO.update(pais);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void deletaPais(PaisED pais){
        try {
            paisDAO.delete(pais);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
