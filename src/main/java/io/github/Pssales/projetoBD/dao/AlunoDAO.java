/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.dao;

import java.util.List;

import io.github.Pssales.projetoBD.model.Aluno;

/**
 *
 * @author Camila
 */
public class AlunoDAO extends DAO<Aluno>{

    public Aluno getById(final Long id) {
        return entityManager.find(Aluno.class, id);
    }

    public boolean removeById(final Long id) {

        boolean result = true;

        try {
            Aluno product = this.getById(id);
            super.remove(product);
        } catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    public List<Aluno> findAll() {
        return entityManager
                .createQuery("FROM Aluno").getResultList();
    }
    
}
