public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Agua Saniatiaria", 1.50, 286);
        Produto p2 = new Produto("Carne Vermelha", 88.20, 15);

        System.out.println("Informacoes dos produtos: ");
        p1.exibirInfo();
        p2.exibirInfo();

        System.out.println("Alterando o estoque do produto1: ");
        p1.adicionarEstoque(5);
        p1.removerEstoque(3);

        System.out.println("Aplicando desconto no produto1");
        p1.aplicarDesconto(30);

        System.out.println("Informacoes atualzidas do produto1");
        p1.exibirInfo();
    }
}