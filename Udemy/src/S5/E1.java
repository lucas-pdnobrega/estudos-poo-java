package S5;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n > 0) { 
			System.out.println("POSITIVO"); 
		} else if (n != 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("ZERO");
		}
		input.close();
	}

}
