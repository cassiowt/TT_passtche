package rn;

import dao.CidadeDAO;
import dao.PaisDAO;
import model.CidadeED;
import model.PaisED;

import java.util.ArrayList;
import java.util.List;

public class CidadeRN {

    CidadeDAO cidadeDAO = new CidadeDAO();

    public long createCidade(CidadeED cidade) {
        long id = 0;
        try {
            cidadeDAO.save(cidade);
        } catch (Exception e) {
            e.getMessage();
        }
        return id;
    }

    public CidadeED findCidade(long id) {
        CidadeED cidade = new CidadeED();
        try {
            cidade = (CidadeED) cidadeDAO.find(CidadeED.class, id);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return cidade;

    }

    public List<CidadeED> findAllCidade() {
        List<CidadeED> cidades = new ArrayList<CidadeED>();
        try {
            cidades = cidadeDAO.findAll(CidadeED.class);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return cidades;
    }

    public void alterCidade(CidadeED cidade) {
        try {
            cidadeDAO.update(cidade);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void deletaCidade(CidadeED cidade){
        try {
            cidadeDAO.delete(cidade);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
