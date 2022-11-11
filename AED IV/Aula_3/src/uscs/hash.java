package uscs;

public class hash {
	public static void main(String[] args) {
		Integer[] UniversoValores = new Integer[1000];
		
		for (int i = 0; i < UniversoValores.length ; i++) {
			UniversoValores[i] = (int) (1000.0 * Math.random());
			System.out.println("Indice: " + i + " Valor: " + UniversoValores[i]);
		}
	}
}
