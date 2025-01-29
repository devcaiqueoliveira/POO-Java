public class Main {
    public static void main(String[] args) {
        Funcionario f[] = new Funcionario[3];
        f[0] = new Funcionario("Joao", 22, 2500);
        f[1] = new Funcionario("Pedro", 18, 1510);
        f[2] = new Funcionario("Maria", 36, 42000);
        System.out.println("=====EXIBINDO DADOS DOS FUNCIONARIOS=====");
        f[0].exibirDados();
        System.out.println("-----------------------------------------");
        f[1].exibirDados();
        System.out.println("-----------------------------------------");
        f[2].exibirDados();
        System.out.println("=========================================");
        f[0].aumentarSalario(10);
        f[1].aumentarSalario(10);
        f[2].aumentarSalario(10);
        System.out.println("Aumento de 10% aplicado a todo quadro de funcionarios, atualizando informações...");
        System.out.println("=====EXIBINDO DADOS DOS FUNCIONARIOS=====");
        f[0].exibirDados();
        System.out.println("-----------------------------------------");
        f[1].exibirDados();
        System.out.println("-----------------------------------------");
        f[2].exibirDados();
        System.out.println("=========================================");
    }
}