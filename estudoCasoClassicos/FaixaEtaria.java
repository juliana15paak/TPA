package teams;
import java.util.Scanner;
public class FaixaEtaria {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int idade, i, f1, f2, f3, f4, f5, pf1, pf2, pf3, pf4, pf5;
		f1=1;
		f2=1;
		f3=1;
		f4=1;
		f5=1;
		for (i=1; i<=15; i++){
			System.out.println("Digite a idade: ");
			idade=in.nextInt();
			if(idade<=15) {
				f1=f1+1;
			}else if(idade<31) {
				f2=f2+1;
			}else if(idade<46) {
				f3=f3+1;
			}else if(idade<61) {
				f4=f4+1;
			}else {
				f5=f5+1;
			}
		}
		System.out.println("A quantidade de pessoas na faixa et�ria 1 �: "+f1+", na faixa et�ria 2 �: "+f2+", na faixa et�ria 3 �: "+f3+", na faixa et�ria 4: "+f4+" e na faixa et�ria 5: "+f5);
		pf1=f1*15/100;
		pf2=f1*15/100;
		pf3=f1*15/100;
		pf4=f1*15/100;
		pf5=f1*15/100;
		System.out.println(". A porcentagem de pessoas na faixa et�ria 1 �: "+pf1+"%, na faixa et�ria 2 �: "+pf2+"%, na faixa et�ria 3 �: "+pf3+"%, na faixa et�ria 4: "+pf4+"% e na faixa et�ria 5: "+pf5+"%");
	}
}
