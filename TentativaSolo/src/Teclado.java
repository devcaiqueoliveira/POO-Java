public class Teclado {

    private String cor;
    private short teclas;
    private float versao;
    private String tamanho;

    public Teclado(String cor, short teclas, float versao, String tamanho) {
        this.cor = cor;
        this.teclas = teclas;
        this.versao = versao;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public short getTeclas() {
        return teclas;
    }

    public void setTeclas(short teclas) {
        this.teclas = teclas;
    }

    public float getVersao() {
        return versao;
    }

    public void setVersao(float versao) {
        this.versao = versao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void status() {
        System.out.println("Cor:"  + this.cor);
        System.out.println("Quantidade de Teclas: " + this.teclas);
        System.out.println("Versão: " + this.versao);
        System.out.println("Tamanho: " + this.tamanho);
    }
}
