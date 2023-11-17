import java.util.Scanner;
public class Ex3_Soma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[3][4];
        int i, j, soma;

        for (i = 0; i < 3; i++) {
        	soma = 0;
            for (j = 0; j < 3; j++) {
                System.out.println("Entre com o valor da linha " + i + " coluna " + j);
                a[i][j] = in.nextInt();
                soma += a[i][j]; 
            }
            a[i][3] = soma;
        }

        for (i = 0; i < 3; i++) {
        	System.out.println();
            for (j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}

