/*
 * Descripción: Ejercicio 5
 * Autor: David Cantero García
 * Eecha: 16/10/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//crear variable para todo incluido los ceros, ngativos y positivos
		int num = 0, ceros = 0;
		double mediaPositivo = 0.0, mediaNegativo = 0.0, sumaPositivo, sumaNegativo, contadorPositivo, contadorNegativo;
		sumaPositivo = 0;
		sumaNegativo = 0;
		contadorPositivo = 0;
		contadorNegativo = 0;
		
		//se utiliza el bucle for ya que se cuantas repeticiones se hara (10)
		for (int contador = 0; contador != 10; contador++) {
			System.out.println("Dame un numero: ");
			num = teclado.nextInt();
		
			//si el numero que da el usuario es mayor a cero hace esta operacion
			if (num > 0) {
				sumaPositivo = sumaPositivo + num; //Suma los numeros positivos
				contadorPositivo = contadorPositivo + 1; //cuenta la cantidad de numeros positivos dados
				
				//si el numero que da el usuario es menor a cero hace esta operacion
			}else if (num < 0) {
				sumaNegativo = sumaNegativo + num; //Suma los numeros negativo
				contadorNegativo = contadorNegativo + 1;//cuenta la cantidad de numeros negativos dados
				
				//si es cero se raliza esta operacion contando unicamente la cantidad que hay
			} else {
				ceros = ceros + 1;
			}
			
		} 
		if (contadorPositivo > 0) { 
			mediaPositivo = sumaPositivo / contadorPositivo; //se hace la media entre la cantidad y la suma de positivos
			System.out.println("La media de números positivos es: " + mediaPositivo);
			
		} if (contadorNegativo > 0){
			mediaNegativo = sumaNegativo / contadorNegativo; //se hace la media entre la cantidad y la suma de negativos
			System.out.println("La media de números negativo es: " + mediaNegativo);
		}
		
			System.out.println("La cantidad de ceros es: " + ceros);
	}

}
