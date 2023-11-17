import java.util.Scanner;
public class ex7_Diferenca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a[], b[], c[];
        int i, j, contador = 0;
        boolean s;
        
        a = new int[10];
        b = new int[10];
        c = new int[10];
        
        for (i = 0; i < 10; i++) {
        	System.out.print("Digite o "+(i+1)+" valor do vetor A: ");
        	a[i] = in.nextInt();
        }
        System.out.println();
        for (i = 0; i < 10; i++) {
            System.out.print("Digite o "+(i+1)+" valor do vetor B: ");
            b[i] = in.nextInt();
        }

        for (i = 0; i < 10; i++) {
            s = false;
            for (j = 0; j < 10; j++) {
                if (a[i] == b[j]) {
                    s = true;
                    break;
                }
            }
            if (!s) {
                c[contador] = a[i];
                contador++;
            }
        }

        System.out.print("Diferenças: ");
        for (i = 0; i < contador; i++) {
            System.out.print("[ " + c[i] + " ]");
        }
    }
}
