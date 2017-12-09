/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Camila
 */
@Entity
public class Status implements Serializable{
    @Id
    @GeneratedValue
    @Column
    private Integer id;
    
    @Column(length = 20)
    private String status;
    
    @OneToMany(
            mappedBy = "status",
            targetEntity = AlunoRequerimento.class,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private final List<AlunoRequerimento> aluno_requerimento = new ArrayList<AlunoRequerimento>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public List<AlunoRequerimento> getAluno_requerimento() {
        return aluno_requerimento;
    }

    
    

    
}
