/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.model;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Camila
 */
@Entity
public class Aluno implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    /* @OneToOne
    private Matricula matricula;*/
    @Column
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }
    
    public Aluno() {
  
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*public Matricula getMatricula() {
    return matricula;
    }
    
    public void setMatricula(Matricula matricula) {
    this.matricula = matricula;
    }*/
}
