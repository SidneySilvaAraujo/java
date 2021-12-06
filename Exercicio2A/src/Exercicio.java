
import java.util.Scanner;

/*a. área de um quadrado, dado seu lado 
 Área = lado * lado */
public class Exercicio {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int lado, resultado;
	System.out.println("Digite o valor do lado do quadrado.");
	lado = teclado.nextInt();
	resultado = lado * lado;
	System.out.println("A área do quadrado vale: " + resultado);
}
}
