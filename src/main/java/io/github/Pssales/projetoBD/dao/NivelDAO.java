/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.dao;

import java.util.List;

import io.github.Pssales.projetoBD.model.Nivel;


/**
 *
 * @author a1600222
 */
public class NivelDAO extends DAO<Nivel> {

    @SuppressWarnings("unchecked")
    @Override
  
    public Nivel getById(final Long id) {
        return entityManager.find(Nivel.class, id);
    }

    public boolean removeById(final Long id) {

        boolean result = true;

        try {
            Nivel product = this.getById(id);
            super.remove(product);
        } catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    public List<Nivel> findAll() {
        return entityManager
                .createQuery("FROM Nivel").getResultList();
    }

}
