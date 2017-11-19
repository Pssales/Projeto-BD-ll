/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD;

import io.github.Pssales.projetoBD.dao.RequerimentoDAO;
import io.github.Pssales.projetoBD.model.Requerimento;

/**
 *
 * @author Camila
 */
public class Main {

    public static void main(String args[]) {
        RequerimentoDAO requerimentoDAO = new RequerimentoDAO();

        Requerimento requerimento = new Requerimento();
        requerimento.setNome("jkjjkkjhk");
        requerimento.setPrazo(12);
        requerimentoDAO.persist(requerimento);
    }
}
