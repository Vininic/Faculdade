package Ex9;
import java.util.Scanner;
//Ex 9
public class IndiceVet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetorOriginal = new double[10];
        double[] vetorCopia = new double[3];

        System.out.println("Digite 10 valores reais para preencher o vetor original:");
        for (int i = 0; i < 10; i++) {
            vetorOriginal[i] = scanner.nextDouble();
        }
        System.out.print("Escolha um índice de 0 a 9 para iniciar a cópia: ");
        int indiceEscolhido = scanner.nextInt();

        if (indiceEscolhido < 0 || indiceEscolhido > 10 - 3) {
            System.out.println("Índice escolhido não permite a cópia de 3 números.");
        } else {
            
            for (int i = 0; i < 3; i++) {
                vetorCopia[i] = vetorOriginal[indiceEscolhido + i];
            }
            System.out.print("vetor_cópia [");
            for (int i = 0; i < 3; i++) {
                System.out.print(vetorCopia[i]);
                if (i < 2) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}