public class ContaBancaria {
    private String nConta;
    private String nTitular;
    private double saldo;

    public ContaBancaria(String nConta, String nTitular, double saldo){
        this.nConta = nConta;
        this.nTitular = nTitular;
        this.saldo = saldo;
    }

    public String getnTitular(){
        return this.nTitular;
    }
    public String getnConta(){
        return this.nConta;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void setnTitular(String titular) {
        this.nTitular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Houve um deposito no valor de R$" + valor + " em sua conta");
        }
        else {
            System.out.println("Ocorreu um erro ao realizar o deposito");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque no valor de R$" + valor + " realizado com sucesso");
        }
        else {
            System.out.println("Saldo da conta insuficente ou valor invalido");
        }
    }

    public void exibirInfo(){
        System.out.println("Numero da conta: " + nConta);
        System.out.println("Nome do titular: " + nTitular);
        System.out.printf("Saldo atual: %.2f%n", saldo);
    }

}