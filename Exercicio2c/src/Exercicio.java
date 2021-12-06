import java.util.Scanner;

/*c. área de um triângulo, dados sua base e sua altura 
 Área = (base * altura)/2 */

public class Exercicio {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int area, base, altura;
	System.out.println("Digite a base.");
	base = teclado.nextInt();
	System.out.println("Digite a altura.");
	altura = teclado.nextInt();
	area = base * altura;
	System.out.println("A área do triángulo é: " + area);
}
}
