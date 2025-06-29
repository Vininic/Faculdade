package Ex8;
import java.util.Scanner;
//Ex 8
public class MDCEuclides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        int divisor, dividendo, c;

        if (b > a) {
            dividendo = b;
            divisor = a;
        } else {
            dividendo = a;
            divisor = b;
        }

        while (dividendo % divisor != 0) {
            c = dividendo % divisor;
            dividendo = divisor;
            divisor = c;
        }

        int mdc = divisor;

        System.out.println("MDC entre " + a + " e " + b + " é: " + mdc);

        scanner.close();
    }
}