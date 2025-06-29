import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Ex3 {
 public static void main(String[] args) {
        try {
            Scanner ent = new Scanner(System.in);
            try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("alunos.txt", true));
            ent.nextLine();
            System.out.print("Digite o RA do aluno: ");
            String RA = ent.nextLine();
            System.out.print("Digite o nome do aluno: ");
            String nome = ent.nextLine();
            System.out.print("Digite a primeira nota: ");
            double n1 = ent.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double n2 = ent.nextDouble();
            System.out.print("Digite a terceira nota: ");
            double n3 = ent.nextDouble();
            double m = (n1 + n2 + n3) / 3;
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
            escritor.write(RA + "/" + nome + "/" + n1 + "/" + n2 + "/" + n3 + "\n");
            escritor.close();
            System.out.println("Aluno inserido com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo.");
            e.printStackTrace();
        }
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
                ent.close();
            }
            arq.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}