import java.util.Scanner;
public class Inss {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int i;
		double s, desc, salario;
		for(i=1;i<5;i++){
			System.out.println("Digite o salário: ");
			s = in.nextDouble();
			if (s>=2000){
				desc = s*11/100;
				salario = s-desc;
				System.out.println(salario);
			}
			else {
				desc = s*8.5/100;
				salario = s-desc;			
				System.out.println(salario);
			}
		}
		in.close();
	}
}
