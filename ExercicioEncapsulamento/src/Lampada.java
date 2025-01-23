public class Lampada implements LampadaInterface {
    private boolean ligada;
    private int intensidade;

    public Lampada() {
        this.ligada = false;
        this.intensidade = 50;
    }

    public boolean getLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    @Override
    public void ligar() {
        if (!this.getLigada()) {
            this.setLigada(true);
            System.out.println("Lampada ligada com sucesso!");
        }
        else {
            System.out.println("A lampada ja está ligada");
        }
    }

    @Override
    public void desligar() {
        if (this.getLigada()) {
            this.setLigada(false);
            System.out.println("Lampada desligada");
        }
        else {
            System.out.println("A lampada ja está desligada");
        }
    }

    @Override
    public void diminuirIntensidade() {
        if (this.getIntensidade() > 0) {
            this.setIntensidade(this.getIntensidade() - 1);
            System.out.println("Reduzindo a intensidade da lampada");
        }
        else {
            System.out.println("A intensidade da lampada não está alta o suficiente");
        }
    }

    @Override
    public void aumentarIntensidade() {
        if (this.getIntensidade() >= 1 || this.getIntensidade() == 0) {
            this.setIntensidade(this.getIntensidade() + 1);
            System.out.println("Aumentando a intensidade da lampada");
        }
        else {
            System.out.println("Impossivel aumentar a intensidade da lampada");
        }
    }
}
