package tecelagem;

public class Producao extends Funcionario {
    private int noturno;
    private int diurno;
    
    public Producao(int cod, String nome, String rg, double salarioBase) {
        super(cod, nome, rg, salarioBase);
        this.noturno = 0;
        this.diurno = 0;
    }
    
    public void registrarHorasDiurnas(int horas) {
        this.diurno += horas;
    }                                                                                                                                                                                                                                                                                                                                                                                         
    
    public void registrarHorasNoturnas(int horas) {
        this.noturno += horas;
    }

    @Override
    public double salarioLiquido() {
        double salarioDiurno = super.getSalarioBase() * this.diurno;
        double salarioNoturno = super.getSalarioBase() * this.noturno * 1.3; // Acrescimo de 30% para horas noturnas
        return salarioDiurno + salarioNoturno;
    }
    
    @Override
    public void hollerith() {
        System.out.println("\n\nPRODUCAO");
        super.hollerith();
        System.out.print("\nHoras Diurnas: " + this.diurno + "\nHoras Noturnas: " + this.noturno);
        System.out.printf("Salário Líquido: %.2f", salarioLiquido());
    }
    
    @Override
    public void novoMes() {
        this.diurno = 0;
        this.noturno = 0;
    }
}
