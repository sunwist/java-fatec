package tecelagem;

public abstract class Funcionario {
    private int cod;
    private String nome, rg;
    private double salarioBase;

    public Funcionario(int cod, String nome, String rg, double salarioBase) {
        this.cod = cod;
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
        
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public abstract double salarioLiquido();

    public void hollerith() {
        System.out.print("\nNome= " + this.nome + "\nRG= " + this.rg + "\nSalario Base=" + this.salarioBase);
    }
    
    public abstract void novoMes();
}
