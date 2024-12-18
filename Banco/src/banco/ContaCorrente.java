package banco;

public class ContaCorrente extends ContaBancaria implements Control{
    private double limiteCheque, juros;

    public ContaCorrente(String CPF, double saldo, double limiteCheque) {
        super(CPF, saldo);
        this.limiteCheque = limiteCheque;
        this.juros = 0;
    }

    @Override
    public boolean sacar(double valor) {
        double aceito = this.saldo + this.limiteCheque;
        if(valor <= aceito){
            this.saldo -= valor;
            this.saques += valor;
            return true;
        }
        return false;
    }

    @Override
    public void atualizar(double taxa) {
        if(this.saldo < 0){
            this.juros = (this.saldo * (taxa / 100));
            if(this.juros < 0){
                this.juros *= -1;
            }
        }
    }

    @Override
    public void fecharMes() {
        System.out.print("\n\n--- MES FECHADO ----");
        this.saldo -= this.juros;
        this.juros = 0;
        super.setDepositos(0);
        super.setSaques(0);
    }

    @Override
    public void demonstrativo() {
        System.out.println("\n\n---- CONTA CORRENTE ----");
        super.print();
        System.out.print( "\nLimiteCheque=  " + this.limiteCheque + "\nJuros=  " + this.juros + "\nDepositos=  " + this.depositos + "\nSaques=  " + this.saques);

    }
    
}
