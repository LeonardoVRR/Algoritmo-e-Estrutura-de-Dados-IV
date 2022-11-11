package aula7;

import java.util.Arrays;

public class Bubble_Short {

	public static int contador=0;

	public static void main (String [] args ) { 
		
		int[] lista1 = new int[10];
		lista1[0]=10;
		for(int i=1;i<lista1.length;i++)
			lista1[i]= (int) (100.0 *Math.random());

		System.out.println("Array antes da operação");
		System.out.println (Arrays.toString(lista1) );
		
		lista1 = bubble(lista1); 

		System.out.println("\nArray apos a operação");
		System.out.println (Arrays.toString(lista1) );
		System.out.println("Total de operações p/array com 10 posições:  " + contador); 
		
	
	
	}
	public static int[] bubble(int[] lista) { 

		int aux; 
		int n = lista.length; 

		for (int i = 1; i < n ; i++ ) 
			for (int j = 1; j < n ; j ++) {
				if (lista[j-1]  > lista[j] )  { 
					contador++;
					aux = lista[j-1]; 
					lista[j-1] = lista[j]; 
					lista[j] = aux; 
				}
			}
		return lista; 
	}
	
}
