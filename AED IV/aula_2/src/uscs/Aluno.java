package uscs;

public class Aluno {
	
	String nome;
	int codMat;
	String cpf;
	char sexo;
	double notaP1;
	double notaP2;
	double notaP3;
	
	public Aluno(String nome, int codMat, String cpf, char sexo, double notaP1, double notaP2, double notaP3) {
		super();
		this.nome = nome;
		this.codMat = codMat;
		this.cpf = cpf;
		this.sexo = sexo;
		this.notaP1 = notaP1;
		this.notaP2 = notaP2;
		this.notaP3 = notaP3;
	}

	public void imprimeAluno() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Codigo de Matricula: " + this.codMat);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Nota P1: " + this.notaP1);
		System.out.println("Nota P2: " + this.notaP2);
		System.out.println("Nota P3: " + this.notaP3);
	}
	
	public double mediaAluno(){
		
		double media = (this.notaP1 + this.notaP2 + this.notaP3)/3;
		return media;
		
	}
	
	public void imprimeResultadoAluno() {
		
		if(this.mediaAluno() >= 6)
			System.out.println("Aluno Aprovado");
		else
			System.out.println("Aluno Reprovado");
		
		System.out.println("Media: " + this.mediaAluno());
		
	}
	
}
