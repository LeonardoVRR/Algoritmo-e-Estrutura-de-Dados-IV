package QuickSort;

import java.util.Arrays;

public class QuickSort {

	public static int[] lista = {24,2,45,20,56,75,25,155,99,53,12};
	public static void main(String[] args) {

	int n = lista.length;
	Quicksort(0 , n-1);
	System.out.println(Arrays.toString(lista));

	}
	
	public static void Quicksort(int inicio, int fim) {

		int i = inicio;
		int j = fim;
		int pivot = lista[inicio+(fim-inicio)/2];
		
		while (i <= j) {
			
			while (lista[i] < pivot)
			i++;
			
				while (lista[j] > pivot)
				j--;
				
					if (i <= j) {
					troca(i, j);
					i++;
					j--;
					}
		}
		if (inicio < j)
			Quicksort(inicio, j);
		
			if (i < fim)
			Quicksort(i, fim);

			}
	
	public static void troca(int i, int j) {
		int temp = lista[i];
		lista[i] = lista[j];
		lista[j] = temp;
		}
}
