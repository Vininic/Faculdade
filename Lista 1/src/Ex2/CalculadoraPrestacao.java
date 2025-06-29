package Ex2;
import java.util.Scanner;
//Ex 2
public class CalculadoraPrestacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da prestação: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite a taxa de juros (%): ");
        double taxa = scanner.nextDouble();
        System.out.print("Digite o tempo em meses: ");
        int tempo = scanner.nextInt();
        double prestacao = valor + (valor * (taxa / 100) * tempo);

        System.out.println("Prestação em atraso: " + prestacao);

        scanner.close();
    }
}
