package dao;

import connection.ConnectionFactory;
import javax.persistence.EntityManager;
import java.util.List;

public class DAO<T extends EntidadeBase> {

    public T save(T t) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();

            if (t.getId() == null) {
                em.persist(t);
            } else {
                em.merge(t);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return t;
    }

    public T findById(Class<T> clazz, int id) {
        EntityManager entityManager = new ConnectionFactory().getConnetion();
        T t = null;
        try {
            t = entityManager.find(clazz, id);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            entityManager.close();
        }
        return t;
    }

    public List findAll(Class<T> clazz) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            return em.createQuery("from " + clazz.getTypeName().toString()).getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return null;
    }

    public T remove(Class<T> clazz, int id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        T t = null;
        try {
            t = em.find(clazz, id);
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return t;
    }
}
