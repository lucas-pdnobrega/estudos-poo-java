package cap3;

public class Aluno {
	private String nome;
	private int nota1;
	private int nota2;

	public Aluno(String nome, int nota1, int nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public int getMedia() {
		return (int)((nota1 + nota2)/2);
	}
	
	public String getSituacao() {
		if (this.getMedia() > 70) return "aprovado";
		else if (this.getMedia() > 50) return "final";
		else return "reprovado";
	}
}
