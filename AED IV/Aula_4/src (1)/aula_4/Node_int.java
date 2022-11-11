package aula_4;

public class Node_int {
	
	Integer item;
	Node_int parent;
	Node_int firstChild;
	Node_int next;
	
	public Node_int (Integer item){
		this.item = item;
		this.parent = null;
		this.firstChild = null;
		this.next = null;
	}

	public void ImprimeFilhos(){
		if (this.firstChild ==null) System.out.println("Nó sem filhos...");
		
		else {
			Node_int trab = this.firstChild;
			
			while (trab != null) {
				System.out.println(trab.item);
				trab = trab.next;
			}
		}
	}
	
	public Node_int Pai() {
if (this.parent != null) {
	//System.out.println("Pai: " + this.parent.item );
	return this.parent;
	}
		
		else {
			//System.out.println("Este nó é root, não tem pai...");
			return null;
			}
	}
	
	public void ImprimePai() {
		if (this.parent != null) System.out.println("Pai: " + this.parent.item );
			
				
				else {
					System.out.println("Este nó é root, não tem pai...");
				}
			}
	
	public boolean EhInterno () {
		if (this.firstChild != null) return true;
		else 
			return false;
	}
			
	public void ImprimeFilhosFolhas() {
		if (this.firstChild == null) System.out.println ("Nó sem filhos...");
		
		else {
			Node_int trab = this.firstChild;
			
			while (trab != null) {
				
				if (!trab.EhInterno()) System.out.println(trab.item);
				trab = trab.next;
			}
		}
		
	}
	
}
