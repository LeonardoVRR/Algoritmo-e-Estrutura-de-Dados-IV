package Arvore_binaria;

public class SearchTreeNode {
	
	static int soma = 0;
	static int contador = 0;
	int key;
	String nome;
	SearchTreeNode parent;
	SearchTreeNode left;
	SearchTreeNode right;

	public SearchTreeNode (int key, String nome) {
		this.key = key;
		this.nome = nome;
		this.parent = null;
		this.left = null;
		this.right = null;
	}
	
	public SearchTreeNode left() {
		if (this.left == null) return null;
		else return this.left;
	}
	
	public boolean hasleft() {
		if (this.left == null) return false;
		else return true;
	}
	
	public SearchTreeNode right() {
		if (this.right == null) return null;
		else return this.left;
	}
	
	public boolean hasright() {
		if (this.right == null) return false;
		else return true;
	}
	
	public void preorder() {
		System.out.println(this.key +" ");
		if(this.hasleft()) this.left.preorder();
		if(this.hasright()) this.right.preorder();
	}
	
	public void posorder() {
		if(this.hasleft()) this.left.posorder();
		if(this.hasright()) this.right.posorder();
		System.out.println(this.key +" ");
	}
	
	public void inorder() {
		if(this.hasleft()) this.left.inorder();
		System.out.println(this.key +" ");
		if(this.hasright()) this.right.inorder();
	}
	
	public void AddNode(int key, String nome) {
		SearchTreeNode newNode = new SearchTreeNode (key, nome);
		SearchTreeNode NodeTrab = this;
		while (true) {
			if (key < NodeTrab.key) {
				if (NodeTrab.left == null) {
					NodeTrab.left = newNode;
					NodeTrab.parent = NodeTrab;
					//newNode.nome = nome;
					return;
				}
				else NodeTrab = NodeTrab.left;
			}
			else {
				if (NodeTrab.right == null) {
					NodeTrab.right = newNode;
					NodeTrab.parent = NodeTrab;
					//newNode.nome = nome;
					return;
				}
				else NodeTrab = NodeTrab.right;
			}
		}	
	}
	
	public SearchTreeNode Search_key(int key) {
		SearchTreeNode nodeTrab = this;
		while (nodeTrab != null && nodeTrab.key != key) {
			if(key < nodeTrab.key) nodeTrab = nodeTrab.left;
			else nodeTrab = nodeTrab.right;
		}
		return nodeTrab;
	}
	
	public void SomaNodes() {
		SearchTreeNode.soma = SearchTreeNode.soma + this.key;
		SearchTreeNode.contador++;
		if (this.hasleft()) this.left.SomaNodes();
		if (this.hasright()) this.right.SomaNodes();
	}
	
	public void ImprimeMedia() {
		this.SomaNodes();
		System.out.println(SearchTreeNode.soma/SearchTreeNode.contador);
	}
	
}