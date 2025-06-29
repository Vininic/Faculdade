package Ex8;
import java.util.Scanner;
//Ex 8
public class ProgramaçãoString {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Insira a disciplina: ");
        String d = ent.nextLine().toLowerCase();
        if (d.contains("programação")) {
            System.out.println("É da categoria de Programação");
        } else {
            System.out.println("Não é da categoria de Programação");
        }
        ent.close();
    }
}