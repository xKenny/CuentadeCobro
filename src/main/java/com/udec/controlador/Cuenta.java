/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controlador;

import com.udec.modelo.CalcularCuenta;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *Clase que maneja los controladores de la vista "cobro"
 * @author Duvan Poveda
 */
@Named
@SessionScoped
public class Cuenta implements Serializable {
    /**
    *injeccion del objeto profesional
    */
    @Inject
    private Profesional profesional;
    
    
    private long sueldo;
    private String generoFormal;
    private String idiomas;
    /**
    *metodo que llama la logica del aplicativo
    */
    public void hacerCuenta(){
        CalcularCuenta calcular = new CalcularCuenta(profesional);
        sueldo = calcular.calcularTotal();
        generoFormal = calcular.saberGene();
        idiomas = calcular.saberIdiomas();
    } 
    
    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getGeneroFormal() {
        return generoFormal;
    }

    public void setGeneroFormal(String generoFormal) {
        this.generoFormal = generoFormal;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
}
