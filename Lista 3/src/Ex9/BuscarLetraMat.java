package Ex9;
import java.util.Scanner;
public class BuscarLetraMat {
    public static void main(String[] args) {
        char[][] m = new char[5][5];
        Scanner ent = new Scanner(System.in);
        preencherM(m);
        System.out.print("Digite uma letra: ");
        char letra = ent.next().charAt(0);
        buscarLetra(m, letra);

        ent.close();
    }

    public static void preencherM(char[][] m) {
        char letra = 'A';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j] = letra;
                letra++;
            }
        }
    }

    public static void buscarLetra(char[][] m, char letra) {
        System.out.println("Posições encontradas para a letra '" + letra + "':");

        int encontradas = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (m[i][j] == letra) {
                    System.out.println("(" + i + ", " + j + ")");
                    encontradas++;
                }
            }
        }

        if (encontradas == 0) {
            System.out.println("A letra não foi encontrada na matriz.");
        }
    }
}