package tecelagem;

public class Vendedores extends Funcionario {
    private double valorVendas;

    public Vendedores(int cod, String nome, String rg, double salarioBase) {
        super(cod, nome, rg, salarioBase);
        valorVendas = 0.0;
    }
    
    public void registrarVenda(double valor){
        this.valorVendas += valor;
    }

    @Override
    public double salarioLiquido() {
        return super.getSalarioBase()+ (this.valorVendas * 0.03);
    }

    @Override
    public void hollerith() {
        System.out.println("\n\nVENDAS");
        super.hollerith();
        System.out.printf("\nValor Total das Vendas= %.2f", this.valorVendas);
        System.out.printf("Comissao: %.2f", (valorVendas * 0.03));
        System.out.printf("\nSalario Liquido= %.2f", salarioLiquido());
    }
    
    @Override
    public void novoMes() {
        this.valorVendas = 0;
    }
    
    
}
