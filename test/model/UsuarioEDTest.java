package model;

import controller.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.*;

public class UsuarioEDTest {

    private static EntityManagerFactory entityManagerFactory;
    private static Session session;
    private UsuarioED usuario;
    private Transaction tx = null;



    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void createUserSession() {
        Session session = null;
        Transaction transaction = null;
        UsuarioED usuario = new UsuarioED("usuario@site.com.br", "1234", TipoUsuarioED.ADMIN, null);
        try {
            session = HibernateUtil.getSession();
            transaction = session.beginTransaction();
            session.save(usuario);
            System.out.println("Inserido Usuario: "+usuario.getEmail());
            transaction.commit();
        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
            if(transaction != null) transaction.rollback();
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
    }
}