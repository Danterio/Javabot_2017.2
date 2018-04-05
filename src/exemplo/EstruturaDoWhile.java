package exemplo;

/**
 * @author: Daniel Antero 
 * @since: 2018-04-05
 * @version: 1.0
 * @category: Exemplo Do While
 **/

import javax.swing.JOptionPane;

public class EstruturaDoWhile {
	public static void main(String[] args) {
		
		String senha;
		
		do {
		// interface prompt do swing/AWT
		senha = JOptionPane.showInputDialog("Informe a senha");	
		
		if(senha == null)
			break;
		
	}while(!senha.equals("Senha123"));
		
		if(senha != null) {
		// Interface alert do Swing/AWT
		JOptionPane.showMessageDialog(null, "Senha Correta!");
		}
	}
}