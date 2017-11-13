/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.dao;

import io.github.Pssales.projetoBD.model.Nivel;
import java.util.List;


/**
 *
 * @author a1600222
 */
public class NivelDAO extends DAO<Nivel> {

    @SuppressWarnings("unchecked")
    @Override
    public List<Nivel> findAll() {
        return entityManager.createQuery("FROM sexo").getResultList();
    }


    @Override
    public Nivel getById(Long id) {
        return entityManager.find(Nivel.class, id);
    }

    @Override
    public boolean removeById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
