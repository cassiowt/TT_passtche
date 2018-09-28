package model;

import controller.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class UsuarioEDTest {

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

        TelefoneED tel = new TelefoneED("99279828","51",TipoTelefoneED.CELULAR);
        TelefoneED tel1 = new TelefoneED("37937393","51",TipoTelefoneED.FIXO);

        ClienteED cliente = new ClienteED("Waldemor",new Date(),"usuario@site.com.br",TipoPessoaED.CONSUMIDOR, "616","Caçar", "123");
            Collection<TelefoneED> telefones = new ArrayList<TelefoneED>();
            telefones.add(tel);
            telefones.add(tel1);
            cliente.setTelefones(telefones);

        UsuarioED usuario = new UsuarioED("usuario@site.com.br", "1234", TipoUsuarioED.ADMIN, cliente);

        try {
            session = HibernateUtil.getSession();
            transaction = session.beginTransaction();
            session.save(tel);
            session.save(tel1);
            session.save(cliente);
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