package uscs;

import java.util.Scanner;

public class scanner {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = in.nextLine();
		
		System.out.println("Quantos anos você tem ?");
		int idade = in.nextInt();
		
		System.out.println("Olá " + nome + "," + " você tem " + idade + " anos...");
		in.close();
		
	}

}
