/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.Pssales.projetoBD.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Camila
 */
public class TerminoMatricula {
    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private Date data;
    private Matricula matricula;
    
}
