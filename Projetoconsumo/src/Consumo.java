import java.util.Scanner;

/*Enunciado - Faça um programa Java que calcule o consumo médio de um carro durante a viagem. Serão informados a distância percorrida e a quantidade de litros
de combustível gastos. O consumo médio é dado pela distância dividido pelo consumo total.
Ao final exiba este valor.
*/
public class Consumo {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
double km, total, media;
	System.out.println("Qual foi a quantidade gasta em combustível?");
	total = teclado.nextDouble();
	System.out.println("Qual foi a distáncia percorrida?");
	km = teclado.nextDouble();
	media = km / total;
	System.out.println("A média de combustivel gasto foi: " + media);
}
}
