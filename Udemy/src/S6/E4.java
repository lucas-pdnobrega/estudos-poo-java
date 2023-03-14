package S6;

import javax.swing.JOptionPane;

public class E4 {

	public static void main(String[] args) {
		int N;
		do {
		N = Integer.parseInt(JOptionPane.showInputDialog("Insira X"));
		} while (N <= 0);
		
		for (int i = 1; i <= N; i++) {
			System.out.printf("%s %s %s%n", i, Math.pow(i, 2), Math.pow(i, 3));
		}
		
	}

}
