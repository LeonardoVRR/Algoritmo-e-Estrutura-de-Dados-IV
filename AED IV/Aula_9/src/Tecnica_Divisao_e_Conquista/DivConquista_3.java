package Tecnica_Divisao_e_Conquista;

public class DivConquista_3 {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		System.out.println("Potencia de " + x + " elevado a " + n + " : " + pot(x,n));
		}
	
	public static Long pot (int x , int n) {
		if (n == 0) return 1L;
		if (n%2 == 0)
		return (pot (x, n/2 ) * pot(x,n/2) );
		else
		return (pot (x, (n-1)/2 ) * pot(x, (n-1)/2) * x ) ;
		}
	
}
