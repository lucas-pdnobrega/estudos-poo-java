package S4;
import java.util.Locale;

public class E1 {

	public static void main(String[] args) {
		String p1 = "Computer";
		String p2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.5;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, whose price is $ %.2f%n", p1, price1);
		System.out.printf("%s, whose price is $ %.2f%n", p2, price2);
		System.out.println();
		System.out.printf("Record %s years old, code %s and gender : %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eight decimal houses : %.8f%n", measure);
		System.out.printf("Rounded, with three decimal houses : %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US Format : %.3f%n", measure);

	}

}
