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
 * @author a1600222
 */
@Entity
public class Sexo implements Serializable{

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column(length = 20)
    private String sexo;
    
    @OneToMany(
		mappedBy = "sexo", 
		targetEntity = Pessoa.class, 
		fetch = FetchType.LAZY, 
		cascade = CascadeType.ALL)
	private final List<Pessoa> pessoas = new ArrayList<Pessoa>();
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
