import java.util.Scanner;
public class EscolaFutebol {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int a;
		System.out.println("Digite sua idade para saber sua categoria na escola de futebol:");
		a=in.nextInt();
		switch(a) {
			case 6: System.out.println("Categoria do aluno: Dente de leite");
					break;
			case 7: System.out.println("Categoria do aluno: Júnior");
					break;
			case 8: System.out.println("Categoria do aluno: Júnior max");
					break;
			case 9: System.out.println("Categoria do aluno: Júnior master");
					break;
			case 10: System.out.println("Categoria do aluno: Master");
					break;
			default: System.out.println("A escola não admite crianças de outras idades.");
		}
	}
}
