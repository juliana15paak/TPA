import java.util.Scanner;
public class Inverso {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int a[], b[], i;
		a = new int[10];
		b = new int[10];
		for(i=0; i<10; i++) {
			System.out.println("Digite um  número inteiro: ");
			a[i]=in.nextInt();
		}
		b[0]=a[9];
		b[1]=a[8];
		b[2]=a[7];
		b[3]=a[6];
		b[4]=a[5];
		b[5]=a[4];
		b[6]=a[3];
		b[7]=a[2];
		b[8]=a[1];
		b[9]=a[0];
		System.out.println("Números invertidos: ");
		for(i=0; i<10; i++) {
			if(i==9) {
				System.out.print(b[i]);
			}else {
				System.out.print(b[i]+", ");
			}
		}
	}
}