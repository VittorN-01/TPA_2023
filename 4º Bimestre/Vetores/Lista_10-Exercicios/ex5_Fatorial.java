import java.util.Scanner;
public class ex5_Fatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[], b[];
        
        a = new int[3];
        b = new int[3];
        int i, j, num;
        int fat = 1;

        for (i = 0; i < 3; i++) {
        	fat = 1;
            System.out.println("Digite o valor do expoente " + (i + 1) + ": ");
            a[i] = in.nextInt();
            num = a[i];
            for (j = 1; j <= num; j++) {
                fat *= j;
            }
            b[i] = fat;
        }

        System.out.print("Vetor A: ");
        for (i = 0; i < 3; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("Fatoriais: ");
        for (i = 0; i < 3; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
