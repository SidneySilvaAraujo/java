import java.util.Scanner;

/*1. Leia um n�mero de 3 d�gitos e gere um novo n�mero composto da invers�o dos 
d�gitos: Ex: 123 -> 321 */

public class Exercicio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, novo, unidade, desena, centena, resto;
		System.out.println("Informe um n�mero de tr�s D�gitos.");
		numero = teclado.nextInt();
centena = numero / 100;
resto = numero % 100;
desena = resto /10;
unidade = resto % 10;
novo = unidade * 100 + desena * 10 + centena;
System.out.println("O novo n�mero �: " + novo);
	}
}
