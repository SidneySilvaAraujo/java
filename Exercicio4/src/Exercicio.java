import java.util.Scanner;

/*4. Fa�a um programa Java que efetue o c�lculo do sal�rio l�quido de um funcion�rio. 
Ser�o informados o valor da hora trabalhada, a quantidade de horas e o percentual de 
desconto do INSS. */
public class Exercicio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario, valorH, horasT, desconto, cauculo;
		System.out.println("Informe o valor da hora de trabalho.");
		valorH = teclado.nextDouble();
		System.out.println("Informe a quantidade de horas trabalhadas.");
		horasT = teclado.nextDouble();
		System.out.println("Informe o valor do desconto do INSS.");
		desconto = teclado.nextDouble();
		cauculo = valorH * horasT;
		System.out.println("O valor do sal�rio l�quido �: " + salario);
	}
}
