/*
 * Descripción: Ejercicio 4
 * Autor: David Cantero García
 * Eecha: 06/11/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Número de alumnos y asignaturas
         final int numAlumnos = 4;
        final int numAsignaturas = 5;

        //Matriz para almacenar las notas
        double[][] notas = new double[numAlumnos][numAsignaturas];

        // Pedir las notas por teclado
        for (int alumno = 0; alumno < numAlumnos; alumno++) {
            System.out.println("Introduce las notas del Alumno " + (alumno + 1) + ":");
            
            for (int asignatura = 0; asignatura < numAsignaturas; asignatura++) {
                System.out.print("Asignatura " + (asignatura + 1) + ": ");
                notas[alumno][asignatura] = teclado.nextDouble();
            }
        }

        //Calcular y mostrar resultados para cada alumno
        for (int alumno = 0; alumno < numAlumnos; alumno++) {
            double min = notas[alumno][0];
            double max = notas[alumno][0];
            double suma = 0;

            for (int asignatura = 0; asignatura < numAsignaturas; asignatura++) {
                double nota = notas[alumno][asignatura];
                if (nota < min) min = nota;
                if (nota > max) max = nota;
                suma += nota;
            }

            double media = suma / numAsignaturas;

            System.out.println("------------------------");
            System.out.println("Resultados del Alumno " + (alumno + 1) + ":");
            System.out.println("Nota mínima: " + min);
            System.out.println("Nota máxima: " + max);
            System.out.println("Nota media: " + media);
        }

	}

}
