import java.util.Scanner;

/*1. Leia um número de 3 dígitos e gere um novo número composto da inversão dos 
dígitos: Ex: 123 -> 321 */

public class Exercicio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, novo, unidade, desena, centena, resto;
		System.out.println("Informe um número de três Dígitos.");
		numero = teclado.nextInt();
centena = numero / 100;
resto = numero % 100;
desena = resto /10;
unidade = resto % 10;
novo = unidade * 100 + desena * 10 + centena;
System.out.println("O novo número é: " + novo);
	}
}
