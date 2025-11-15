/*
 * Descripción: Ejercicio 1
 * Autor: David Cantero García
 * Eecha: 05/11/2025
 */


package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		int [][] tamanyo = new int [5][5];
		int num = 0;

		//almacenar en la matriz con los numeros del 1 al 25
		for (int ancho = 0; ancho < tamanyo.length; ancho++) {
            for (int largo = 0; largo < tamanyo.length; largo++) {
            	tamanyo[ancho][largo] = num;
                num = num + 1;
            }
        }
		//Mostrar por pantalla
		for (int ancho = 0; ancho < tamanyo.length; ancho++) {
            for (int largo = 0; largo < tamanyo.length; largo++) {
            	tamanyo[ancho][largo] = num;
            	num = num - 1;
            	System.out.print(tamanyo[ancho][largo] + "\t");
            	
            }
            System.out.println();
        }
		

	}

}
