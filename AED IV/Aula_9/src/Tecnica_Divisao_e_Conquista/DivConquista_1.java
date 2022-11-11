package Tecnica_Divisao_e_Conquista;

public class DivConquista_1 {
	
	public static void main(String[] args) {
		int[] lista = { 4,133,1,9,5,99,2 } ;
		int indiceInicio = 0;
		int indiceFim = lista.length-1;
		System.out.println("Maximo valor da lista: " + maximo(lista, indiceInicio, indiceFim));
		}
	
	public static Integer maximo (int[] lista, int indiceInicio, int indiceFim) {
		if ( indiceInicio == indiceFim )
		return lista[indiceInicio] ;

		int indiceMetade = ( indiceInicio + indiceFim ) / 2;
		Integer m1 = maximo(lista, indiceInicio, indiceMetade);
		Integer m2 = maximo(lista, indiceMetade+1, indiceFim);
		if (m1 >= m2) return m1;
		else return m2;

		}
}