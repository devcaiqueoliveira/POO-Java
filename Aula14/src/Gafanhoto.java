public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm() {

    }

    @Override
    protected void ganharExp() {

    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "totAssistido=" + totAssistido +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                ", idade=" + idade +
                ", login='" + login + '\'' +
                '}';
    }
}
