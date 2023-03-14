package S5;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
				int n = input.nextInt();
				if ((n % 2) != 1) { 
					System.out.println("PAR"); 
				} else {
					System.out.println("ÍMPAR");
				}
				input.close();
	}

}
