import java.util.Scanner;

/*b. �rea de um ret�ngulo, dados sua base e sua altura 
 �rea = base * altura */

public class Exercicio {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int base, area, altura;
	System.out.println("Digite a base.");
	base = teclado.nextInt();
	System.out.println("Digite a altura.");
	altura = teclado.nextInt();
	area = base*altura;
	System.out.println("O resultado da �rea do ret�ngulo �: " + area);
}
}
