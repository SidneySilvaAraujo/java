import java.util.Scanner;

/*g. volume de um cubo, dado seu lado 
 Volume = lado * lado * lado */

public class Exercicio {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
int lado, volume;
System.out.println("Informe o lado do cubo.");
lado = teclado.nextInt();
volume = lado * lado * lado;
System.out.println("O volume do cubo é: " + volume);
}
}
