import java.util.Scanner;

/*5. Calcular a quantidade de litros de combust�vel gastos em uma viagem, sabendo-se 
que um carro faz, em m�dia, 12 km/l. Dever�o ser fornecidos o tempo gasto da viagem 
e a velocidade m�dia. 
 distancia = velocidade x tempo 
 litros utilizados - distancia / 12 */

public class Exercicio {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double consumo, distancia, velocidade, tempo;
	System.out.println("Informe a velocid�de.");
	velocidade = teclado.nextDouble();
	System.out.println("Informe o tempo gasto.");
	tempo = teclado.nextDouble();
	distancia = tempo * velocidade;
	System.out.println("A dist�ncia percorrida foi: " + distancia);
	consumo = distancia / 12;
	System.out.println("Foram consumidos " + consumo + " litros de combust�vel.");
	
}
}
