/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.dao;

import java.util.List;

import io.github.Pssales.projetoBD.views.Servidor;

/**
 *
 * @author Camila
 */
public class ServidorDAO extends DAO<Servidor>{

   public Servidor getById(final Long id) {
        return entityManager.find(Servidor.class, id);
    }

    public boolean removeById(final Long id) {

        boolean result = true;

        try {
            Servidor product = this.getById(id);
            super.remove(product);
        } catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    public List<Servidor> findAll() {
        return entityManager
                .createQuery("FROM Servidor").getResultList();
    }
    
}
