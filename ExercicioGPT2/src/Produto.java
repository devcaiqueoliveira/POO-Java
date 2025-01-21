public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto (String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public int getEstoque(){
        return this.estoque;
    }

    public void setPreco(double preco){
        if (preco > 0) {
            this.preco = preco;
        }
        else {
            System.out.println("Preço inválido");
        }
    }

    public void adicionarEstoque(int quantidade){
        if (quantidade > 0){
            this.estoque += quantidade;
            System.out.println("Foi adicionado " + quantidade + " ao estoque");
        }
        else {
            System.out.println("Quantidade invalida");
        }
    }

    public void removerEstoque(int quantidade){
        if (quantidade > 0 && quantidade <= this.estoque) {
            this.estoque -= quantidade;
            System.out.println("Foi retirado " + quantidade + " do estoque");
        }
        else {
            System.out.println("Quantidade invalida ou estoque insuficiente");
        }
    }

    public void aplicarDesconto(double porcentagem){
        if (porcentagem > 0 && porcentagem <=100) {
            this.preco = preco - (preco * (porcentagem /100));
        }
        else {
            System.out.println("Desconto nao aplicado");
        }
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço:  R$ " + preco);
        System.out.println("Quantidade em Estoque: " + estoque);
    }
}