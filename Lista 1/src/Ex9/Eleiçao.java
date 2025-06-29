package Ex9;
import java.util.Scanner;
//Ex 9
public class Eleiçao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        int v5 = 0, v6 = 0;

        System.out.println("Informe o voto no candidato (1, 2, 3, 4), nulo (5), em branco (6) ou 0 para encerrar:");

        while (true) {
            int voto = scanner.nextInt();
            if (voto == 0) {
                break;
            }
            switch (voto) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    v5++;
                    break;
                case 6:
                    v6++;
                    break;
                default:
                    System.out.println("Voto inválido!");
            }
        }

        System.out.println("Total de votos para cada candidato:");
        System.out.println("Candidato 1: " + c1);
        System.out.println("Candidato 2: " + c2);
        System.out.println("Candidato 3: " + c3);
        System.out.println("Candidato 4: " + c4);
        System.out.println("Total de votos nulos: " + v5);
        System.out.println("Total de votos em branco: " + v6);

        scanner.close();
    }
}





