package S4;
import java.util.Locale;
import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		double p1 = input.nextDouble();
		int n2 = input.nextInt();
		double p2 = input.nextDouble();
		System.out.printf("VALOR A PAGAR : R$ %.2f%n", (n1*p1 + n2*p2));
		input.close();
	}

}
