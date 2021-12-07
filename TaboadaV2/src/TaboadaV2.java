import java.util.Scanner;

//fasendo uma taboada com o laço de repetição for (para);
public class TaboadaV2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, resultado;
		System.out.println("Digite um número inteiro.");
		numero = teclado.nextInt();
		for (int contador = 0; contador <= 10; contador++) {
			//a variável contadora tem alto incremento, isto é, inicia em 0 e repete até que contador seja menor ou igual a 10; 
			resultado = numero * contador;
			System.out.println(numero + " x " + contador + " = " + resultado);
		}
		
	}
}
