package model;

import controller.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManagerFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class VendaTest {


    private static EntityManagerFactory entityManagerFactory;
    private static Session session;
    private VendaED venda;
    private Transaction tx = null;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


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

        Collection<ImagemED> imagesLocalEvento = new ArrayList<ImagemED>();
        ImagemED img  = new ImagemED("http://imagens.com/pth", 200);
        ImagemED img2 = new ImagemED("http://imagens.com/utx", 200);
        ((ArrayList<ImagemED>) imagesLocalEvento).add(img);
        ((ArrayList<ImagemED>) imagesLocalEvento).add(img2);

        LocalEventoED local = new LocalEventoED("Pepsi", true, "...", true);
        local.setImagems(imagesLocalEvento);

        EventoED evento = new EventoED("30 seconds to mars", "001", 240.00, 1500, "show da banda", new Date(), local, TipoEventoED.SHOW);
        IngressoED ingresso = null;
        try {
            ingresso = new IngressoED(240, evento, sdf.parse("29/09/2018"), sdf.parse("28/10/2018"), 200, 199);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ProdutoED prod = new ProdutoED("camiseta", "kkk", 30, 30, 300);
        prod.setEvento(null);

        TelefoneED tel = new TelefoneED("992728","51",TipoTelefoneED.CELULAR);
        ClienteED cliente = new ClienteED("Pedro",new Date(),"usuario@site.com.br",TipoPessoaED.CONSUMIDOR, "616","Caçar", "123");
        Collection<TelefoneED> telefones = new ArrayList<TelefoneED>();
        telefones.add(tel);
        cliente.setTelefones(telefones);
        UsuarioED usuario = new UsuarioED("usuario@site.com.br", "1234", TipoUsuarioED.ADMIN, cliente);

        VendaED venda = new VendaED(new Date(), 30, 300, prod);
        venda.setIngresso(ingresso);
        venda.setProduto(prod);
        venda.setCliente(cliente);


        try {
            session = HibernateUtil.getSession();
            transaction = session.beginTransaction();

            session.save(img);
            session.save(img2);
            session.save(local);
            session.save(evento);
            session.save(ingresso);
            session.save(prod);
            session.save(tel);
            session.save(cliente);
            session.save(usuario);
            session.save(venda);

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
