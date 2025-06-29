package Ex5;
import java.util.Scanner;
//Ex 5
public class CalculadoraAlturaEPeso{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura (em m): ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o sexo (M ou F): ");
        char sexo = scanner.next().charAt(0);

        double pesoIdeal = 0;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido");
            System.exit(0);
        }

        System.out.println("Peso ideal: " + pesoIdeal + " kg");

        scanner.close();
    }
}
