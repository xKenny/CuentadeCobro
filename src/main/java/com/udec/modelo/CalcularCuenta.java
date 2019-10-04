/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.modelo;

import com.udec.controlador.Profesional;

/**
 *
 * @author dalej
 */
public class CalcularCuenta {
    private Profesional profesional;

    public CalcularCuenta(Profesional profesional) {
        this.profesional = profesional;
    }
    
    public String saberGene(){
        String resultado = "";
        if(profesional.getGenero() == 'M'){
            resultado = "Señor";
        }else if(profesional.getGenero() == 'F'){
            resultado = "Señora";
        }else if(profesional.getGenero() == 'O'){
            resultado = "Señor@";
        }
        return resultado;
    }
    public String saberIdiomas(){
        String idiomasString;
        if(!(profesional.getIdiomas().isEmpty())){
            idiomasString = "Por sus idiomas:  " + (String.valueOf(profesional.getIdiomas()));
        }else
            idiomasString = "";
        return idiomasString;
    }
    public long calcularTotal(){
        long total = 0;
        long sueldo =0;
        switch(profesional.getProfesion()){
            case "Ingeniero":
                sueldo = 2000000;
                break;
            case "Tecnologo":
                sueldo = 1500000;
                break;
            case "Tecnico":
                sueldo = 1000000;
                break;
            case "Auxiliar": 
                sueldo = 850000;
                break;
        }
        if(!(profesional.getIdiomas().isEmpty())){
            for(String idiomas : profesional.getIdiomas()) {
                if(idiomas.equals("Ingles")){
                    total = total + 250000;
                }else if(idiomas.equals("Frances")){
                    total = total +350000;
                }else if(idiomas.equals("Aleman")){
                    total = total + 500000;
                }
            }
        }
        if(profesional.getUbicacion().equals("Afueras")){
            total = total + 80000;
        }
        sueldo = sueldo*(profesional.getDiasTrabajados());
        total = total + sueldo;
        return total;
    }
}
