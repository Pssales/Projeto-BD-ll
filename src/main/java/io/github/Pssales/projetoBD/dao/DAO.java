package io.github.Pssales.projetoBD.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAO<E> {

    protected static final EntityManager entityManager =
            Persistence.createEntityManagerFactory("hibernate-example").createEntityManager();

    public abstract List<E> findAll();

    public boolean persist(E object) {

        boolean result = true;

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(object);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            result = false;
        }

        return result;
    }

    public boolean merge(E object) {

        boolean result = true;

        try {
            entityManager.getTransaction().begin();
            entityManager.merge(object);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            result = false;
        }

        return result;
    }

    public boolean remove(E object) {

        boolean result = true;

        try {
            entityManager.getTransaction().begin();
            entityManager.remove(object);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            result = false;
        }

        return result;
    }

    public abstract E getById(final Long id);

    public abstract boolean removeById(final Long id);

}
