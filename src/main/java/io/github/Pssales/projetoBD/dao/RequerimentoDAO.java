package io.github.Pssales.projetoBD.dao;

import java.util.List;

import io.github.Pssales.projetoBD.model.Requerimento;

public class RequerimentoDAO extends DAO<Requerimento> {

    public Requerimento getById(final Long id) {
        return entityManager.find(Requerimento.class, id);
    }

    public boolean removeById(final Long id) {

        boolean result = true;

        try {
            Requerimento product = this.getById(id);
            super.remove(product);
        } catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    public List<Requerimento> findAll() {
        return entityManager
                .createQuery("FROM Product").getResultList();
    }
}
