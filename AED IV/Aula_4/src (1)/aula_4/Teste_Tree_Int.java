package aula_4;

public class Teste_Tree_Int {
	
	public static void main(String[] args) {
		//criação dos nós da arvore
		Node_int no_8 = new Node_int(8);
		Node_int no_7 = new Node_int(7);
		Node_int no_6 = new Node_int(6);
		Node_int no_5 = new Node_int(5);
		Node_int no_4 = new Node_int(4);
		Node_int no_3 = new Node_int(3);
		Node_int no_2 = new Node_int(2);
		Node_int no_1 = new Node_int(1);
		Node_int no_0 = new Node_int(0);
	
	//criação da arvore
	no_0.parent = null;
	no_0.firstChild = no_1;
	no_0.item = 5;
	no_0.next = null;
		
	no_1.parent = no_0;
	no_1.firstChild = null;
	no_1.next = no_2;
	
	no_2.parent = no_0;
	no_2.firstChild = no_4;
	no_2.next = no_3;
	
	no_3.parent = no_0;
	no_3.firstChild = null;
	no_3.next = null;
	
	no_4.parent = no_2;
	no_4.firstChild = null;
	no_4.next = no_5;
	
	no_5.parent = no_2;
	no_5.firstChild = no_8;
	no_5.next = no_6;
	
	no_6.parent = no_2;
	no_6.firstChild = null;
	no_6.next = no_7;
	
	no_7.parent = no_2;
	no_7.firstChild = null;
	no_7.next = null;
	
	no_8.parent = no_5;
	no_8.firstChild = null;
	no_8.next = null;
	
	System.out.println("Filhos do nó 0");
	no_0.ImprimeFilhos();
	System.out.println("Filhos do nó 2");
	no_2.ImprimeFilhos();
	System.out.println("Filhos do nó 5");
	no_5.ImprimeFilhos();
	
	}

}