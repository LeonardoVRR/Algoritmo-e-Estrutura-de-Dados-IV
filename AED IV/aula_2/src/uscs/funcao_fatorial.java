package uscs;

public class funcao_fatorial {

	public static void main(String[] args) {
		
		int n = 10;
		System.out.println("Fatorial (" + n + ") = "+ fatorial(n));
		
	}
	
	public static int fatorial(int n) {
		
		if (n==0)
			return 1; //caso basico
		
		else
			return (n*fatorial(n-1)); //caso recursivo
		
	}
	
}
