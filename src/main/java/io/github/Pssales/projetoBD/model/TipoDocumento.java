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
public class TipoDocumento implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private String sexo;
    @OneToMany(
            mappedBy = "tipoDocumento",
            targetEntity = Documento.class,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private final List<Documento> documentos = new ArrayList<Documento>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
