import java.util.Scanner;

/*f. volume de um paralelep�pedo, dadas suas dimens�es 
 Volume = altura * largura * profundidade */

public class Exercicio {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
int volume, altura, largura, profundidade;
System.out.println("Informe a altura do paralelep�pedo");
altura = teclado.nextInt();
System.out.println("Informe a largura do paralelep�pedo.");
largura = teclado.nextInt();
System.out.println("Informe a profundidade do paralelep�pedo.");
profundidade = teclado.nextInt();
volume = altura * largura * profundidade;
System.out.println("O volume do paralep�pedo �: " + volume);
}
}
