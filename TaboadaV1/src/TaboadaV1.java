import java.util.Scanner;

/*Construindo uma tabo�da, fasendo uso do la�o de repeti��o while (em quanto)*/

public class TaboadaV1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, contador, resultado;
		System.out.println("Digite um n�mero.");
		numero = teclado.nextInt();
		contador = 0;
		while (contador <= 10) {
			resultado = numero * contador;
			System.out.println(numero + " x " + contador + " = " + resultado);
			contador++;
		}
	}
}
