import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		System.out.println("Escolha o numero da sua opção de pagamento:");
		System.out.println("1 = Venda a Vista no dinheiro.\r\n" + 
				"2 = Venda a vista no débito.\r\n"+
				"3 = 1x no cartão de crédito.\r\n" + 
				"4 = 3x vezes com juros no cartão de crédito.\r\n" + 
				"5 = 6x no cartão de crédito.");
		Scanner ler = new Scanner (System.in);
		int valor = ler.nextInt();
		switch (valor) {
			case 1:
				System.out.println("Desconto de 12%");
				break;
			case 2:
				System.out.println("Desconto de 3%");
				break;
			case 3:
				System.out.println("Mesmo preço");
				break;
			case 4:
				System.out.println("Acrescimo de 5%");
				break;
			case 5:
				System.out.println("Acrescimo de 10%");
				break;
			 default:
		        System.out.println ("Não existe esta opção, por favor escolha outra!!!");
		
		}
	}
}
