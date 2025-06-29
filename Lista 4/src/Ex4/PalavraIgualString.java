package Ex4;
import java.util.Scanner;
//Ex4
public class PalavraIgualString {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Insira a primeira palavra: ");
        String p1 = ent.nextLine();
        System.out.print("Insira a segunda palavra: ");
        String p2 = ent.nextLine();
        if (p1.length() != p2.length()) {
            System.out.println("Erro: Palavras de tamanhos diferentes.");
        } else {
            if (p1.equalsIgnoreCase(p2)) {
                System.out.println("Palavras idênticas sem considerar maiúsculas.");
            } else {
                System.out.println("Palavras de mesmo tamanho diferentes.");
            }
            if (p1.equals(p2)) {
                System.out.println("Palavras idênticas.");
            } else {
                System.out.println("Palavras diferentes ao considerar maiúsculas.");
            }
        }
        ent.close();
    }
}