import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	System.out.println("Digite dois numeros:");
	Scanner ler = new Scanner (System.in);
	int num1 = ler.nextInt();
	int num2 = ler.nextInt();
	System.out.println("Escolha uma opção:");
	System.out.println("1 = Soma");
	System.out.println("2 = Subtração");
	System.out.println("3 = Multiplicação");
	System.out.println("4 = Divição");
	int valor = ler.nextInt();
	switch (valor) {

		case 1: System.out.println(num1 + num2);
		break;
	
		case 2: System.out.println(num1 - num2);
		break;
		
		case 3: System.out.println(num1 * num2);
		break;
		
		case 4: if (num2 == 0) {
			System.out.println("Impossivel dividir por 0");
			}
		System.out.println(num1 / num2);
		break;
		
		default: System.out.println("Erro");
		
			
		} 	
	
	
	}

}
