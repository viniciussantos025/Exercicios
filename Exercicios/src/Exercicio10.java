import java.util.Scanner;
public class Exercicio10 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.println("Digite os numero:");
		num1 = ler.nextInt();
		while (num1 != 0) {
		num1 = ler.nextInt();
		if (num1 != 0) {
			System.out.println(num1 + " + " + num2);
			num2 = num2 + num1;
			System.out.println(" = " + num2);
		}else if (num1 == 0) {
			System.out.println("Fim!");
			return;
			}	
		}
	}
}


