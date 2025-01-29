public class Funcionario implements Salario {
    String nome;
    int idade;
    double salario;

    public Funcionario (String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public void aumentarSalario(double percentual) {
        this.setSalario((this.getSalario() * percentual/100) + this.getSalario());
    }

    @Override
    public void exibirDados() {
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salario: " + this.getSalario());
    }
}
