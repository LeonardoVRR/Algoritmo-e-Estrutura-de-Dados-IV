package Aula_6;

public class SearchTreeNode {
	
	SearchTreeNode parent;
	SearchTreeNode L_chield;
	SearchTreeNode R_chield;
	Integer key;
	String nome;
	
	public SearchTreeNode (int key, String nome) {	
		this.L_chield = null;
		this.R_chield = null;
		this.parent = null;
		this.key = key;
		this.nome = nome;
	}
	
	public SearchTreeNode left() {
		if (this.L_chield == null) return null;
		else return this.L_chield;
	}
	
	public SearchTreeNode Right() {
		if (this.R_chield == null) return null;
		else return this.R_chield;
	}
	
	public boolean hasLeft() {
		if (this.L_chield == null) return false;
		else return true;
	}
	
	public boolean hasRight() {
		if (this.R_chield == null) return false;
		else return true;
	}
	
	public void binaryPreorder() {
		System.out.println(this.key + " ");
		if (this.hasLeft()) this.L_chield.binaryPreorder();
		if (this.hasRight()) this.R_chield.binaryPreorder();
	}

	public void binaryPostorder() {
		if (this.hasLeft()) this.L_chield.binaryPostorder();
		if (this.hasRight()) this.R_chield.binaryPostorder();
		System.out.println(this.key + " ");
	}
	
	public void binaryInorder() {
		if (this.hasLeft()) this.L_chield.binaryInorder();
		System.out.println(this.key + " ");
		if (this.hasRight()) this.R_chield.binaryInorder();
	}
	
	public void addNode(int key, String nome) {
		SearchTreeNode newNode = new SearchTreeNode (key, nome);
		SearchTreeNode NodeTrab = this;
		
		while (true) {
			if(key < NodeTrab.key) {
				if (hasLeft() == false) {
					NodeTrab.L_chield = newNode;
					newNode.parent = NodeTrab;
					return;
				}
				else NodeTrab = NodeTrab.L_chield;
			}
			else {
				if(hasRight() == false) {
					NodeTrab.R_chield = newNode;
					newNode.parent = NodeTrab;
					return;
				}
				else NodeTrab = NodeTrab.R_chield;
			}
		}
	}
	
	public SearchTreeNode Search_key(int key) {
		SearchTreeNode NodeTrab = this;
		
		while (NodeTrab != null && NodeTrab.key != key) {
			if (key < NodeTrab.key) NodeTrab = NodeTrab.L_chield;
			else NodeTrab = NodeTrab.R_chield;
		}
		return NodeTrab;
	}
	
}
