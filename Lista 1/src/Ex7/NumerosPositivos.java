package Ex7;
import java.util.Scanner;
//Ex 7
public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int s = 0;

        while (true) {
            System.out.print("Digite um valor positivo (valores negativos ou 0 encerrarão o programa): ");
            int v = scanner.nextInt();

            if (v <= 0) {
                break;
            }

            s += v;
            contador++;
        }

        if (contador > 0) {
            double media = (double) s / contador;
            System.out.println("Somatório dos valores positivos: " + s);
            System.out.println("Média dos valores positivos: " + media);
        } else {
            System.out.println("Nenhum valor positivo foi digitado.");
        }

        scanner.close();
    }
}