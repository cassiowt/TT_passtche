package rn;

import dao.TelefoneDAO;
import model.TelefoneED;
import java.util.ArrayList;
import java.util.List;

public class TelefoneRN {
    private TelefoneDAO telefoneDAO = new TelefoneDAO();

    public long createTelefone(TelefoneED telefone) {

        long id = 0;
        try {
                id = telefoneDAO.save(telefone);

        } catch (Exception e) {
            e.getMessage();
        }
        return id;
    }

    public void alterTelefone(TelefoneED telefone) {
        try {
            telefoneDAO.update(telefone);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void deleteTelefone(TelefoneED telefone) {
        try {
            telefoneDAO.delete(telefone);
        } catch (Exception e) {

            e.getMessage();
        }
    }

    public TelefoneED findTelefone(long id) {
        TelefoneED Telefone = new TelefoneED();
        try {
            Telefone = (TelefoneED) telefoneDAO.find(TelefoneED.class, id);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return Telefone;
    }



    public List<TelefoneED> findAllTelefone() {
        List<TelefoneED> Telefonees = new ArrayList<TelefoneED>();
        try {
            Telefonees = telefoneDAO.findAll(TelefoneED.class);
        } catch (Exception e) {

            e.getMessage();
            e.printStackTrace();
        }
        return Telefonees;
    }
}
