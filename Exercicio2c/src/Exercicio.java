import java.util.Scanner;

/*c. �rea de um tri�ngulo, dados sua base e sua altura 
 �rea = (base * altura)/2 */

public class Exercicio {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int area, base, altura;
	System.out.println("Digite a base.");
	base = teclado.nextInt();
	System.out.println("Digite a altura.");
	altura = teclado.nextInt();
	area = base * altura;
	System.out.println("A �rea do tri�ngulo �: " + area);
}
}
