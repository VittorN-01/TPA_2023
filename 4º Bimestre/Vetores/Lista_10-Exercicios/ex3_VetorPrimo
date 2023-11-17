import java.util.Scanner;
public class ex3_VetorPrimo {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], i, j;
		
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
			if (a[i] <= 1) {
	            System.out.println(a[i] + " = NÃO é Primo");
	        }else {
	        	boolean Primo = true;
                for (j = 2; j < a[i]; j++) {
                    if (a[i] % j == 0) {
                        Primo = false;
                        break;
                    }
                }
                if (Primo) {
                    System.out.println(a[i] + " = Nº Primo");
                } else {
                    System.out.println(a[i] + " = NÃO é Primo");
                }
            }
		}in.close();
	}
}
