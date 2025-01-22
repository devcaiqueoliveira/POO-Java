public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumeroConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CP");

        ContaBanco p2 = new ContaBanco();
        p2.setNumeroConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CC");

        p1.estadoAtual();
        p2.estadoAtual();
    }
}