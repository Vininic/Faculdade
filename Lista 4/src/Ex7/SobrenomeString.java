package Ex7;
import java.util.Scanner;
//Ex 7
public class SobrenomeString {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite o nome completo: ");
        String name = ent.nextLine();
        String[] nameP = name.split(" ");
        String Sname = nameP[nameP.length - 1];
        System.out.println("Sobrenome: " + Sname);
        ent.close();
    }
}