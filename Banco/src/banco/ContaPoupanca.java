package banco;

public class ContaPoupanca extends ContaBancaria implements Control {
    private double rendimento;
    
    public ContaPoupanca(String CPF, double saldo) {
        super(CPF, saldo);
        this.rendimento = 0;
    }

    @Override
    public boolean sacar(double valor) {
        if( valor <= this.saldo){
            this.saldo -= valor;
            this.saques += valor;
            return true;
        }
        return false;
    }

    @Override
    public void atualizar(double taxa) {
        this.rendimento += this.saldo * (taxa / 100);
    }

    @Override
    public void fecharMes() {
        System.out.print("\n\n--- MES FECHADO ----");
        this.saldo += rendimento;
        this.rendimento = 0;
        super.setDepositos(0);
        super.setSaques(0);
    }

    @Override
    public void demonstrativo() {
        System.out.println("\n\n---- CONTA POUPANCA ----");
        super.print();
        System.out.print( "\nRendimento=  " + this.rendimento + "\nDepositos=  " + super.getDepositos() + "\nSaques=  " + super.getSaques());
    }
    
}
