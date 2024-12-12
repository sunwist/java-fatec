package escolatest;

public abstract class Escola {
    private String nome;
    private String rg;
    
    public Escola(){
        nome = "";
        rg = "";
    }

    public Escola(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
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
    
    public void mostrar() {
        System.out.println("\n\nNome = " + nome + "\nRG = " + rg);
    }
    
}
