import java.util.Scanner;

/*f. volume de um paralelepípedo, dadas suas dimensões 
 Volume = altura * largura * profundidade */

public class Exercicio {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
int volume, altura, largura, profundidade;
System.out.println("Informe a altura do paralelepípedo");
altura = teclado.nextInt();
System.out.println("Informe a largura do paralelepípedo.");
largura = teclado.nextInt();
System.out.println("Informe a profundidade do paralelepípedo.");
profundidade = teclado.nextInt();
volume = altura * largura * profundidade;
System.out.println("O volume do paralepípedo é: " + volume);
}
}
