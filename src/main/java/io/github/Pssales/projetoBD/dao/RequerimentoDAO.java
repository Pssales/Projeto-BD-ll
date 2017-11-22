package io.github.Pssales.projetoBD.dao;

import java.util.List;

import io.github.Pssales.projetoBD.model.Requerimento;

public class RequerimentoDAO extends DAO<Requerimento> {

    public Requerimento getById(final Long id) {
        return this.entityManager.find(Requerimento.class, id);
    }

    public boolean removeById(final Long id) {

        boolean result = true;

        try {
            Requerimento requerimento = this.getById(id);
            super.remove(requerimento);
        } catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    public List<Requerimento> findAll() {
        return entityManager
                .createQuery("FROM Requerimento").getResultList();
    }
}
