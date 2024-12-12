package escolatest;

public class Funcionario extends Escola {
    protected double salarioHora;
    protected int qtdHoras;
    
    public Funcionario(){
        salarioHora = 0.0;
        qtdHoras = 0;
    }
    
    public Funcionario(double salarioHora, int qtdHoras, String nome, String rg) {
        super(nome, rg);
        this.salarioHora = salarioHora;
        this.qtdHoras = qtdHoras;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Salario por Hora = " + salarioHora + "\nQuantidade de Horas = " + qtdHoras);
    }
    
}
