package Ex8;
import java.util.Scanner;
//Ex 8
public class Inverter9Vet {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetO = new int[9];
        int[] vetC = new int[9];

        System.out.println("Digite  9  valores inteiros para preencher o vetor:");
        for (int i = 0; i < 9; i++) {
            vetO[i] = scanner.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            vetC[i] = vetO[9 - 1 - i];
        }

        System.out.print("Vetor original : [");
        for (int i = 0; i < 9; i++) {
            System.out.print(vetO[i]);
            if (i < 9 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("Vetor invertido : [");
        for (int i = 0; i < 9; i++) {
            System.out.print(vetC[i]);
            if (i < 9 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}