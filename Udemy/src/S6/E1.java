package S6;

import javax.swing.JOptionPane;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pass = JOptionPane.showInputDialog("Insira sua senha");
		while (!pass.equalsIgnoreCase("ifpb")) {
			pass = JOptionPane.showInputDialog("Senha incorreta, tente novamente");
		}
	}

}
