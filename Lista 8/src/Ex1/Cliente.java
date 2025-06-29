    package Ex1;
    public class Aluno {
        private int RA;
        private String nome;
        private double saldo;
        public Aluno(int numeroConta, String senha, double saldo) {
            this.RA = numeroConta;
            this.nome = senha;
            this.saldo = saldo;
        }
        public int getRA() {
            return RA;
        }
        public String getNome() {
            return nome;
        }
        public double getSaldo() {
            return saldo;
        }
        public void sacar(double valor) {
            saldo -= valor;
        }
        public void depositar(double valor) {
            saldo += valor;
        }
    }