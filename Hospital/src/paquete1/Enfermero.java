/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author macbookair
 */
public class Enfermero {
    private String nombreEnfermero;
    private String tipo;
    private double sueldoEnfermero;
    
    public Enfermero(String n, String t, double s){
        nombreEnfermero = n;
        tipo = t;
        sueldoEnfermero = s;
    }
    
    public void establecerNombreEnfermero(String n){
        nombreEnfermero = n;
    }
    
    public void establecerTipo(String n){
        tipo = n;
    }
    
    public void establecerSueldoEnfermero(double n){
        sueldoEnfermero = n;
    }
    
    public String obtenerNombreEnfermero(){
        return nombreEnfermero;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public double obtenerSueldoEnfermero(){
        return sueldoEnfermero;
    }
}
