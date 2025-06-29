package Ex4;
//Ex4
public class MaiorMenorMat{
    public static void main(String[] args) {
        int[][] m = {
                {0, 1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };
        int maior = m[0][0];
        int menor = m[0][0];
        int LMaior = 0, CMaior = 0, LMenor = 0, CMenor = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                    LMaior = i;
                    CMaior = j;
                }
                if (m[i][j] < menor) {
                    menor = m[i][j];
                    LMenor = i;
                    CMenor = j;
                }
            }
        }
        System.out.println("Maior elemento: " + maior);
        System.out.println("Posição: (" + LMaior + ", " + CMaior + ")");
        System.out.println("Menor elemento: " + menor);
        System.out.println("Posição: (" + LMenor + ", " + CMenor + ")");
    }
}