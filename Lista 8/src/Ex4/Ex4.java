package Ex4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class Ex4 {
    private static ArrayList<Contato> contatos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Inserir Contato");
            System.out.println("2. Listar Contatos (Ordem Alfabética)");
            System.out.println("3. Buscar Contatos por Inicial");
            System.out.println("4. Deletar Contato");
            System.out.println("5. Finalizar");
            System.out.print("Escolha uma opção: ");
            int option = ent.nextInt();
            switch (option) {
                case 1:
                    inserirContato(ent);
                    break;
                case 2:
                    listarContatos();
                    break;
                case 3:
                    buscarContatosPorInicial(ent);
                    break;
                case 4:
                    deletarContato(ent);
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
                    ent.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    public static void inserirContato(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        Contato novoContato = new Contato(nome, telefone);
        contatos.add(novoContato);
        System.out.println("Contato inserido com sucesso.");
    }
    public static void listarContatos() {
        Collections.sort(contatos);
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
    public static void buscarContatosPorInicial(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Digite a inicial para buscar contatos: ");
        char inicial = scanner.nextLine().charAt(0);
        for (Contato contato : contatos) {
            if (contato.getNome().charAt(0) == inicial) {
                System.out.println(contato);
            }
        }
    }
    public static void deletarContato(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Digite o nome do contato a ser deletado: ");
        String nome = scanner.nextLine();
        Iterator<Contato> iterator = contatos.iterator();
        while (iterator.hasNext()) {
            Contato contato = iterator.next();
            if (contato.getNome().equals(nome)) {
                iterator.remove();
                System.out.println("Contato deletado.");
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }
}