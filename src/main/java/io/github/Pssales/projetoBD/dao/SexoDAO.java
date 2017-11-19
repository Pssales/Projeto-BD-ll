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
    public List<Sexo> findAll() {
        return entityManager.createQuery("FROM sexo").getResultList();
    }


    @Override
    public Sexo getById(Long id) {
        return entityManager.find(Sexo.class, id);
    }

    @Override
    public boolean removeById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
