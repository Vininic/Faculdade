package Ex7;
import java.util.Scanner;
//Ex 7
public class Inverter8Vet{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetO = new int[8];
        int[] vetC = new int[8];

        System.out.println("Digite  8  valores inteiros para preencher o vetor:");
        for (int i = 0; i < 8; i++) {
            vetO[i] = scanner.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            vetC[i] = vetO[8 - 1 - i];
        }

        System.out.print("Vetor original : [");
        for (int i = 0; i < 8; i++) {
            System.out.print(vetO[i]);
            if (i < 8 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("Vetor invertido : [");
        for (int i = 0; i < 8; i++) {
            System.out.print(vetC[i]);
            if (i < 8 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}