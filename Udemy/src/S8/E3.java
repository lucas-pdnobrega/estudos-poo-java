package S8;

public class E3 {
	
	private double nota1;
	private double nota2;
	private double nota3;
	
	public E3(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public double finalGrade() {
		return (nota1 + nota2 + nota3);
	}
	
	public void classStatus() {
		if (this.finalGrade() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL" + (this.finalGrade() - 60));
		}
	}

	public static void main(String[] args) {
		E3 alex = new E3(27, 31, 32);
		alex.classStatus();
		alex = new E3(17, 20, 15);
		alex.classStatus();
	}

}
