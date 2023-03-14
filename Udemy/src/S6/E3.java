package S6;

import javax.swing.JOptionPane;

public class E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		do {
		x = Integer.parseInt(JOptionPane.showInputDialog("Insira X"));
		} while (x <= 0 || x > 1000);
		
		for (int i = 0; i <= x; i++) {
			System.out.println(i);
		}
		
	}

}
