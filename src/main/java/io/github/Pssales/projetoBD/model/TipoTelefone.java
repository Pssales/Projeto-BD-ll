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
public class TipoTelefone implements Serializable{
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column(length = 20)
    private String tipo;
    
    @OneToMany(
            mappedBy = "tipoTelefone",
            targetEntity = Telefone.class,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private final List<Telefone> telefones = new ArrayList<Telefone>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
