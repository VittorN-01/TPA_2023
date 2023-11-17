import java.util.Scanner;
public class ex1_ImparPar {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		final int TAM = 20;
		int a[], b[], i;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
			if(a[i] % 2 == 1) {
				b[i] = a[i];
				System.out.print( "\n"+b[i]+" = ");
				System.out.println("Nº Impar");
			}else {
				System.out.print( "\n"+a[i]+" = ");
				System.out.println("Nº Par");
			}
		}
	}
}
 