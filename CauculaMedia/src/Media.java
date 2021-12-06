import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double notaUm, notaDois, media;
		System.out.println("Informe a primeira nota.");
		notaUm = teclado.nextDouble();
		System.out.println("Informe a segunda nota.");
		notaDois = teclado.nextDouble();
		media = (notaUm + notaDois) / 2;
		System.out.println("A média entre as notas é: " + media);
		if (media >= 6) {
			System.out.printf("Aprovado com sucesso!");
		} else {
			System.out.println("Reprovado com sucesso!");
		}
	}
}
