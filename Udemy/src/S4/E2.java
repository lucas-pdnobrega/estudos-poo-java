package S4;
import java.util.Locale;
import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		double area = (Math.PI) * (Math.pow(radius, 2));
		System.out.printf("%.4f%n", area);
		input.close();
	}

}
