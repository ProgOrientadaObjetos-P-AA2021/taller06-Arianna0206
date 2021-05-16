/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import paquete1.Ciudad;
import paquete1.Enfermero;
import paquete1.EntidadHospitalaria;
import paquete1.Medico;

/**
 *
 * @author macbookair
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        String nombreHospital;
        String nombreCiudad;
        String lugar;
        String provincia;
        Ciudad ciudadHospital;
        int numeroMedicos;
        Medico[] conjuntoMedicos;
        int numeroEnfermeros;
        Enfermero[] conjuntoEnfermeros;
        int numeroEspecialidades;

        System.out.println("Ingrese el nombre del hospital");
        nombreHospital = entrada.nextLine();
        System.out.println("Ingrese la dirección del hospital");
        lugar = entrada.nextLine();
        System.out.println("Ingrese el número de médicos");
        numeroMedicos = entrada.nextInt();
        System.out.println("Ingrese el número de enfermeros");
        numeroEnfermeros = entrada.nextInt();
        
        numeroEspecialidades = numeroMedicos + numeroEnfermeros;

        entrada.nextLine();
        System.out.println("Ingrese el nombre de la ciudad");
        nombreCiudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de la provincia");
        provincia = entrada.nextLine();
        ciudadHospital = new Ciudad(nombreCiudad, provincia);

        conjuntoMedicos = new Medico[numeroMedicos];
        
        for (int i = 0; i < numeroMedicos; i++) {
            String nombreMedico[] = new String[numeroMedicos];
            String especialidad[] = new String[numeroMedicos];
            double sueldo1[] = new double[numeroMedicos];
            
            System.out.println("Ingrese el nombre del doctor");
            nombreMedico[i] = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Ingrese la especialidad del doctor");
            especialidad[i] = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe el doctor");
            sueldo1[i] = entrada.nextDouble();

            Medico m = new Medico(nombreMedico[i], especialidad[i], sueldo1[i]);
            conjuntoMedicos[i] = m;

        }

        conjuntoEnfermeros = new Enfermero[numeroEnfermeros];
        for (int j = 0; j < numeroEnfermeros; j++) {
            
            String nombre[] = new String[numeroEnfermeros];
            String tipo[] = new String[numeroEnfermeros];
            double sueldo[] = new double[numeroEnfermeros];
            
            System.out.println("Ingrese el nombre del enfermero o de la "
                    + "enfermera ");
            nombre[j] = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Ingrese el tipo del enfermero o de la "
                    + "enfermera");
            tipo[j] = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe el enfermero o la"
                    + " enfermera");
            sueldo[j] = entrada.nextDouble();

            Enfermero ef = new Enfermero(nombre[j], tipo[j], sueldo[j]);
            conjuntoEnfermeros[j] = ef;
        }

        EntidadHospitalaria entidad = new EntidadHospitalaria(nombreHospital,
                lugar, numeroEspecialidades, ciudadHospital,
                conjuntoMedicos, conjuntoEnfermeros);

        entidad.establecerTotalSueldos();
        System.out.printf("\n%s\n", entidad);

    }
}
