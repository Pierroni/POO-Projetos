public class Conta {
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta() {
        this.saldo = 0.0F;
        this.status = true;
    }

    public Conta(int numeroConta, int agencia, String nomeCliente, float saldo, boolean status) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0F;
        this.status = true;
    }

    public void depositar(float x) {
        if (this.status) {
            this.saldo += x;
            System.out.println("Saldo Atualizado: " + this.saldo);
        }

    }

    public void sacar(float x) {
        if (this.status) {
            if (x <= this.saldo) {
                this.saldo -= x;
                System.out.println("Saque realizado: " + x);
            } else {
                System.out.println("Saldo Insuficiente ");
            }
        } else {
            System.out.println("Conta Inativa");
        }

    }

    public void encerrarConta() {
        if (this.status && this.saldo == 0.0F) {
            this.status = false;
            System.out.println("Conta Encerrada");
        } else {
            System.out.println("Sacar valor antes de encerrar");
        }

    }

    public String toString() {
        return "numeroConta: " + this.numeroConta + " | agencia: " + this.agencia + " | nomeCliente: " + this.nomeCliente + " | saldo: " + this.saldo + " | status: " + (this.status ? "Conta Ativa" : "Conta Encerrada");
    }
}
