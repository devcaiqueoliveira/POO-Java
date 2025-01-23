public class ControleDeLuz implements ControladorDeLuz{
    private boolean ligada;
    private int intensidade;

    public ControleDeLuz() {
        this.ligada = true;
        this.intensidade = 50;
    }

    public boolean getLigada() {
        return this.ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getIntensidade() {
        return this.intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    @Override
    public void ligar() {
        if (!this.getLigada()) {
            this.setLigada(true);
            System.out.println("Lampada Ligada Com Sucesso!");
        }
        else {
            System.out.println("Ocorreu um erro!");
        }
    }

    @Override
    public void desligar() {
        if (this.getLigada()) {
            this.setLigada(false);
            System.out.println("Lampada Desligada Com Sucesso!");
        }
        else {
            System.out.println("Ocorreu um erro!");
        }
    }

    @Override
    public void aumentarIntensidade() {
        if (this.getIntensidade() <= 90) {
            this.setIntensidade(this.getIntensidade() + 10);
            System.out.println("Intensidade aumentada em 10.");
        }
        else {
            System.out.println("Intensidade já está no limite!");
        }
    }

    @Override
    public void diminuirIntensidade() {
        if (this.getIntensidade() >= 10) {
            this.setIntensidade(this.getIntensidade() - 10);
            System.out.println("Intensidade reduzida em 10.");
        }
        else {
            System.out.println("Intensidade não pode ser reduzida!");
        }
    }

    @Override
    public void mostrarStatus() {
        System.out.println("------ Status Atual da Lampada ------");
        System.out.println("Ligada: " + this.getLigada());
        System.out.println("Intensidade: " + this.getIntensidade());
    }
}
