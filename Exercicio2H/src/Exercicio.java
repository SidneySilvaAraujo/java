import java.util.Scanner;

/*h. volume de um cilindro, dado seu diâmetro e considerando pi=3,14 
 Volume = PI * raio * raio * altura */

public class Exercicio {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double raio, altura, volume, pi;
	pi = 3.14;
	System.out.println("Informe o raio do cilindro.");
	raio = teclado.nextDouble();
	System.out.println("Informe a altura do cilindro.");
	altura = teclado.nextDouble();
	volume = pi * raio * raio * altura;
	System.out.println("O volume do cilindro é: " + volume);
	
}
}
