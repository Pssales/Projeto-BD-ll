/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Camila
 */
@Entity
public class AlunoRequerimento implements Serializable{

    @Id
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id", referencedColumnName = "id")
    private Aluno aluno;

    @Id
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "requerimento_id", referencedColumnName = "id")
    private Requerimento requerimento;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "status_id", nullable = false)
    private Status status;
    
    /*@Column
    @Temporal(TemporalType.DATE)
    private Date data_requerimento;*/
    
    /* @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "servidor_id", nullable = false)
    private Servidor servidor;*/
    
    public AlunoRequerimento(){
        
    }

    public AlunoRequerimento(Aluno aluno, Requerimento requerimento, Status status) {
        this.aluno = aluno;
        this.requerimento = requerimento;
        this.status = status;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Requerimento getRequerimento() {
        return requerimento;
    }

    public void setRequerimento(Requerimento requerimento) {
        this.requerimento = requerimento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    /* public Date getData_requerimento() {
    return data_requerimento;
    }
    
    public void setData_requerimento(Date data_requerimento) {
    this.data_requerimento = data_requerimento;
    }*/

    /* public Servidor getServidor() {
    return servidor;
    }
    
    public void setServidor(Servidor servidor) {
    this.servidor = servidor;
    }*/  
   
}
