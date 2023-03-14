package S4;
import java.util.Locale;
import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		int D = input.nextInt();
		int DIF = (A*B - C*D);
		System.out.println(DIF);
		input.close();
	}

}
