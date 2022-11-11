package Tecnica_Divisao_e_Conquista;

public class DivConquista_2 {
	public static void main(String[] args) {
	int[] lista = { 4,6,1,9,5,100 } ;
	int indiceInicio = 0;
	int indiceFim = lista.length-1;
	System.out.println("Soma dos valores da lista: " + soma(lista, indiceInicio, indiceFim));
	}
	
	public static Integer soma (int[] lista, int indiceInicio, int indiceFim) {
		if (indiceInicio == indiceFim )
		return lista[indiceInicio];
		int indiceMetade = (indiceInicio + indiceFim)/2;
		int s1 = soma(lista, indiceInicio, indiceMetade);
		int s2 = soma(lista, indiceMetade+1, indiceFim);
		return (s1 + s2);
		}
		
}


