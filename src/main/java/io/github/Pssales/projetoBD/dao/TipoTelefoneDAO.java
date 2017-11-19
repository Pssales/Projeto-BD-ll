/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.dao;

import java.util.List;

import io.github.Pssales.projetoBD.model.TipoTelefone;

/**
 *
 * @author Camila
 */
public class TipoTelefoneDAO extends DAO<TipoTelefone>{

   public TipoTelefone getById(final Long id) {
        return entityManager.find(TipoTelefone.class, id);
    }

    public boolean removeById(final Long id) {

        boolean result = true;

        try {
            TipoTelefone product = this.getById(id);
            super.remove(product);
        } catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    public List<TipoTelefone> findAll() {
        return entityManager
                .createQuery("FROM TipoTelefone").getResultList();
    }
    
}
