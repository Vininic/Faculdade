package Ex2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Ex2 {
    public static void main(String[] args) {
        try {
            FileReader arq = new FileReader("alunos.txt");
            BufferedReader reader = new BufferedReader(arq);
            String l;
            while ((l = reader.readLine()) != null) {
                String[] d = l.split("/");
                String RA = d[0];
                String nome = d[1];
                double nota1 = Double.parseDouble(d[2]);
                double nota2 = Double.parseDouble(d[3]);
                double nota3 = Double.parseDouble(d[4]);
                double m = (nota1 + nota2 + nota3) / 3;
                String aval;
                if (m >= 8.5) {
                    aval = "Excelente";
                } else if (m >= 7.0) {
                    aval = "Bom";
                } else if (m >= 5.0) {
                    aval = "Regular";
                } else {
                    aval = "Preocupante";
                }
                System.out.println("RA: " + RA);
                System.out.println("Nome: " + nome);
                System.out.println("Média: " + m);
                System.out.println("Avaliação: " + aval);
                System.out.println();
            }
            arq.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}