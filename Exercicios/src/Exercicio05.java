import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		System.out.println("Escolha o numero da sua op��o de pagamento:");
		System.out.println("1 = Venda a Vista no dinheiro.\r\n" + 
				"2 = Venda a vista no d�bito.\r\n"+
				"3 = 1x no cart�o de cr�dito.\r\n" + 
				"4 = 3x vezes com juros no cart�o de cr�dito.\r\n" + 
				"5 = 6x no cart�o de cr�dito.");
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
				System.out.println("Mesmo pre�o");
				break;
			case 4:
				System.out.println("Acrescimo de 5%");
				break;
			case 5:
				System.out.println("Acrescimo de 10%");
				break;
			 default:
		        System.out.println ("N�o existe esta op��o, por favor escolha outra!!!");
		
		}
	}
}
