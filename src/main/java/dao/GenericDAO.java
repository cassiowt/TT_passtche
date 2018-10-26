package dao;

import controller.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public abstract class GenericDAO<T> {

    protected static Session session;
    protected Transaction transaction = null;

    public long save(T entity) {
        long id = 0;
        try {
            session     = HibernateUtil.getSession();
            transaction = session.beginTransaction();
            id = (Long) session.save(entity);
            transaction.commit();
        } catch(Exception ex) {
            ex.printStackTrace();
            if(transaction != null) transaction.rollback();
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
      return id;
    }

    public void delete(T entity) {
        try {
            session     = HibernateUtil.getSession();
            transaction = session.beginTransaction();
            session.delete(entity);
            transaction.commit();
        } catch(Exception ex) {
            ex.printStackTrace();
            if(transaction != null) transaction.rollback();
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
    }

    public void update(T entity) {
        try {
            session     = HibernateUtil.getSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(entity);
            transaction.commit();
        } catch(Exception ex) {
            ex.printStackTrace();
            if(transaction != null) transaction.rollback();
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
    }

    public Object find(Class classe, long id) {
        Object obj = null;
        try {
            session     = HibernateUtil.getSession();
            obj = session.get(classe, id);
        } catch(Exception ex) {
            ex.printStackTrace();
            if(transaction != null) transaction.rollback();
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
        return obj;
    }

    public List findAll(Class classe) {
        List objects = null;
        try {
            session     = HibernateUtil.getSession();
            Query query = session.createQuery("from " + classe.getName());
            objects = query.list();
        } catch(Exception ex) {
            ex.printStackTrace();
            if(transaction != null) transaction.rollback();
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
        return objects;
    }
}
