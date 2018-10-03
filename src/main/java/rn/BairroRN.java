package rn;

import dao.BairroDAO;
import dao.CidadeDAO;
import model.BairroED;
import model.CidadeED;

import java.util.ArrayList;
import java.util.List;

public class BairroRN {

    BairroDAO bairroDAO = new BairroDAO();

    public long createBairro(BairroED bairro) {
        long id = 0;
        try {
            bairroDAO.save(bairro);
        } catch (Exception e) {
            e.getMessage();
        }
        return id;
    }

    public BairroED findBairro(long id) {
        BairroED bairro = new BairroED();
        try {
            bairro = (BairroED) bairroDAO.find(BairroED.class, id);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return bairro;

    }

    public List<BairroED> findAllBairro() {
        List<BairroED> bairros = new ArrayList<BairroED>();
        try {
            bairros = bairroDAO.findAll(BairroED.class);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return bairros;
    }

    public void alterBairro(BairroED bairro) {
        try {
            bairroDAO.update(bairro);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void deletaBairro(BairroED bairro){
        try {
            bairroDAO.delete(bairro);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
