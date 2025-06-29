package Ex4;
import java.util.Scanner;
//Ex 4
public class NotasVet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int tamanhoMaximo = 100;
        double[] n = new double[tamanhoMaximo];
        int cont = 0;
        double s = 0;

        System.out.println("Digite as notas dos alunos (ou -1 para encerrar):");

        double nota = scanner.nextDouble();
        while (nota != -1 && cont < tamanhoMaximo) {
            n[cont] = nota;
            s += nota;
            cont++;
            nota = scanner.nextDouble();
        }

        if (cont == 0) {
            System.out.println("Nenhuma nota foi inserida.");
            return;
        }

        double m = s / cont;

        System.out.println("Quantidade de valores lidos: " + cont);

        System.out.println("Valores na ordem em que foram informados:");
        for (int i = 0; i < cont; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();

        System.out.println("Valores na ordem inversa:");
        for (int i = cont - 1; i >= 0; i--) {
            System.out.println(n[i]);
        }

        System.out.println("Soma dos valores: " + s);
        System.out.println("Média dos valores: " + m);

        int acimaDaM = 0;
        for (int i = 0; i < cont; i++) {
            if (n[i] > m) {
                acimaDaM++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaDaM);
    }
}