public class Conta {

    //DEfinir os atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //CONSTRUCTOR
    public Conta(int numConta, String tipo, String dono, double saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    //GETTERS E SETTERS
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    //[MÉTODO: abrirConta]
    public void abrirConta(String tipo) {
    this.setTipo(tipo);
    this.setStatus(true);

    if (tipo == "cc") {
        this.setSaldo(this.getSaldo() + 50);
    } else {
        this.setSaldo(this.getSaldo() + 150);
    }
    System.out.println("Conta aberta com sucesso!");
    }

    //[MÉTODO: fecharConta]
    public void fecharConta() {

        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta com débitos.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }        
    }

    //[MÉTODO: depositar]
    public void depositar(double saldo) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + saldo);
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Impossivel depositar! Conta fechada.");
        }
    }

    //[MÉTODO: sacar]
    public void sacar(double saque) {
        if (this.getStatus() == true && this.getSaldo() >= saque) {
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Saque realizado com suceso!");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    //[MÉTODO: mensalidade]
    public void mensalidade() {
        byte taxa;

        if (this.getTipo() == "cc") {
            taxa = 12;
        } else {
            taxa = 20;
        }
        if (this.getSaldo() >= taxa) {
            this.setSaldo(this.getSaldo() - taxa);
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void status() {
        System.out.println("\nConta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}
