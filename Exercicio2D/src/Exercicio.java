import java.util.Scanner;

/*d. �rea de um losango, dadas suas diagonais 
 �rea = diagonal1 * diagonal2 */

public class Exercicio {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int diagonalUm, diagonalDois, area;
	System.out.println("Informe a diagonal 1.");
	diagonalUm = teclado.nextInt();
	System.out.println("Informe a diagonal 2.");
	diagonalDois = teclado.nextInt();
	area = diagonalUm * diagonalDois;
	System.out.println("A �rea do losango vale: " + area);
}
}
