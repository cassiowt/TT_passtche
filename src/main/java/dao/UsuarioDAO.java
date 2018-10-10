package dao;

import controller.HibernateUtil;
import model.UsuarioED;
import org.hibernate.query.Query;



public class UsuarioDAO extends GenericDAO<UsuarioED> {

    public UsuarioED findUsuarioByEmail(String email){

        UsuarioED usuarioED = null;
        try {
            session = HibernateUtil.getSession();

            Query query = session.createSQLQuery(
                    "select * from usuarios u where u.email = :email")
                    .addEntity(UsuarioED.class)
                    .setParameter("email", email);

            usuarioED = (UsuarioED) query.getSingleResult();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuarioED;
    }


}
