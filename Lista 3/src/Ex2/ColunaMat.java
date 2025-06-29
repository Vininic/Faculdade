package Ex2;
import java.util.Scanner;
//Ex2
public class ColunaMat {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os elementos da matriz (coluna-a-coluna):");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Digite o elemento para a linha " + (j + 1) + " e coluna " + (i + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}