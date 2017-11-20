/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD;

import io.github.Pssales.projetoBD.dao.RequerimentoDAO;
import io.github.Pssales.projetoBD.dao.SexoDAO;
import io.github.Pssales.projetoBD.model.Requerimento;
import io.github.Pssales.projetoBD.model.Sexo;

/**
 *
 * @author Camila
 */
public class Main {

    public static void main(String args[]) {
        SexoDAO requerimentoDAO = new SexoDAO();

        Sexo requerimento = new Sexo();
        requerimento.setSexo("masculino");
        requerimentoDAO.persist(requerimento);
        Sexo requerimentos = new Sexo();
        requerimentos.setSexo("feminino");
        requerimentoDAO.persist(requerimentos);
    }
}
