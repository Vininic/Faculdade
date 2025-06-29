package Ex6;
import java.util.Scanner;
//Ex 6
public class DiagonalMat {
    public static void main(String[] args) {
        int[][] m = new int[3][3];
        Scanner ent = new Scanner(System.in);
        System.out.println("Insira números inteiros para preencher uma matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o elemento [%d][%d]: ", i, j);
                m[i][j] = ent.nextInt();
            }
        }
        int somaDP = 0;
        int somaDS = 0;
        for (int i = 0; i < 3; i++) {
            somaDP += m[i][i];
            somaDS += m[i][2 - i];
        }
        System.out.println("\nSoma dos elementos da diagonal principal: " + somaDP);
        System.out.println("Soma dos elementos da diagonal secundária: " + somaDS);
        System.out.println("\nSoma dos elementos de cada linha:");
        for (int i = 0; i < 3; i++) {
            int somaL = 0;
            for (int j = 0; j < 3; j++) {
                somaL += m[i][j];
            }
            System.out.println("Linha " + (i + 1) + ": " + somaL);
        }
        System.out.println("\nSoma dos elementos de cada coluna:");
        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += m[i][j];
            }
            System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
        }
    }
}