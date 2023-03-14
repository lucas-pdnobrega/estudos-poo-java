package S5;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		if (a % b == 0 || b % a == 0) { 
			System.out.println("Múltiplos"); 
		} else {
			System.out.println("Não múltiplos");
		}
		input.close();
	}

}
