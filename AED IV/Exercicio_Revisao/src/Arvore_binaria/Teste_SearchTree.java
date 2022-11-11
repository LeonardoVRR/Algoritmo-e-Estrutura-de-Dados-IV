package Arvore_binaria;

public class Teste_SearchTree {
	
	public static void main(String[] args) {
		SearchTreeNode root = new SearchTreeNode(5, "Paulo");
		int[] valores = {81, 23, 40, 2, 77, 34, 25, 18, 1};
		String[] nomes = {"Ana", "José", "Lais", "Eric", "Heitor", "Pedro", "Leonardo", "Igor", "Sandro"};
		
		for(int i=0; i<valores.length; i++) {
			root.AddNode(valores[i], nomes[i]);
		}
		
		System.out.println("\nPreorder: ");
		root.preorder();
		
		System.out.println("\nPosorder: ");
		root.posorder();
		
		System.out.println("\nInorder ");
		root.inorder();
	}
}
