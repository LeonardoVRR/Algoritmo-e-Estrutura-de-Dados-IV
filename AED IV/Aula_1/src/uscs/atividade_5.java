package uscs;

import java.util.Scanner;

public class atividade_5 {
	
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		System.out.print("Qual o seu nome ? ");
		String nome = in.nextLine();
		System.out.print("Quantos anos você tem ?");
		int idade = in.nextInt();
		System.out.println("Olá " + nome + "," + "você tem " + idade + " anos...");
		
	}

}
