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
public class EntidadHospitalaria {

    private String hospital;
    private Ciudad ciudadHospital;
    private int especialidades;
    private double totalSueldos;
    private String direccion;
    private Medico[] medicos;
    private Enfermero[] enfermeros;

    public EntidadHospitalaria(String h, String d, int e,
             Ciudad c,Medico[] m, Enfermero[] ef){
        hospital = h;
        ciudadHospital= c;
        especialidades = e;
        direccion = d;
        medicos = m;
        enfermeros = ef;
    }

    public void establecerHospital(String h) {
        hospital = h;
    }

    public void establecerCiudadHospital(Ciudad c) {
        ciudadHospital = c;
    }
    
    public void establecerEspecialidades(int e) {
        especialidades = e;
    }

    public void establecerMedicos(Medico[] m) {
        medicos = m;
    }

    public void establecerEnfermeros(Enfermero[] ef) {
        enfermeros = ef;
    }

    public void establecerTotalSueldos() {
        double suma1 = 0;
        double suma2 = 0;
        for (int i = 0; i < obtenerMedicos().length; i++) {
            suma1 = suma1 + obtenerMedicos()[i].obtenerSueldoMedico();
        }
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            suma2 = suma2 + obtenerEnfermeros()[i].obtenerSueldoEnfermero();
        }

        totalSueldos = suma1 + suma2;
    }

    public void establecerDireccion(String d) {
        direccion = d;
    }

    public String obtenerHospital() {
        return hospital;
    }

    public Ciudad obtenerCiudadHospital() {
        return ciudadHospital;
    }
    
    public int obtenerEspecialidades() {
        return especialidades;
    }

    public Medico[] obtenerMedicos() {
        return medicos;
    }

    public Enfermero[] obtenerEnfermeros() {
        return enfermeros;
    }

    public double obtenerTotalSueldos() {
        return totalSueldos;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("%sHOSPITAL %s\n"
                + "Direcci??n: %s\nCiudad: %s\nProvincia: %s\nN??mero de "
                + "especialidades: %d\nListado m??dicos\n", cadena,
                obtenerHospital(),
                obtenerDireccion(),
                obtenerCiudadHospital().obtenerNombreCiudad(),
                obtenerCiudadHospital().obtenerProvincia(),
                obtenerEspecialidades());
        
        for (int i = 0; i < medicos.length; i++) {
            cadena = String.format("%s-%s - sueldo: %.2f - %s\n", cadena,
                    medicos[i].obtenerNombreMedico(),
                    medicos[i].obtenerSueldoMedico(),
                    medicos[i].obtenerEspecialidad());
        }
        
        cadena = String.format("%sListado de enfermeros (as):\n",cadena);
        for (int i = 0; i < enfermeros.length; i++) {
            cadena = String.format("%s-%s - sueldo: %.2f - %s\n", cadena,
                    enfermeros[i].obtenerNombreEnfermero(),
                    enfermeros[i].obtenerSueldoEnfermero(),
                    enfermeros[i].obtenerTipo());
        }
        cadena = String.format("%sTotal de sueldos a pagar por mes: %.2f\n",
                cadena, obtenerTotalSueldos());

        return cadena;

    }

}
