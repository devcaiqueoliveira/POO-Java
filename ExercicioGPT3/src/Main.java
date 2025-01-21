public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Um", "Marcos", 860.47);
        ContaBancaria c2 = new ContaBancaria("Dois", "joao Alfredo", 423.12);

        System.out.println("Informacoes inicias das contas");
        c1.exibirInfo();
        c2.exibirInfo();

        System.out.println("Deposito realizado na conta1");
        c1.depositar(243);
        System.out.println("Segue os dados da conta1 atualizados");
        c1.exibirInfo();
    }
}