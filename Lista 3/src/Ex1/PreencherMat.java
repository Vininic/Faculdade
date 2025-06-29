package Ex1;
public class PreencherMat {
    public static void main(String[] args) {
        int[][] m = new int[3][5];
        int v = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j] = v;
                v++;
            }
        }
        int s = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                s += m[i][j];
            }
        }
        System.out.println("Matriz 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Soma dos elementos: " + s);
    }
}