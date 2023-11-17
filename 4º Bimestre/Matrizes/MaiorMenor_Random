import java.util.Random;
public class Ex2_MaiorMenor_Random {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int i, j;
        int maior = 0, menor = 0; 
        int linhaMaior = 0, linhaMenor = 0, colunaMaior = 0, colunaMenor = 0;
        Random in = new Random();

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = in.nextInt() % 50;
            }
        }

        for (i = 0; i < 3; i++) {
            System.out.println();
            for (j = 0; j < 3; j++) {
                System.out.print("[ " + a[i][j] + " ]");
                if (a[i][j] > maior) {
                    maior = a[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
                if (a[i][j] < menor) {
                    menor = a[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
        }
        System.out.println("\nMaior número: " + maior + " Posição: (" + linhaMaior + ", " + colunaMaior + ")");
        System.out.println("Menor número: " + menor + " Posição: (" + linhaMenor + ", " + colunaMenor + ")");
    }
}
