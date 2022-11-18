import java.util.Scanner;
public class Viagem {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int destino, dias, pdia, preco;
		System.out.println("Escolhe o seu destino: Digite 1 para Ilhabela ou digite 2 para Fernando de Noronha: ");
		destino=in.nextInt();
		System.out.println("Digite a quantidade de dias: ");
		dias=in.nextInt();
		if (destino==1){
			if (dias>10) {
				pdia=210*dias;
				preco=pdia+150;
				System.out.println("Valor total a pagar em R$: " + preco);
			}
			else if (dias>6) {
				pdia=220*dias;
				preco=pdia+130;
				System.out.println("Valor total a pagar em R$: " + preco);
			}
			else if (dias>2 | dias==2 ) {
				preco=240*dias;
				System.out.println("Valor total a pagar em R$: " + preco);
			}
		}
		else if(destino==2){
			if (dias>10) {
				pdia=420*dias;
				preco=pdia+200;
				System.out.println("Valor total a pagar em R$: " + preco);
			}
			else if (dias>6) {
				pdia=410*dias;
				preco=pdia+150;
				System.out.println("Valor total a pagar em R$: " + preco);
			}
			else if (dias>2 | dias==2 ) {
				pdia=400*dias;
				preco=pdia+100;
				System.out.println("Valor total a pagar em R$: " + preco);
			}
		}
	}

}
