/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.controller;

import io.github.Pssales.projetoBD.dao.AlunoDAO;
import io.github.Pssales.projetoBD.model.Aluno;
import io.github.Pssales.projetoBD.views.CadastroAluno;

/**
 *
 * @author Camila
 */
public class AlunoController {
    
    private CadastroAluno tela;
    private AlunoDAO aDAO= new AlunoDAO();
    
    public AlunoController(CadastroAluno tela, String metodo) {
        this.tela = tela;
        if (validarNome()) {
            Aluno aluno = new Aluno(this.tela.getTxtNome().getText());
            if (metodo.equalsIgnoreCase("insert")) {
                aDAO.persist(aluno);
            } else if (metodo.equalsIgnoreCase("delete")) {
                aDAO.removeById(Long.valueOf(Integer.parseInt(this.tela.getjTAlunos().getValueAt(this.tela.getjTAlunos().getSelectedRow(), 0).toString())));
            } else if (metodo.equalsIgnoreCase("update")) {
                Aluno r = new Aluno();

                r.setNome(this.tela.getTxtNome().getText());
                r.setId(Long.valueOf(Integer.parseInt(this.tela.getjTAlunos().getValueAt(this.tela.getjTAlunos().getSelectedRow(), 0).toString())));
                aDAO.merge(r);
            }
            this.tela.getTxtNome().setText("");
            this.tela.writeJTable();
        }
    }

    public boolean validarNome() {
        if (this.tela.getTxtNome().getText().isEmpty()) {
            this.tela.getErro_nome().setText("Preencha o Campo NOME corretamente.");
            return false;
        }
        this.tela.getErro_nome().setText("");

        return true;
    }
}
