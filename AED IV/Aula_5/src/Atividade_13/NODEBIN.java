package Atividade_13;

public class NODEBIN {
	Integer item;
	NODEBIN parent;
	NODEBIN rightchield;
	NODEBIN leftchield;
	
	public NODEBIN (Integer item) {
		this.item = null;
		this.parent = null;
		this.leftchield = null;
		this.rightchield = null;
	}
	
	public boolean isEmpty() {
		if (this.item == null) return true;
		else return false;
	}

	public NODEBIN left() {
		if (this.leftchield ==null) return null;
		
		else return this.leftchield;
		}
	
	public NODEBIN rigth() {
		if (this.rightchield ==null) return null;
		
		else return this.rightchield;
		}
	
	public boolean isRight() {
		if (this.rightchield ==null) return true;
		
		else return false;
	}
	
	public boolean isLeft() {
		if (this.leftchield ==null) return true;
		
		else return false;
	}
	
	public void preorder() {
		System.out.println(this.item);
		if (this.isLeft()) this.leftchield.preorder();
		if (this.isRight()) this.rightchield.preorder();
	}
	
	public void postorder() {
		if (this.isLeft()) this.leftchield.postorder();
		if (this.isRight()) this.rightchield.postorder();
		System.out.println(this.item);
	}
	
	public void inorder() {
		if (this.isLeft()) this.leftchield.inorder();
		System.out.println(this.item);
		if (this.isRight()) this.rightchield.inorder();
	}
}
