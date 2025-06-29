package Ex2;
import java.util.Scanner;
//Ex 2
public class QuantVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores: ");
        int t = scanner.nextInt();

        int[] vetor = new int[t];
        int p = 0;
        int imp = 0;

        System.out.println("Insira os valores:");

        for (int i = 0; i < t; i++) {
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 == 0) {
                p++;
            } else {
                imp++;
            }
        }

        System.out.println("Quantidade de valores pares: " + p);
        System.out.println("Quantidade de valores ímpares: " + imp);
    }
}