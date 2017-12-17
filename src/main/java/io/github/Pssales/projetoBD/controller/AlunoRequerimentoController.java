/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.controller;

import io.github.Pssales.projetoBD.dao.AlunoRequerimentoDAO;
import io.github.Pssales.projetoBD.model.AlunoRequerimento;
import io.github.Pssales.projetoBD.views.CadastroAlunoRequerimento;

/**
 *
 * @author Camila
 */
public class AlunoRequerimentoController {

    CadastroAlunoRequerimento tela;
    AlunoRequerimentoDAO ardao = new AlunoRequerimentoDAO();

    public AlunoRequerimentoController(CadastroAlunoRequerimento tela, String metodo) {
        this.tela = tela;
        if (validaAluno() && validaRequerimento() && validaStatus()) {
            if (metodo.equalsIgnoreCase("insert")) {
                AlunoRequerimento ad = new AlunoRequerimento();
                ad.setAluno(this.tela.getAlunos().get(this.tela.getCbAlunos().getSelectedIndex() - 1));
                ad.setRequerimento(this.tela.getRequerimentos().get(this.tela.getCbRequerimentos().getSelectedIndex() - 1));
                ad.setStatus(this.tela.getStatus().get(this.tela.getCbStatus().getSelectedIndex() - 1));
                
                ardao.persist(ad);
            } else if (metodo.equalsIgnoreCase("delete")) {
                ardao.removeById(Long.valueOf(Integer.parseInt(this.tela.getjTAlunoRequerimento().getValueAt(this.tela.getjTAlunoRequerimento().getSelectedRow(), 0).toString())));
            } else if (metodo.equalsIgnoreCase("update")) {
                AlunoRequerimento ar = ardao.getById(Long.valueOf(Integer.parseInt(this.tela.getjTAlunoRequerimento().getValueAt(this.tela.getjTAlunoRequerimento().getSelectedRow(), 0).toString())));
                ar.setAluno(this.tela.getAlunos().get(this.tela.getCbAlunos().getSelectedIndex() - 1));
                ar.setRequerimento(this.tela.getRequerimentos().get(this.tela.getCbRequerimentos().getSelectedIndex() - 1));
                ar.setStatus(this.tela.getStatus().get(this.tela.getCbStatus().getSelectedIndex() - 1));

                ardao.merge(ar);
            }
            this.tela.getErro().setText("");

            this.tela.getCbAlunos().setSelectedIndex(0);
            this.tela.getCbRequerimentos().setSelectedIndex(0);
            this.tela.getCbStatus().setSelectedIndex(0);

            this.tela.writeJTable();
        }
    }

    public boolean validaAluno() {
        if (this.tela.getCbAlunos().getSelectedIndex() == 0) {
            this.tela.getErro().setText("Selecione o Aluno");
            return false;
        }
        return true;
    }

    public boolean validaRequerimento() {
        if (this.tela.getCbRequerimentos().getSelectedIndex() == 0) {
            this.tela.getErro().setText("Selecione o Requerimento");
            return false;
        }
        return true;
    }

    public boolean validaStatus() {
        if (this.tela.getCbStatus().getSelectedIndex() == 0) {
            this.tela.getErro().setText("Selecione o Status");
            return false;
        }
        return true;
    }
}
