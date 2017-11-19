/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.dao;

import java.util.List;

import io.github.Pssales.projetoBD.model.Telefone;

/**
 *
 * @author Camila
 */
public class TelefoneDAO extends DAO<Telefone>{

    public Telefone getById(final Long id) {
        return entityManager.find(Telefone.class, id);
    }

    public boolean removeById(final Long id) {

        boolean result = true;

        try {
            Telefone product = this.getById(id);
            super.remove(product);
        } catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    public List<Telefone> findAll() {
        return entityManager
                .createQuery("FROM Telefone").getResultList();
    }
    
}
