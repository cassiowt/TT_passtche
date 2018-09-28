package controller;

import model.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory sessionFactory = null;

    static {
        try{
            loadSessionFactory();
        }catch(Exception e){
            System.err.println("Exception while initializing hibernate util.. ");
            e.printStackTrace();
        }
    }

    public static void loadSessionFactory(){

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(UsuarioED.class);
        configuration.addAnnotatedClass(PessoaED.class);
        configuration.addAnnotatedClass(ClienteED.class);
        configuration.addAnnotatedClass(FornecedorED.class);
        configuration.addAnnotatedClass(TelefoneED.class);
        configuration.addAnnotatedClass(EnderecoED.class);
        configuration.addAnnotatedClass(BairroED.class);
        configuration.addAnnotatedClass(CidadeED.class);
        configuration.addAnnotatedClass(EstadoED.class);
        configuration.addAnnotatedClass(PaisED.class);
        configuration.addAnnotatedClass(ImagemED.class);
        configuration.addAnnotatedClass(LocalEventoED.class);
        configuration.addAnnotatedClass(EventoED.class);
        configuration.addAnnotatedClass(IngressoED.class);

        ServiceRegistry srvcReg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(srvcReg);
    }

    public static Session getSession() throws HibernateException {

        Session retSession=null;
        try {
            retSession = sessionFactory.openSession();
        }catch(Throwable t){
            System.err.println("Exception while getting session.. ");
            t.printStackTrace();
        }
        if(retSession == null) {
            System.err.println("session is discovered null");
        }

        return retSession;
    }
}