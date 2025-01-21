public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        saldo = 0;
        status = false;
    }

    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }

    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(int s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean s){
        this.status = s;
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            saldo = 50;
            //setSaldo(50);
        }
        else if (t == "CP") {
            saldo = 150;
            //setSaldo(150);
        }
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Erro! Conta com dinheiro.");
        }
        else if (saldo < 0) {
            System.out.println("Conta negativada, regularize para continuar!");
        }
        else {
            setStatus(false);
        }
    }

    public void depositar(float v) {
        // if (status == true) {
        if (getStatus()) {
            saldo += v;
            //setSaldo(getSaldo() + v);
        }
    }

    public void sacar(float v) {
        if (getStatus()) {
            if (getSaldo() > v) {
                saldo -= v;
            }
            else {
                System.out.println("Saldo Insuficiente");
            }
        }
        else {
            System.out.println("Impossivel Sacar");
        }
    }

    public void pagarMensal() {
        float v;
        if (getTipo() == "CC") {
            v = 12;
        }
        else if (getTipo() == "CP") {
            v = 20;
        }
        if (getStatus()) {
            if (saldo > v) {
                saldo -= v;
            }
            else {
                System.out.println("Saldo Insuficiente");
            }
        }
        else {
            System.out.println("Impossivel Pagar");
        }
    }

}
