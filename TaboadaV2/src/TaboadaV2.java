import java.util.Scanner;

//fasendo uma taboada com o la�o de repeti��o for (para);
public class TaboadaV2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, resultado;
		System.out.println("Digite um n�mero inteiro.");
		numero = teclado.nextInt();
		for (int contador = 0; contador <= 10; contador++) {
			//a vari�vel contadora tem alto incremento, isto �, inicia em 0 e repete at� que contador seja menor ou igual a 10; 
			resultado = numero * contador;
			System.out.println(numero + " x " + contador + " = " + resultado);
		}
		
	}
}
