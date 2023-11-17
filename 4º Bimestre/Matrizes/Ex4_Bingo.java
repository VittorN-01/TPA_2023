import java.util.*;

public class Ex4_Bingo {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int a[][] = criarCartela();
        int rodadas = 0;
        Set<Integer> numerosCartela = new HashSet<>();
        
        while (numerosCartela.size() < 16) {
            System.out.print("\nInforme o número sorteado (de 1 a 75) ou digite 0 para encerrar o jogo: ");
            int numeroSorteado = in.nextInt();

            if (numeroSorteado == 0) {
                System.out.println("Jogo encerrado.");
                return;
            }

            rodadas++;

            if (verificarCartela(a, numeroSorteado)) {
                System.out.println("Você tem o número " + numeroSorteado + " na cartela!");
                numerosCartela.add(numeroSorteado);
            } else {
                System.out.println("Número " + numeroSorteado + " não está na sua cartela.");
            }
        }
        
        System.out.println("\nBINGO!");
        System.out.println("Você conseguiu em " + rodadas + " rodadas.");
        in.close();
    }

    public static int[][] criarCartela() {
        Random random = new Random();
        int[][] cartela = new int[4][4];
        int n;
        Set<Integer> numerosUsados = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                do {
                    n = random.nextInt(75) + 1;
                } while (numerosUsados.contains(n));

                cartela[i][j] = n;
                numerosUsados.add(n);
            }
        }

        return cartela;
    }

    public static boolean verificarCartela(int[][] cartela, int numeroSorteado) {
        int i, j;
    	for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (cartela[i][j] == numeroSorteado) {
                    return true;
                }
            }
        }
        return false;
    }
}
