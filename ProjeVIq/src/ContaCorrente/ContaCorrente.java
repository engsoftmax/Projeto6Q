package ContaCorrente;

class ContaCorrente {
    private String numeroConta;
    private String nomeConta;
    private double saldo;

    public ContaCorrente(String numeroConta, String nomeConta) {
        this.numeroConta = numeroConta;
        this.nomeConta = nomeConta;
        this.saldo = 0.0;
    }

    public ContaCorrente(String numeroConta, String nomeConta, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeConta = nomeConta;
        this.saldo = saldo;
    }

    public void alteraNome(String novoNome) {
        this.nomeConta = novoNome;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void saque(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeConta() {
        return nomeConta;
    }
    
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("12345", "João");
        ContaCorrente conta2 = new ContaCorrente("67890", "Maria", 1000.0);

        System.out.println("Conta 1 - Número: " + conta1.getNumeroConta() +
                           ", Nome: " + conta1.getNomeConta() +
                           ", Saldo: " + conta1.getSaldo());

        System.out.println("Conta 2 - Número: " + conta2.getNumeroConta() +
                           ", Nome: " + conta2.getNomeConta() +
                           ", Saldo: " + conta2.getSaldo());

        conta1.deposito(500.0);
        conta2.saque(200.0);

        System.out.println("Saldo da conta 1 após depósito: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2 após saque: " + conta2.getSaldo());

        conta1.alteraNome("João Silva");
        System.out.println("Novo nome da conta 1: " + conta1.getNomeConta());
    }
}
