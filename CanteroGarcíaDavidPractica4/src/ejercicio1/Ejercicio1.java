/*
 * Descripción: Ejercicio 1
 * Autor: David Cantero García
 * Eecha: 01/10/2025
 */


package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); //Se añade Scanner para que pida al usuario datos 
		
		//realizar un programa para solicitar los datos al ususartio
		String nombre;
		System.out.print("Nombre: ");
		nombre = teclado.nextLine();
		
		String apellidos;
		System.out.print("Apellidos: ");
		apellidos = teclado.nextLine();
		
		String fechaNacimiento;
		System.out.print("Fecha de nacimiento: ");
		fechaNacimiento = teclado.nextLine();
		
		int salarioBruto;
		System.out.print("Salario bruto: ");
		salarioBruto = teclado.nextInt();
		
		int añosTrabajando;
		System.out.print("Años trabajando en la empresa: ");
		añosTrabajando = teclado.nextInt();
		
		//Calcular el salario neto del usuario
		double irpf;
		irpf = 0.15;
		
		double salarioNeto;
		salarioNeto = salarioBruto-irpf;
		
		System.out.println("Estimad@ " + nombre + " " + apellidos + ", su salario bruto es "
				+ salarioBruto + "€, teniendo en cuenta un IRPF del 15% su salario neto es "
				+ salarioNeto + "€");
		
		//Calcular el aumento de 2% por cada año trbajado
		double incremento;
		incremento = salarioNeto*0.02*añosTrabajando;
		
		
		//Calcular salario total
		double salarioTotal;
		salarioTotal = salarioNeto+incremento;
		System.out.print("Debido a sus " + añosTrabajando 
				+ " años trajando en la empresa su salario se incrementará en un 2% por cada año. El aumento es de "
				+ incremento + "€ y el salario total es " + salarioTotal + "€");
		
	}

}
