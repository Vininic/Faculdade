package Ex5;
import java.util.Scanner;
//Ex 5
public class ExtensoString {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Insira o dígito: ");
        String n = ent.nextLine();
        
        if (n.matches("\\d+")) {
            String r = DigExt(n);
            System.out.println("Por extenso: " + r);
        } else {
            System.out.println("Insira apenas números.");
        }
        ent.close();
    }
    public static String DigExt(String n) {
        String[] numerosExtenso = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        StringBuilder resultado = new StringBuilder();
        for (char d : n.toCharArray()) {
            int i = Character.getNumericValue(d);
            resultado.append(numerosExtenso[i]).append(", ");
        }
        if (resultado.length() > 0) {
            resultado.delete(resultado.length() - 2, resultado.length());
        }
        return resultado.toString();
    }
}