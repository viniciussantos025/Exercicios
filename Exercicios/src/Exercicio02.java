import java.util.Scanner;

public class Exercicio02 {

			public static void main(String[] args) {
			
			Scanner ler = new Scanner (System.in);
			System.out.println("Digite dois numeros:");
			int num1 = ler.nextInt();
			int num2 = ler.nextInt();
			
			if (num1 < num2)
				System.out.println("O menor numero eh:"+num1);
			
			else 
				System.out.println("O menor numero eh:"+num2);
				
			
			}

		}
