/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.dao;

import static io.github.Pssales.projetoBD.dao.DAO.entityManager;
import java.util.List;

import io.github.Pssales.projetoBD.model.AlunoRequerimento;

/**
 *
 * @author Camila
 */
public class AlunoRequerimentoDAO extends DAO<AlunoRequerimento> {

    @Override
    public List<AlunoRequerimento> findAll() {
        return entityManager
                .createQuery("FROM AlunoRequerimento").getResultList();
    }

    @Override
    public AlunoRequerimento getById(Long id) {
        return this.entityManager.find(AlunoRequerimento.class, id);
    }

    @Override
    public boolean removeById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
