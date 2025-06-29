package Ex10;
import java.util.Scanner;
//Ex 10
public class SistemaAvaliação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlunos = 10;
        int totalAulas = 60;
        int Aprovados = 0;
        int Reprovados = 0;
        double maiorMedia = Double.MIN_VALUE;
        double menorMedia = Double.MAX_VALUE;
        double mediaTurma = 0;

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.println("Aluno " + i);
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();

            System.out.print("Digite as 3 notas: ");
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();
            double nota3 = scanner.nextDouble();

            System.out.print("Frequência: ");
            int frequencia = scanner.nextInt();

            double notaFinal = (nota1 + nota2 + nota3) / 3.0;

            if (frequencia >= 0.75 * totalAulas) {
                System.out.println("Aprovado");
                Aprovados++;
            } else {
                System.out.println("Reprovado");
                Reprovados++;
            }

            System.out.println("Matrícula: " + matricula);
            System.out.println("Frequência: " + frequencia);
            System.out.println("Nota final: " + notaFinal);

            if (notaFinal >= 6.0) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }

            if (notaFinal > maiorMedia) {
                maiorMedia = notaFinal;
            }

            if (notaFinal < menorMedia) {
                menorMedia = notaFinal;
            }

            mediaTurma += notaFinal;
        }

        mediaTurma /= totalAlunos;

        System.out.println("Maior média da turma: " + maiorMedia);
        System.out.println("Menor média da turma: " + menorMedia);
        System.out.println("Média geral da turma: " + mediaTurma);
        System.out.println("Número de alunos aprovados: " + Aprovados);
        System.out.println("Número de alunos reprovados: " + Reprovados);

        scanner.close();
    }
}