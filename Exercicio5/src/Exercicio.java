import java.util.Scanner;

/*5. Calcular a quantidade de litros de combustível gastos em uma viagem, sabendo-se 
que um carro faz, em média, 12 km/l. Deverão ser fornecidos o tempo gasto da viagem 
e a velocidade média. 
 distancia = velocidade x tempo 
 litros utilizados - distancia / 12 */

public class Exercicio {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double consumo, distancia, velocidade, tempo;
	System.out.println("Informe a velocidáde.");
	velocidade = teclado.nextDouble();
	System.out.println("Informe o tempo gasto.");
	tempo = teclado.nextDouble();
	distancia = tempo * velocidade;
	System.out.println("A distáncia percorrida foi: " + distancia);
	consumo = distancia / 12;
	System.out.println("Foram consumidos " + consumo + " litros de combustível.");
	
}
}
