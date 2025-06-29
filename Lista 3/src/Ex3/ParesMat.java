package Ex3;
//Ex 3
import java.util.Scanner;
public class ParesMat {
    public static void main(String[] args) {
        int[][] m = new int[2][4];
        Scanner ent = new Scanner(System.in);
        System.out.println("Preencha a matriz 2x4 com números inteiros:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite o elemento [%d][%d]: ", i, j);
                m[i][j] = ent.nextInt();
            }
        }
        int quantpar = 0, somapar = 0;
        for (int i = 0; i < 2; i++) {
            int parl = 0;
            for (int j = 0; j < 4; j++) {
                if (m[i][j] % 2 == 0) {
                    parl++;
                    somapar += m[i][j];
                }
            }
            System.out.printf("Na linha %d, há %d elementos pares\n", i, parl);
            quantpar += parl;
        }
        double mpar = quantpar > 0 ? (double) somapar / quantpar : 0.0;
        System.out.printf("Média dos elementos pares: %.2f\n", mpar);
    }
}