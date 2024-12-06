package tecelagem;

public class Administracao extends Funcionario {
    private int faltas;
    private double salarioFixo = super.getSalarioBase();

    public Administracao(int cod, String nome, String rg, double salarioBase) {
        super(cod, nome, rg, salarioBase);
        faltas = 0;
    }
    
    public void registrarFalta(){
        faltas++;
    }
    
    @Override
    public double salarioLiquido() {
        return salarioFixo - ((salarioFixo / 30) * this.faltas);
    }
    
    @Override
    public void hollerith(){
        System.out.println("\n\nADMINISTRACAO");
        super.hollerith();
        System.out.print("\nFaltas= " + this.faltas);
        System.out.printf("\nValor descontado= %.2f ", ((salarioFixo / 30) * this.faltas));
        System.out.printf("\nSalario Liquido= %.2f", salarioLiquido());
    }

    @Override
    public void novoMes() {
        this.faltas = 0;
    }
    
}
