package Ex7;
import java.util.Scanner;
//Ex 7
public class GrausMat{
    public static void main(String[] args) {
        int[][] m = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] mR = M90Graus(m);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mR[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] M90Graus(int[][] m) {
        int n = m.length;
        int[][] mR = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mR[i][j] = m[n - j - 1][i];
            }
        }
        return mR;
    }
}