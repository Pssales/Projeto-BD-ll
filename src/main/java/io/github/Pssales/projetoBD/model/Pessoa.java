package io.github.Pssales.projetoBD.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private String nome;
    @Column
    @Temporal(TemporalType.DATE)
    private Date nascimento;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "sexo_id", nullable = false)
    private Sexo sexo;

    @OneToMany(
            mappedBy = "pessoa",
            targetEntity = Matricula.class,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private final List<Matricula> matriculas = new ArrayList<Matricula>();
    @OneToMany(
            mappedBy = "pessoa",
            targetEntity = Documento.class,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private final List<Documento> documentos = new ArrayList<Documento>();
    @OneToMany(
            mappedBy = "pessoa",
            targetEntity = Telefone.class,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private final List<Telefone> telefones = new ArrayList<Telefone>();

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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

}
