package S4;
import java.util.Locale;
import java.util.Scanner;

public class E6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		System.out.printf("TRIANGULO : %.3f%n", ((a*c)/2));
		System.out.printf("CIRCULO : %.3f%n", (Math.PI * Math.pow(c, 2)));
		System.out.printf("TRAPEZIO : %.3f%n", (((a+b)*c)/2));
		System.out.printf("QUADRADO : %.3f%n", (Math.pow(b, 2)));
		System.out.printf("RETANGULO : %.3f%n", (a*b));
		input.close();
	}

}
