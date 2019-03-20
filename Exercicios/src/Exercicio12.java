import java.util.Scanner;
public class Exercicio12 {
	
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	System.out.println("Digite dois numeros:");
	int num1 = ler.nextInt();
	int num2 = ler.nextInt();
	
	if (num1 < 11 & num1 > 0 & num2 < 11 & num2 > 0 & num1 != num2) {
		for (int a=1; a<=1000; a++) {
			if (a % num1 == 0 & a % num2 == 0) {
				System.out.println(a);
				}
			}
		
		}
	
	}

}
