public class ContaBanco {
    public int numeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
            ;
        } else if (t == "CP") {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com dinheiro.");
        } else if (saldo < 0) {
            System.out.println("Conta em Debito.");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta " + this.getDono());
        } else {
            System.out.println("impossivel depositar em uma conta fechada");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar");
        }

    }

    public void pagarMensal(int v) {
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar");
        }
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int n) {
        this.numeroConta = n;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float ss) {
        this.saldo = ss;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }
}
