public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Joao", 16, "Masculino");
        p[1] = new Pessoa("Maria", 22, "Feminino");

        l[0] = new Livro("Aprendendo Java", p[0], "Jose Bezerra", 200);
        l[1] = new Livro("Aprendendo POO", p[1], "Maria Bethania", 500);
        l[2] = new Livro("Verdades Abosulutas", p[1], "Tancredo Neves", 350);

        l[0].folhear(100);
        System.out.println(l[0].detalhes());
    }
}