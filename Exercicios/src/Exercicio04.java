import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	System.out.println("Digite 3 numeros e veja a ordenação em ordem crescente:");
	Scanner ler = new Scanner (System.in);
	
	int num1 = ler.nextInt(); 
	int num2 = ler.nextInt();
	int num3 = ler.nextInt();
	
	if ((num1 > num2) & (num2 > num3)){
	System.out.println("Ordem:"+ " " + num3 + " " + num2 + " "+ num1);
	}
	if ((num1 > num3) &  (num3 > num2)) {
	System.out.println("Ordem:"+ " " + num2 + " " + num3 + " "+ num1);	
	}
	if ((num3 > num2) & (num2 > num1)) {
	System.out.println("Ordem:"+ " " + num1 + " " + num2 +" " + num3);	
	}
	if ((num3 > num1) & (num1 > num2)) {
	System.out.println("Ordem:"+ " " + num2 + " " + num1 + " "+ num3);	
	}
	if ((num2 > num1) & (num1 > num3)) {
	System.out.println("Ordem:"+ " " + num3 + " " + num1 + " "+ num2);	
	}
	if ((num2 > num3) & (num3 > num1)) {
	System.out.println("Ordem:"+ " " + num1 + " " + num3 + " "+ num2);	
	}	
  }
}
