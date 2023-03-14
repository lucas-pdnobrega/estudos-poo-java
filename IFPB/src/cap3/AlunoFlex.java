package cap3;

import java.util.Arrays;

public class AlunoFlex {
	private String nome;
	private double[] notas;
	
	public AlunoFlex(double... notas) {
		this.notas = notas;
	}
	
	public AlunoFlex(String nome, double... notas) {
		this.nome = nome;
		this.notas = notas;
	}
	
	@Override
	public String toString() {
		return String.format("- Aluno %s -%nnotas = %s", nome, Arrays.toString(notas));
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getNota(int i) {
		return notas[i];
	}
	
	public double getMedia() {
		double total = 0;
		for (double i : notas) {
			total+=i;
		}
		return (total)/notas.length;
	}
	
	public String getSituacao() {
		if (this.getMedia() > 70) return "aprovado";
		if (this.getMedia() > 50) return "final";
		else return "reprovado";
	}
}
