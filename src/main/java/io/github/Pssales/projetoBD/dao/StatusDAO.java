/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.dao;

import java.util.List;

/**
 *
 * @author Camila
 */
import io.github.Pssales.projetoBD.model.Status;

public class StatusDAO extends DAO<Status>{

  public Status getById(final Long id) {
        return entityManager.find(Status.class, id);
    }

    public boolean removeById(final Long id) {

        boolean result = true;

        try {
            Status product = this.getById(id);
            super.remove(product);
        } catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    public List<Status> findAll() {
        return entityManager
                .createQuery("FROM Status").getResultList();
    }
    
}
