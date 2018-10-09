package rn;

import dao.UsuarioDAO;
import model.UsuarioED;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRN {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public long createUsuario(UsuarioED Usuario) {
        long id = 0;
        try {
            if (Usuario.getEmail().length() > 5)
                id = usuarioDAO.save(Usuario);
            else throw new Exception("Usuario invalido");
        } catch (Exception e) {
            e.getMessage();
        }
        return id;
    }

    public void alterUsuario(UsuarioED usuario) {
        try {
            usuarioDAO.update(usuario);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void deleteUsuario(UsuarioED Usuario) {
        try {
            usuarioDAO.delete(Usuario);
        } catch (Exception e) {

            e.getMessage();
        }
    }

    public UsuarioED findUsuario(long id) {
        UsuarioED Usuario = new UsuarioED();
        try {
            Usuario = (UsuarioED) usuarioDAO.find(UsuarioED.class, id);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return Usuario;
    }

    public List<UsuarioED> findAllUsuario() {
        List<UsuarioED> Usuarioes = new ArrayList<UsuarioED>();
        try {
            Usuarioes = usuarioDAO.findAll(UsuarioED.class);
        } catch (Exception e) {

            e.getMessage();
            e.printStackTrace();
        }
        return Usuarioes;
    }
}
