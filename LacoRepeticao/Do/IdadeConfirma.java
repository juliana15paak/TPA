import java.util.Scanner;
public class IdadeConfirma {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in) ;
		int m, anoAtual, anoNasc, idade, i;
		System.out.println("Qual o ano atual? ");
		anoAtual = in.nextInt();
		do {
			System.out.println("Em que ano voc� nasceu?");
			anoNasc = in.nextInt();
			idade = anoAtual -anoNasc;
			System.out.println("Voc� t�m "+idade+" anos de idade");
			System.out.println("Deseja continuar a execu��o? (1-SIM ou 2-N�O)");
			i= in.nextInt();
			while (i!=2 && i!=1) {
					System.out.println("Valor incorreto. (1-SIM ou 2-N�O)");
					i = in.nextInt();
				}
		} while(i!=2);
		System.out.println("Programa encerrado.");
	}
}
