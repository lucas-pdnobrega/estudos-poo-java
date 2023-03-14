package cap3;

public class Triangulo {

	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {
		return (base*altura)/2;
	}
	
	
	@Override
	public String toString() {
		return String.format("- Triangulo -%nbase = %s%naltura = %s", base, altura);	
	}
}
