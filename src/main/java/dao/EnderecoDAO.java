package dao;

import controller.HibernateUtil;
import model.BairroED;
import model.EnderecoED;
import org.hibernate.query.Query;

import java.util.List;

public class EnderecoDAO extends GenericDAO<EnderecoED> {

    public List findBairroByCidade(Long idCidade) {
        List objects = null;
        try {
            String q ="from BairroED where cidadeED.id = :idCidade";
            session = HibernateUtil.getSession();
            Query query = session.createQuery(q);
            query.setParameter("idCidade", idCidade);
            objects = query.list();
        } catch (Exception ex) {
            ex.printStackTrace();
            if (transaction != null) transaction.rollback();
        } finally {
            try {
                if (session != null) session.close();
            } catch (Exception ex) {
            }
        }
        return objects;
    }
}


