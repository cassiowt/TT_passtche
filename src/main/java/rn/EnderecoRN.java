package rn;

import dao.EnderecoDAO;
import model.CidadeED;
import model.EnderecoED;

import java.util.ArrayList;
import java.util.List;

public class EnderecoRN {

    private EnderecoDAO enderecoDAO = new EnderecoDAO();
    private EnderecoED  enderecoED = new EnderecoED();
    private ArrayList<CidadeED> cidades = new ArrayList<>();

    public long saveEndereco(EnderecoED endereco){
        long id = 0;
        try {
            id = enderecoDAO.save(endereco);

        } catch (Exception e){
            e.getMessage();
            e.printStackTrace();
        }
        return id;
    }

    public void alteraEndereco (EnderecoED endereco){
        try {
            enderecoDAO.update(endereco);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }

    }

    public EnderecoED findEndereco(long id){
        try {
            enderecoED  = (EnderecoED) enderecoDAO.find(EnderecoED.class, id );
        } catch (Exception e){
            e.getMessage();
            e.printStackTrace();
        }
        return enderecoED;
    }


    public ArrayList<CidadeED> findAllCidades(){
        try {
            cidades = (ArrayList<CidadeED>) enderecoDAO.findAll(CidadeED.class);
        } catch (Exception e){
            e.getMessage();
            e.printStackTrace();
        }
        return cidades;
    }

}
