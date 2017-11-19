/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.dao;

import java.util.List;

import io.github.Pssales.projetoBD.model.Matricula;

/**
 *
 * @author Camila
 */
public class MatriculaDAO extends DAO<Matricula> {

    public Matricula getById(final Long id) {
        return entityManager.find(Matricula.class, id);
    }

    public boolean removeById(final Long id) {

        boolean result = true;

        try {
            Matricula product = this.getById(id);
            super.remove(product);
        } catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    public List<Matricula> findAll() {
        return entityManager
                .createQuery("FROM Matricula").getResultList();
    }

}
