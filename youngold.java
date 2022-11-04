package youngold;
import java.util.Scanner;
public class youngold {
	public static void main (String args[]) {
		int i, anoAtual, anoNasc, idade, v, n;
		System.out.println("Digite o ano atual: ");
		anoAtual=in.nextInt();
		System.out.println("Digite o ano de nascimento: ");
		anoNasc=in.nextInt();
		idade=anoAtual-anoNasc;
		v=idade;
		n=idade;
		System.out.println(idade);
		for (i=1; i<10; i++) {
			System.out.println("Digite o ano de nascimento: ");
			anoNasc=in.nextInt();
			idade=anoAtual-anoNasc;
			System.out.println(idade);
			if (idade>v){
				v=idade;
			}else if (idade<n) {
				n=idade;
			}
		}
		System.out.println("Usuário mais velho: "+v+", usuário mais novo: "+n);
	}
}