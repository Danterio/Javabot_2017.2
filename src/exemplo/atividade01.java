package exemplo;

/**
 * @author: Daniel Antero 
 * @since: 2018-04-05
 * @version: 1.0
 * @category: Exemplo Do While
 **/

import java.util.Scanner;

public class atividade01 {
	public static void main(String[] args) {
		int numero1;
		int numero2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = teclado.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		numero2 = teclado.nextInt();
		teclado.close();
		
	}
}
