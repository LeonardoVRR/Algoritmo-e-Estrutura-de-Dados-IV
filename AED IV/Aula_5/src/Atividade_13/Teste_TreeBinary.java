package Atividade_13;

public class Teste_TreeBinary {
	public static void main(String[] args) {
		NODEBIN no_50 = new NODEBIN (50);
		NODEBIN no_45 = new NODEBIN (45);
		NODEBIN no_37 = new NODEBIN (37);
		NODEBIN no_34 = new NODEBIN (34);
		NODEBIN no_46 = new NODEBIN (46);
		NODEBIN no_70 = new NODEBIN (70);
		NODEBIN no_68 = new NODEBIN (68);
		NODEBIN no_89 = new NODEBIN (89);
		
		no_50.parent = null;
		no_50.leftchield = no_45;
		no_50.rightchield = no_70;
		
		no_45.parent = no_50;
		no_45.leftchield = no_37;
		no_45.rightchield = no_46;
		
		no_46.parent = no_45;
		no_46.leftchield = null;
		no_46.rightchield = null;
		
		no_37.parent = no_45;
		no_37.leftchield = no_34;
		no_37.rightchield = null;
		
		no_34.parent = no_37;
		no_34.leftchield = null;
		no_34.rightchield = null;
		
		no_70.parent = no_50;
		no_70.leftchield = no_68;
		no_70.rightchield = no_89;
		
		no_68.parent = no_70;
		no_68.leftchield = null;
		no_68.rightchield = null;
		
		no_89.parent = no_70;
		no_89.leftchield = null;
		no_89.rightchield = null;
		
		System.out.println("Filhos do nó 50");
		no_50.preorder();
	}

}
