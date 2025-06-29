package Ex3;
//Ex 3
import java.util.Scanner;
public class VogalString {
        public static void main(String[] args){ 
        Scanner ent = new Scanner (System.in); 
        System.out.println ("Insira a palavra: "); 
        String word =  ent.nextLine(); 
        String wordUC =  word.toUpperCase(); 
        int v = 0;
        int e = 0;
        for (int i = 0; i < word.length(); i++){ 
            System.out.println (word.charAt(i));
            char l = wordUC.charAt(i);
            if (l == 'A'||l == 'E'||l == 'I'||l == 'O'||l == 'U') {
                v++; }
                else if (l == ' ') {
                    e++;}
        } 
        System.out.println("Vogais: " + v);
        System.out.println("Espaços: " + e);
        ent.close(); 
    } 
} 