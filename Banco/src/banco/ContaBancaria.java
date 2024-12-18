package banco;

public class ContaBancaria {
    private String CPF;
    protected double saldo, depositos, saques;

    public ContaBancaria(String CPF, double saldo) {
        this.CPF = CPF;
        this.saldo = saldo;
        depositos = 0;
        saques = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
        depositos += saldo;
    }

    public double getDepositos() {
        return depositos;
    }

    public void setDepositos(double depositos) {
        this.depositos = depositos;
    }

    public double getSaques() {
        return saques;
    }

    public void setSaques(double saques) {
        this.saques = saques;
    }

    public String getCPF() {
        return CPF;
    }

    public double getSaldo() {
        return saldo;
    }


    public void print() {
        System.out.print("\nCPF=  " + this.CPF + "\nSaldo=  " + this.saldo);
    }
    
}
