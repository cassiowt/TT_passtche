package model;

import controller.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class EnderecoFornecedorTest {
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
        TelefoneED tel = new TelefoneED("992728","51",TipoTelefoneED.CELULAR);
        FornecedorED fornecedor = new FornecedorED("João", new Date(), "target@gmail.com", TipoPessoaED.RESPONSAVEL, "301", "target", 30, "400400");
        Collection<TelefoneED> telefones = new ArrayList<TelefoneED>();
        telefones.add(tel);
        fornecedor.setTelefones(telefones);
        UsuarioED usuario = new UsuarioED("usuario@site.com.br", "1234", TipoUsuarioED.ADMIN);
        PaisED pais = new PaisED("Brasil");
        EstadoED estado = new EstadoED("Rio Grande do Sul", "RS", pais);
        CidadeED cidade = new CidadeED("Porto Alegre", estado);
        BairroED bairro = new BairroED("Passo da Areia", cidade);
        EnderecoED endereco = new EnderecoED("Assis Brasil",200,"apt 4","91408020",TipoLogradouroED.AVENIDA, bairro, true);



        try {
            session = HibernateUtil.getSession();
            transaction = session.beginTransaction();
            session.save(pais);
            session.save(estado);
            session.save(cidade);
            session.save(bairro);
            session.save(endereco);
            session.save(tel);
            session.save(fornecedor);
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
