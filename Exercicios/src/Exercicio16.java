import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		int[] numero = new int[10];
		int a = 0;

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 10 numeros:");
		for (a = 0; a <= 9; a++) {
			numero[a] = ler.nextInt();

			
			}
		for (a = 9; a >= 0; a--) {
			System.out.println(numero[a]);
		}
	}
}