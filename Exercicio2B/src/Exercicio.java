import java.util.Scanner;

/*b. área de um retângulo, dados sua base e sua altura 
 Área = base * altura */

public class Exercicio {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int base, area, altura;
	System.out.println("Digite a base.");
	base = teclado.nextInt();
	System.out.println("Digite a altura.");
	altura = teclado.nextInt();
	area = base*altura;
	System.out.println("O resultado da área do retángulo é: " + area);
}
}
