import java.util.Scanner;

/*4. Faça um programa Java que efetue o cálculo do salário líquido de um funcionário. 
Serão informados o valor da hora trabalhada, a quantidade de horas e o percentual de 
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
		System.out.println("O valor do salário líquido é: " + salario);
	}
}
