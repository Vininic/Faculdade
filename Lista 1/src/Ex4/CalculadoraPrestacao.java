package Ex4;
import java.util.Scanner;
//Ex 4
public class CalculadoraPrestacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        System.out.println("Selecionar operação:");
        System.out.println("1 - Média entre os números");
        System.out.println("2 - Diferença entre o maior e o menor número");
        System.out.println("3 - Produto entre os números");
        int escolha = scanner.nextInt();
        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = (n1 + n2) / 2;
                System.out.println("Média: " + resultado);
                break;
            case 2:
                resultado = Math.abs(n1 - n2);
                System.out.println("Diferença: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("Produto: " + resultado);
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }
}