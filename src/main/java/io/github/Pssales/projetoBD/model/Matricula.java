/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.model;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Camila
 */
@Entity
public class Matricula implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private String matricula;
    @Column
    @Temporal(TemporalType.DATE)
    private Date data_matricula;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "pessoa_id", nullable = false)
    private Pessoa pessoa;

    @OneToOne(mappedBy = "matricula")
    @NotNull
    private Aluno aluno;
    @OneToOne(mappedBy = "matricula")
    @NotNull
    private Servidor servidor;
    @OneToOne(mappedBy = "matricula")
    @NotNull
    private Usuario usuario;
    @OneToOne(mappedBy = "matricula")
    @NotNull
    private TerminoMatricula terminoMatricula;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getData_matricula() {
        return data_matricula;
    }

    public void setData_matricula(Date data_matricula) {
        this.data_matricula = data_matricula;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
