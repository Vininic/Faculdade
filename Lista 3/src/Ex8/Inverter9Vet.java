package Ex8;
import java.util.Scanner;
//Ex 8
public class Inverter9Vet {
public static void main(String[] args) {
        int[][] mA = new int[4][4];
        int[][] mB = new int[4][4];
        int[][] mS = new int[4][4];
        Scanner ent = new Scanner(System.in);
        System.out.println("Insira os elementos da primeira matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite o elemento [%d][%d]: ", i, j);
                mA[i][j] = ent.nextInt();
            }
        }
        System.out.println("Insira os elementos da segunda matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite o elemento [%d][%d]: ", i, j);
                mB[i][j] = ent.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mS[i][j] = mA[i][j] + mB[i][j];
            }
        }
        System.out.println("Matriz Soma:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mS[i][j] + " ");
            }
            System.out.println();
        }
    }
}