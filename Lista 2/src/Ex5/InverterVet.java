package Ex5;
import java.util.Scanner;
//Ex 5
public class InverterVet{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetO = new int[5];
        int[] vetC = new int[5];

        System.out.println("Digite  5  valores inteiros para preencher o vetor original:");
        for (int i = 0; i < 5; i++) {
            vetO[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            vetC[i] = vetO[5 - 1 - i];
        }

        System.out.print("Vetor original : [");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetO[i]);
            if (i < 5 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("Vetor cópia : [");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetC[i]);
            if (i < 5 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}