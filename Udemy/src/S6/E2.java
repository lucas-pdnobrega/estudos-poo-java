package S6;

import javax.swing.JOptionPane;

public class E2 {

	public static void main(String[] args) {

		int x;
		int y;
		
		do {
			
		x = Integer.parseInt(JOptionPane.showInputDialog("Insira X"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Insira Y"));
		String quad;
		
		if (x > 0 && y > 0)
			quad = "Segundo";
		else if (x > 0) 
			quad = "Quarto";
		else if (y > 0) 
			quad = "Primeiro";
		else 
			quad = "Terceiro";
		
		JOptionPane.showMessageDialog(null, quad);
		
		} while (x != 0 && y != 0);
		
	}

}
