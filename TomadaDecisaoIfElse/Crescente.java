import java.util.Scanner;
public class Crescente {
	public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        int a, b, c;
        System.out.println("Digite três valores inteiros:");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if (a<b && b<c){
            System.out.println("Os valores em ordem crescente: " + a + ", " + b + ", " + c);
        }
        else if (b<c && c<a){
            System.out.println("Os valores em ordem crescente: " + b + ", " + c + ", " + a);
        }
        else if (c<a && a<b){
            System.out.println("Os valores em ordem crescente: " + c + ", " + a + ", " + b);
        }
        else if (a<c && c<b){
            System.out.println("Os valores em ordem crescente: " + a + ", " + c + ", " + b);
        }
        else if (b<a && a<c){
            System.out.println("Os valores em ordem crescente: " + b + ", " + a + ", " + c);
        }
        else{
            System.out.println("Os valores em ordem crescente: " + c + ", " + b + ", " + a);
        }
    }
}

