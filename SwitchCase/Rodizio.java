import java.util.Scanner;
public class Rodizio {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int p;
		System.out.println("Digite o �ltimo n�mero da placa do seu ve�culo:");
		p=in.nextInt();
		switch(p) {
			case 1:
			case 2: System.out.println("Segunda-feira");
					break;
			case 3:
			case 4: System.out.println("Ter�a-feira");
					break;
			case 5:
			case 6: System.out.println("Quarta-feira");
					break;
			case 7:
			case 8: System.out.println("Quinta-feira");
					break;
			case 9:
			case 0: System.out.println("Sexta-feira");
					break;
			default: System.out.println("N�mero da placa inv�lido");
		}
	}
}
