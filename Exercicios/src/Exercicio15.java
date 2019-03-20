import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		int[] numero = new int[5];
		int a = 0;

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 5 numeros:");
		for (a = 0; a <= 4; a++) {
			numero[a] = ler.nextInt();

			
			}
		for (a = 0; a <= 4; a++) {
			System.out.println(numero[a]);
		}
	}
}