package Ex6;
import java.util.Scanner;
//Ex 6
public class MaiorSomaVet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = 3;
        double[] vet1 = new double[t];
        double[] vet2 = new double[t];
        double[] vet3 = new double[6];

        System.out.println("Digite " + t + " valores reais para o vetor 1:");
        for (int i = 0; i < t; i++) {
            vet1[i] = scanner.nextDouble();
        }

        System.out.println("Digite " + t + " valores reais para o vetor 2:");
        for (int i = 0; i < t; i++) {
            vet2[i] = scanner.nextDouble();
        }

        double somaVetor1 = calcularSoma(vet1);
        double somaVetor2 = calcularSoma(vet2);

        if (somaVetor1 >= somaVetor2) {
            System.arraycopy(vet1, 0, vet3, 0, t);
        } else {
            System.arraycopy(vet2, 0, vet3, 0, t);
        }

        System.arraycopy(vet1, 0, vet3, t, t);

        System.out.print("vetor1 [");
        imprimirVetor(vet1);
        System.out.println("]");

        System.out.print("vetor2 [");
        imprimirVetor(vet2);
        System.out.println("]");

        System.out.print("vetor3 [");
        imprimirVetor(vet3);
        System.out.println("]");
    }

    public static double calcularSoma(double[] vetor) {
        double soma = 0;
        for (double elemento : vetor) {
            soma += elemento;
        }
        return soma;
    }
    public static void imprimirVetor(double[] vetor) {
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
    }
}