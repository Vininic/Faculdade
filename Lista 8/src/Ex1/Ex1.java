package Ex1;
import javax.swing.JOptionPane;
public class Ex1 {
    private static Aluno[] alunos = new Aluno[5];
    public static void main(String[] args) {
        inicializarClientes();

        while (true) {
            String escolha = JOptionPane.showInputDialog("Menu:\n"
                    + "1. Sacar\n"
                    + "2. Depositar\n"
                    + "3. Saldo\n"
                    + "4. Sair");
            switch (escolha) {
                case "1":
                    sacar();
                    break;
                case "2":
                    depositar();
                    break;
                case "3":
                    verificarSaldo();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }
    public static void inicializarClientes() {
        alunos[0] = new Aluno(1, "senha1", 1000);
        alunos[1] = new Aluno(2, "senha2", 1500);
        alunos[2] = new Aluno(3, "senha3", 2000);
        alunos[3] = new Aluno(4, "senha4", 2500);
        alunos[4] = new Aluno(5, "senha5", 3000);
    }
    public static void sacar() {
        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
        String senha = JOptionPane.showInputDialog("Digite a senha:");
        Aluno aluno = null;
        for (Aluno c : alunos) {
            if (c.getRA() == numeroConta && c.getNome().equals(senha)) {
                aluno = c;
                break;
            }
        }
        if (aluno == null) {
            JOptionPane.showMessageDialog(null, "Número da conta ou senha inválidos.");
            return;
        }
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar:"));
        if (valor > aluno.getSaldo()) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
        } else {
            aluno.sacar(valor);
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso. Saldo atual: " + aluno.getSaldo());
        }
    }
    public static void depositar() {
        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
        String senha = JOptionPane.showInputDialog("Digite a senha:");
        Aluno cliente = null;
        for (Aluno c : alunos) {
            if (c.getRA() == numeroConta && c.getNome().equals(senha)) {
                cliente = c;
                break;
            }
        }
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Número da conta ou senha inválidos.");
            return;
        }
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar:"));
        cliente.depositar(valor);
        JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso. Saldo atual: " + cliente.getSaldo());
    }
    public static void verificarSaldo() {
        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
        String senha = JOptionPane.showInputDialog("Digite a senha:");
        Aluno cliente = null;
        for (Aluno c : alunos) {
            if (c.getRA() == numeroConta && c.getNome().equals(senha)) {
                cliente = c;
                break;
            }
        }
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Número da conta ou senha inválidos.");
            return;
        }
        JOptionPane.showMessageDialog(null, "Saldo atual: " + cliente.getSaldo());
    }
}