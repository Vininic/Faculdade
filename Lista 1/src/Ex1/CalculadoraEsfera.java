package Ex1;
import java.util.Scanner;
//Ex1
public class CalculadoraEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio da esfera: ");

        final double pi = Math.PI;
        double raio = scanner.nextDouble();
        double comprimento = 2 * pi * raio;
        double area = 4 * pi * Math.pow(raio, 2);
        double volume = 4.0 / 3.0 * pi * Math.pow(raio, 3);

        System.out.println("Comprimento da esfera: " + comprimento);
        System.out.println("Área da esfera: " + area);
        System.out.println("Volume da esfera: " + volume);

        scanner.close();
    }
}