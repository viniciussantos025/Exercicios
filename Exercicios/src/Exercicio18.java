import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero[] = new int[10];
		int aux = 0;

		System.out.println("Digite 10 numeros:");
		for (int a = 0; a < 10; a++) {
			numero[a] = ler.nextInt();
		}
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				if (numero[a] < numero[b]) {
					aux = numero[a];
					numero[a] = numero[b];
					numero[b] = aux;
				}
			}
		}
		for (int a = 0; a < 10; a++) {

			System.out.println(numero[a]);
		}

	}

}
