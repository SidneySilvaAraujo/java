
import java.util.Scanner;

/*3. Sabendo que o valor de 100 kw corresponde a 1/7 do valor do salário mínimo, faça 
um programa Java que receba o valor do salário mínimo e a quantidade de kw gasta 
por uma residência e calcule: 
 a. o valor em reais de cada kw. 
 b. o valor em reais a ser pago 
 c. o novo valor a ser pago por essa residência com um desconto de 10% */

public class Exercicio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o valor do salário mínimo: ");
		double salarioMinimo = entrada.nextDouble();

		System.out.println("Qual a quantidade de Kw que foi consumidos: ");
		double qtdKw = entrada.nextDouble();

		double Kw = salarioMinimo / 700;
		double valorTotal = Kw * qtdKw;
		double valorDesconto = (valorTotal / 100) * 10;
		double valorAPagar = valorTotal - valorDesconto;

		System.out.printf("Valor do Kw R$%.2f %n Valor total do consumo: R$%.2f %n Valor com desconto: %.2f", Kw,
				valorTotal, valorAPagar);
	}
}  
