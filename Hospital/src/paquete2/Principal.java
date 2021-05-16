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
        
        int numeroMedicos;
        Medico[] conjuntoMedicos;
        int numeroEnfermeros;
        Enfermero[] conjuntoEnfermeros;
        int numeroEspecialidades;
        String nombre;
        String tipo;
        double sueldo;
        String nombreMedico;
        String especialidad;
        double sueldo1;

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
        Ciudad ciu = new Ciudad(nombreCiudad, provincia);

        conjuntoMedicos = new Medico[numeroMedicos];
        
        for (int i = 0; i < numeroMedicos; i++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del doctor");
            nombreMedico = entrada.nextLine();
            System.out.println("Ingrese la especialidad del doctor");
            especialidad = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe el doctor");
            sueldo1 = entrada.nextDouble();

            Medico m = new Medico (nombreMedico, especialidad, sueldo1);
            conjuntoMedicos[i] = m;

        }

        conjuntoEnfermeros = new Enfermero[numeroEnfermeros];
        for (int j = 0; j < numeroEnfermeros; j++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del enfermero o de la "
                    + "enfermera ");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese el tipo del enfermero o de la "
                    + "enfermera");
            tipo = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe el enfermero o la"
                    + " enfermera");
            sueldo = entrada.nextDouble();

            Enfermero ef = new Enfermero(nombre, tipo, sueldo);
            conjuntoEnfermeros[j] = ef;
        }

        EntidadHospitalaria entidad = new EntidadHospitalaria(nombreHospital,
                lugar, numeroEspecialidades, ciu,
                conjuntoMedicos, conjuntoEnfermeros);

        entidad.establecerTotalSueldos();
        System.out.printf("\n%s\n", entidad);

    }
}
