package rn;

import dao.EstadoDAO;
import model.EstadoED;

import java.util.ArrayList;
import java.util.List;

public class EstadoRN {

    EstadoDAO estadoDAO = new EstadoDAO();

    public long createEstado(EstadoED estado){
        long id = 0;
        try {
            if(estado.getNome().length() > 5)
                id =  estadoDAO.save(estado);
            else throw new Exception("Estado invalido");
        } catch (Exception e){
            e.getMessage();
        }
        return id;
    }

    public void alterEstado(EstadoED estados){
        try {
            estadoDAO.update(estados);
        } catch (Exception e){
            e.getMessage();
        }
    }
    public void deleteEstado(EstadoED estados) {
        try {
            estadoDAO.delete(estados);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public EstadoED findEstado(long id){
        EstadoED estadoED = new EstadoED();
        try {
            estadoED  = (EstadoED) estadoDAO.find(EstadoED.class, id );
        } catch (Exception e){
            e.getMessage();
            e.printStackTrace();
        }
        return estadoED;
    }

    public List<EstadoED> findAllEstados(){
        List<EstadoED>  estados = new ArrayList<EstadoED>();
        try {
            estados  =  estadoDAO.findAll(EstadoED.class);
        } catch (Exception e){
            e.getMessage();
            e.printStackTrace();
        }
        return estados;
    }



}
