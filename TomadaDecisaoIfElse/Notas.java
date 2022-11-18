import java.util.Scanner;
public class Notas {
	public static void main  (String []args) {
		Scanner in = new Scanner (System.in);
		int nota1, nota2, media, exame, m;
		System.out.println("Digite a primeira nota:");
		nota1=in.nextInt();
		System.out.println("Digite a segunda nota:");
		nota2=in.nextInt();
		media=(nota1+nota2)/2;
		if (media<3) {
			System.out.println("Reprovado");
		else if (media>6 | media==6){
			System.out.println("Aprovado");
		}
		else{
			System.out.println("Digite a nota de exame: ");
			exame=in.nextInt();
			m=(media+exame)/2;
			if (m>6 | m=6) {
				System.out.println("Aprovado");
			}
			else {
				System.out.println("Reprovado");
			}
		}
	}
}
