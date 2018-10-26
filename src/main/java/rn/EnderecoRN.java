package rn;

import dao.EnderecoDAO;
import model.EnderecoED;

import java.util.ArrayList;
import java.util.List;

public class EnderecoRN {

    EnderecoDAO enderecoDAO = new EnderecoDAO();
    EnderecoED enderecoED = new EnderecoED();

    public static long saveEndereco(EnderecoED endereco){
        long id = 0;
        try {

              id =  enderecoDAO.save(endereco);

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

}
