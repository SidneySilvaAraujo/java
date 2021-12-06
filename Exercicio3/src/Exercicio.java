
import java.util.Scanner;

/*3. Sabendo que o valor de 100 kw corresponde a 1/7 do valor do sal�rio m�nimo, fa�a 
um programa Java que receba o valor do sal�rio m�nimo e a quantidade de kw gasta 
por uma resid�ncia e calcule: 
 a. o valor em reais de cada kw. 
 b. o valor em reais a ser pago 
 c. o novo valor a ser pago por essa resid�ncia com um desconto de 10% */

public class Exercicio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o valor do sal�rio m�nimo: ");
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
