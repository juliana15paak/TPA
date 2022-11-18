import java.util.Scanner;
public class Imc {
	public static void main (String []args) {
		double peso, altura, imc;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite seu peso:");
		peso=in.nextDouble();
		System.out.println("Digite sua altura:");
		altura=in.nextDouble();
		imc=peso/(altura*altura);
		System.out.println(imc);
		if(imc>40) {
			System.out.println("Obesidade (Grau III)");
		}
		else if(imc>35) {
			System.out.println("Obesidade (Grau II)");
		}
		else if(imc>30) {
			System.out.println("Obesidade (Grau I)");
		}
		else if(imc>25) {
			System.out.println("Excesso de peso");
		}
		else if(imc>=18.5 | imc==18.5) {
			System.out.println("Peso normal");
		}
		else {
			System.out.println("Excesso de magreza");
		}
	}
}
