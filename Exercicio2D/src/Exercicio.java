import java.util.Scanner;

/*d. área de um losango, dadas suas diagonais 
 Área = diagonal1 * diagonal2 */

public class Exercicio {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int diagonalUm, diagonalDois, area;
	System.out.println("Informe a diagonal 1.");
	diagonalUm = teclado.nextInt();
	System.out.println("Informe a diagonal 2.");
	diagonalDois = teclado.nextInt();
	area = diagonalUm * diagonalDois;
	System.out.println("A área do losango vale: " + area);
}
}
