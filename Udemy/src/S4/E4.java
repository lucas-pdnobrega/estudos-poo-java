package S4;
import java.util.Locale;
import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int h = input.nextInt();
		double t = input.nextDouble();
		double s = h*t;
		System.out.printf("CODE : %s%n", n);
		System.out.printf("SALARY : %s%n", s);
		input.close();
	}

}