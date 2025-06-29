package Ex6;
import java.util.Scanner;
//Ex 6
public class FraseString {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Insira a frase: ");
        String f = ent.nextLine().toLowerCase();
        System.out.print("Insira a letra: ");
        char l = ent.nextLine().toLowerCase().charAt(0);
        System.out.println("Posições da letra '" + l + "' na frase:");
        int p = -1;
        while ((p = f.indexOf(l, p + 1)) != -1) {
            System.out.println("Letra '" + l + "' na posição " + p);
        ent.close();
        }
    }
}