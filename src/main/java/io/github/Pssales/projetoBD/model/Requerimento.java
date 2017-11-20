/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Camila
 */
@Entity
public class Requerimento implements Serializable {
    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column(length = 80)
    private String nome;
    @Column(length = 4)
    private Integer prazo;

    public Requerimento(String nome, Integer prazo) {
        this.nome = nome;
        this.prazo = prazo;
    }
    public Requerimento() {
      
    }
        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPrazo() {
        return prazo;
    }

    public void setPrazo(Integer prazo) {
        this.prazo = prazo;
    }
    
    
}
