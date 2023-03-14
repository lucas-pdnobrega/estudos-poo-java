package cap3;

public class Retangulo {
	private int id;
	private double largura;
	private double comprimento;
	
	public Retangulo(int id, double largura, double comprimento) {
		this.id = id;
		this.largura = largura;
		this.comprimento = comprimento;
	}
	
	public Retangulo(double medida) {
		this.id = 1;
		this.largura = this.comprimento = medida;	
	}
	
	public Retangulo() {
		this.id = 1;
		this.largura = 5;
		this.comprimento = 5;
	}
	
	@Override
	public String toString() {
		return String.format("- Retangulo -%nid = %s%nlargura = %s%ncomprimento = %s", id, largura, comprimento);
	}
	
	public double calcularArea() {
		return largura*comprimento;
	}
	
	public double calcularPerimetro() {
		return largura*2 + comprimento*2;
	}
	
	public double calcularDiagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(comprimento, 2));
	}
	
	public void enquadrar() {
		largura = (largura + comprimento) / 2;
		comprimento = largura;
	}
	
	public void redimensionar(double fator) {
		largura = largura*fator;
		comprimento = comprimento*fator;
	}
	
	public boolean ehQuadrado() {
		if (largura == comprimento) return true;
		else return false;
	}
	
	public boolean ehEquivalente(Retangulo r) {
		if (this.calcularArea() == r.calcularArea()) return true;
		else return false;
	}
}
