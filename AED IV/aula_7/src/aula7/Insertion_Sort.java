package aula7;

import java.util.Arrays;

public class Insertion_Sort {
	
	public static int contador=0;

	public static void main (String[] args ) { 
		
		int[] lista1 = new int[10];

		for(int i=1;i<lista1.length;i++)
			lista1[i]= (int) (100.0 *Math.random());
		
		System.out.println("Array antes da operação");
		System.out.println (Arrays.toString(lista1) );

		lista1 = sortInsertion(lista1); 

		System.out.println("\nArray apos a operação");
		System.out.println (Arrays.toString(lista1) );
		System.out.println("Total de operações p/array com 10 posições:  " + contador); 
	

	}
	public static int[] sortInsertion(int[] lista)   { 

		int i, j, aux; 

		for (i = 1; i < lista.length; i++)  { 

			aux = lista[i]; 

			j = i; 

			while (j > 0 && lista[j-1] > aux) { 
				contador++;

				lista[j] = lista[j-1]; 

				j--; 
			}

			lista[j] = aux; 
		}

		return lista; 
	}

}
