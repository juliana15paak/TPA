import java.util.Scanner;
public class Cantina {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int c;
		System.out.println("Digite o código do produto de 1 a 5: ");
		c=in.nextInt();
		switch(c) {
			case 1: System.out.println("Cachorro quente: R$8,00");
				break;
			case 2: System.out.println("Cheeseburguer: R$12,00");
				break;
			case 3: System.out.println("X-Salada: R$15,00");
				break;
			case 4: System.out.println("Misto quente: R$11,00");
				break;
			case 5: System.out.println("Pão na chapa: R$6,00");
				break;
			default: System.out.println("Código inválido");
		}
	}
}
