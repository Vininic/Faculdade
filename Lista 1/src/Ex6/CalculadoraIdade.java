package Ex6;
import java.util.Scanner;
//Ex 6
public class CalculadoraIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 10;
        int contadorMDe18 = 0;
        int somaIdades = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                contadorMDe18++;
            }

            somaIdades += idade;
        }

        double mediaIdade = (double) somaIdades / totalPessoas;

        System.out.println("Quantidade de pessoas com idade maior ou igual a 18 anos: " + contadorMDe18);
        System.out.println("Média de idade: " + mediaIdade);

        scanner.close();
    }
}