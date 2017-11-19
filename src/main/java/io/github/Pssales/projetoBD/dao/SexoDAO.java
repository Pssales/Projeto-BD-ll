/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.dao;

import java.util.List;

import io.github.Pssales.projetoBD.model.Sexo;


/**
 *
 * @author a1600222
 */
public class SexoDAO extends DAO<Sexo> {

    @SuppressWarnings("unchecked")
    @Override
   public Sexo getById(final Long id) {
        return entityManager.find(Sexo.class, id);
    }

    public boolean removeById(final Long id) {

        boolean result = true;

        try {
            Sexo product = this.getById(id);
            super.remove(product);
        } catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    public List<Sexo> findAll() {
        return entityManager
                .createQuery("FROM Sexo").getResultList();
    }
}
