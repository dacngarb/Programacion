/*
 * Descripción: Ejercicio 1
 * Autor: David Cantero García
 * Eecha: 08/10/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//se pide los  datos al usuario
		System.out.print("Dime tu nombre: ");
		String nombre;
		nombre = teclado.nextLine();
		
		System.out.print("Dime tus apellidos: ");
		String apellido;
		apellido = teclado.nextLine();
		
		System.out.print("Dime tu edad: ");
		int edad;
		edad = teclado.nextInt();
		
		System.out.print("Dime tu salario deseado: ");
		int salarioDeseado;
		salarioDeseado = teclado.nextInt();
		
		//si el salario y la edad no son los requeridos salta que no cumple, sino sigue pidiendo datos
		if (salarioDeseado > 30000 || edad > 45) {
			System.out.print("Lo sentimos pero no cumple nuestro perfil");
		}else {
			System.out.print("Años de experiencia: ");
			int añosExperiencia;
			añosExperiencia = teclado.nextInt();
			
			System.out.print("Proyectos trabajados anteriormente: ");
			int proyectosAnteriores;
			proyectosAnteriores = teclado.nextInt();
			
			//si los años de experiencia y los proyectos trabajados no son los requeridos no esta contratado, sino esta contratado
			if (añosExperiencia > 2 && proyectosAnteriores > 3) {
				System.out.print("Enhorabuena. Ha sido contratado");
			} else {
				System.out.print("Lo sentimos pero no cumple nuestro perfil");
			}
			
		}
		
	}

}
