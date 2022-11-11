package uscs;

public class ListaColisao {
	
	public Node first;
	public Node last;
	public Integer size;
	
	public ListaColisao (){
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public void insereFim (Integer n) { // função que insere um novo nó na lista
		Node novo_node = new Node(n);
		if (this.size == 0) { //lista vazia
			this.first = novo_node;
			this.last = novo_node;
			this.size = this.size + 1;
		}
		else {// lista já tem alguns Nodes
			this.last.next = novo_node;
			this.last = novo_node;
			this.size = this.size + 1;
		}
	}
	
	public void imprimeLista() {
		if (this.size == 0) {
			System.out.println("Lista Vazia...");
		}
		else {
			Node Nodetrab = this.first;
			System.out.println("\nDados na Lista:");
			while(Nodetrab != null) {
				System.out.println(Nodetrab.item + "");
				Nodetrab = Nodetrab.next;
			}
			System.out.println(" ");
		}
	}

	
	
}
