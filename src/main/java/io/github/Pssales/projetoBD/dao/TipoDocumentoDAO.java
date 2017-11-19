/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.dao;

import java.util.List;

import io.github.Pssales.projetoBD.model.TipoDocumento;

/**
 *
 * @author Camila
 */
public class TipoDocumentoDAO extends DAO<TipoDocumento>{

   public TipoDocumento getById(final Long id) {
        return entityManager.find(TipoDocumento.class, id);
    }

    public boolean removeById(final Long id) {

        boolean result = true;

        try {
            TipoDocumento product = this.getById(id);
            super.remove(product);
        } catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    public List<TipoDocumento> findAll() {
        return entityManager
                .createQuery("FROM TipoDocumento").getResultList();
    }
    
}
