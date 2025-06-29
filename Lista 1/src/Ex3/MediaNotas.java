package Ex3;
import java.util.Scanner;
//Ex 3
public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        double m = (n1 + n2) / 2;
        System.out.println("Média aritmética: " + m);

        if (m >= 0.0 && m <= 3.9) {
            System.out.println("Situação: Reprovado");
        } else if (m >= 4.0 && m <= 6.9) {
            System.out.println("Situação: Exame");
        } else if (m >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Valor de média inválido");
        }

        scanner.close();
    }
}