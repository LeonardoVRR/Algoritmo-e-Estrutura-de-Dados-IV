package uscs;

import java.util.Scanner;

public class atividade_5 {
	
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		System.out.print("Qual o seu nome ? ");
		String nome = in.nextLine();
		System.out.print("Quantos anos voc� tem ?");
		int idade = in.nextInt();
		System.out.println("Ol� " + nome + "," + "voc� tem " + idade + " anos...");
		
	}

}
