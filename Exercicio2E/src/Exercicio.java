import java.util.Scanner;

/*e. área de um trapézio, dadas suas bases e sua altura 
 Área = (base maior + base menor)* altura /2 */
public class Exercicio {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int baseMaior, baseMenor, area;
	System.out.println("Informe a base maior.");
	baseMaior = teclado.nextInt();
	System.out.println("Informe a base menor.");
	baseMenor = teclado.nextInt();
	area = baseMaior + baseMenor;
	System.out.println("A área do trapésio é: " + area);
}
}
