import java.util.Scanner;

/*Enunciado - Fa�a um programa Java que calcule o consumo m�dio de um carro durante a viagem. Ser�o informados a dist�ncia percorrida e a quantidade de litros
de combust�vel gastos. O consumo m�dio � dado pela dist�ncia dividido pelo consumo total.
Ao final exiba este valor.
*/
public class Consumo {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
double km, total, media;
	System.out.println("Qual foi a quantidade gasta em combust�vel?");
	total = teclado.nextDouble();
	System.out.println("Qual foi a dist�ncia percorrida?");
	km = teclado.nextDouble();
	media = km / total;
	System.out.println("A m�dia de combustivel gasto foi: " + media);
}
}
