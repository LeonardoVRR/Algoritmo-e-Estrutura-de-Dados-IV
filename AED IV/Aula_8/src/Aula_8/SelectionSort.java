package Aula_8;

import java.util.Arrays;

public class SelectionSort {
	public static int contador = 0;
	
	public static void main(String[] args) { 
		int qtd = 1000;
		int[] lista1 = new int[qtd];
		lista1[0]=qtd;
		int qtd_posicoes = qtd;
		for(int i=1;i<lista1.length;i++)
			lista1[i]=lista1[i-1]-1;
		
		System.out.println("Lista antes da execução do Selection Sort");
		System.out.println (Arrays.toString(lista1)); 

		lista1 = selection_sort(lista1); 

		System.out.println("*********************************************************");
		System.out.println("Lista depois da execução do Selection Sort");
		System.out.println (Arrays.toString(lista1));
		System.out.println("*********************************************************");
		
		System.out.println("Total de operações p/array com " + qtd_posicoes + " posições: " + contador);
		
	}
    public static int[] selection_sort(int[] lista) { 

	int menor, indiceMenor;  

	for (int i = 0 ;  i < lista.length - 1 ; i++) { 

		menor = lista[i]; 
		indiceMenor = i ; 

		for (int j = i+1 ;  j < lista.length ; j++) { 

			if (lista[j] < menor) { 
				contador++;
				menor = lista[j]; 
				indiceMenor = j; 
			} 
		}
		lista[indiceMenor] = lista[i]; 

		lista[i]=menor; 
	} 
	return lista; 
    }
} 