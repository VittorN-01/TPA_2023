import java.util.Scanner;
public class Ex1_DobroAnterior {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
		int a[][], i, j;
		
		a = new int [4][4];
		
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				System.out.println("Entre com o valor da coluna "+j+" linha "+i);
				a[i][j] = in.nextInt();
				a[i][j] = a[i][j] * 2;
			}
		}
		for(i = 0; i < 4; i++) {
			System.out.println();
			for(j = 0; j < 4; j++) {
				System.out.print(a[i][j]+ " ");
			}
		}
		in.close();
	}
}
