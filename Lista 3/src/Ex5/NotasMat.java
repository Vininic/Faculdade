package Ex5;
import java.util.Scanner;
//Ex 5
public class NotasMat{
    public static void main(String[] args) {
        double[][] n = new double[10][5];
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe as notas do aluno " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                n[i][j] = ent.nextDouble();
            }
        }
        for (int i = 0; i < 10; i++) {
            double somaN = 0;
            for (int j = 0; j < 5; j++) {
                somaN += n[i][j];
            }
            double media = somaN / 5;

            if (media >= 7) {
                System.out.println("Aluno " + (i + 1) + ":");
                System.out.println("Média: " + media);
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Aluno " + (i + 1) + ":");
                System.out.println("Média: " + media);
                System.out.println("Situação: Reprovado");
            }
        }
        double somaM = 0;
        for (int i = 0; i < 10; i++) {
            double somaN = 0;
            for (int j = 0; j < 5; j++) {
                somaN += n[i][j];
            }
            somaM += somaN / 5;
        }
        double mediaClasse = somaM / 10;
        System.out.println("\nMédia da Classe: " + mediaClasse);
    }
}