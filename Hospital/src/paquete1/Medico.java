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
public class Medico {
    private String nombreMedico;
    private String especialidad;
    private double sueldoMedico;
    
    public Medico(String n, String e, double s){
        nombreMedico = n;
        especialidad = e;
        sueldoMedico = s;
    }
    
    public void establecerNombreMedico(String n){
        nombreMedico = n;
    }
    
    public void establecerEspecialidad(String n){
        especialidad = n;
    }
    
    public void establecerSueldoMedico(double n){
        sueldoMedico = n;
    }
    
    public String obtenerNombreMedico(){
        return nombreMedico;
    }
    
    public String obtenerEspecialidad(){
        return especialidad;
    }
    
    public double obtenerSueldoMedico(){
        return sueldoMedico;
    }
}
