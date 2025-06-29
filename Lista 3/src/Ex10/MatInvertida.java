package Ex10;
//Ex 10
public class MatInvertida{
    public static void main(String[] args) {
        double[][] m = new double[3][4];

        preencherMatriz(m);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void preencherMatriz(double[][] m) {
        double v = 1.0;
        for (int i = 2; i >= 0; i--) {
            for (int j = 3; j >= 0; j--) {
                m[i][j] = v;
                v++;
            }
        }
    }
}