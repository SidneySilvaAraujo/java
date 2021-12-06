import java.util.Scanner;

public class Media2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double media, notaUm, notaDois;
		System.out.println("Informe a primeira nota.");
		notaUm = teclado.nextDouble();
		System.out.println("Informe a segunda nota.");
		notaDois = teclado.nextDouble();
		media = (notaUm + notaDois) / 2;
		if (media >= 8 && media <= 10) {
			System.out.println("Aprovado com louvor!");
		}else if (media >= 6 && media < 8) {
			System.out.println("Aprovado!");
		} else if (media <= 5 && media < 6) {
			System.out.println("Em recuperação");
		} else {
			System.out.println("Reprovado com sucesso!");
		}
	}
}
