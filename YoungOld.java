import java.util.Scanner;
public class YoungOld {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int i=1, idade, idadeVelho, idadeNovo;
		String nome, nomeVelho, nomeNovo;
		System.out.println("Digite o nome e a idade do primeiro usuário: ");
		nome=in.next();
		idade=in.nextInt();
		nomeNovo=nome;
		nomeVelho=nome;
		idadeNovo=idade;
		idadeVelho=idade;
		while(i<=9) {
			System.out.println("Digite o nome e a idade do próximo usuário: ");
			nome=in.next();
			idade=in.nextInt();
			if (idade>idadeVelho) {
				nomeVelho=nome;
				idadeVelho=idade;
			}
			else if (idade<idadeNovo) {
				nomeNovo=nome;
				idadeNovo=idade;
			}
			i++;
		}
		System.out.println("O usuário mais novo é: " + nomeNovo + " com " + idadeNovo + " anos. O usuário mais velho é: " + nomeVelho + " com " + idadeVelho + " anos.");
	}
}
