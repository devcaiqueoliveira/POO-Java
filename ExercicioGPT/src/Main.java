public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Ponte para Terabitia", "Marcos Russvelt", 2002, 206);
        l1.emprestar();
        l1.exibirInfo();
    }
}