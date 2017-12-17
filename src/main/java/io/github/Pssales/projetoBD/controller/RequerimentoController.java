/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.controller;

import io.github.Pssales.projetoBD.dao.RequerimentoDAO;
import io.github.Pssales.projetoBD.model.Requerimento;
import io.github.Pssales.projetoBD.views.CadastroRequerimento;

/**
 *
 * @author Camila
 */
public class RequerimentoController {

    CadastroRequerimento tela;
    RequerimentoDAO rdao = new RequerimentoDAO();

    public RequerimentoController(CadastroRequerimento tela, String metodo) {
        this.tela = tela;
        if (validarNome() && validarPrazo()) {
            Requerimento requerimento = new Requerimento(this.tela.getTxtNome().getText(), Integer.parseInt(this.tela.getTxtPrazo().getText()));
            if (metodo.equalsIgnoreCase("insert")) {
                rdao.persist(requerimento);
            } else if (metodo.equalsIgnoreCase("delete")) {
                rdao.removeById(Long.valueOf(Integer.parseInt(this.tela.getJTRequerimento().getValueAt(this.tela.getJTRequerimento().getSelectedRow(), 0).toString())));
            } else if (metodo.equalsIgnoreCase("update")) {
                Requerimento r = new Requerimento();

                r.setNome(this.tela.getTxtNome().getText());
                r.setPrazo(Integer.parseInt(this.tela.getTxtPrazo().getText()));
                r.setId(Long.valueOf(Integer.parseInt(this.tela.getJTRequerimento().getValueAt(this.tela.getJTRequerimento().getSelectedRow(), 0).toString())));
                rdao.merge(r);
            }

            this.tela.getTxtNome().setText("");
            this.tela.getTxtPrazo().setText("");

            this.tela.writeJTable();
        }
    }
    
    public boolean validarNome() {
        if (this.tela.getTxtNome().getText().isEmpty()) {
            this.tela.getNome_erro().setText("Preencha o Campo NOME corretamente.");
            return false;
        }
        this.tela.getNome_erro().setText("");

        return true;
    }

    public boolean validarPrazo() {
        if (this.tela.getTxtPrazo().getText().isEmpty()) {
            this.tela.getPrazo_erro().setText("Preencha o Campo PRAZO corretamente.");

            return false;
        }
        this.tela.getPrazo_erro().setText("");
        return true;
    }
}
