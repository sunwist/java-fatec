package autopecas;

public class Peca {
    private int codido;
    private String descricao;
    private int qtd;
    private double peso;

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public int getCodido() {
        return codido;
    }

    public void setCodido(int codido) {
        this.codido = codido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Peca(int codido, String descricao, double peso) {
        this.codido = codido;
        this.descricao = descricao;
        this.peso = peso;
        qtd = 0;
    }
    
    public void acrescentar(int qtd){
        this.qtd += qtd;
    }
    
    public boolean retirar(int qtd){
        if(this.qtd >= qtd){
            this.qtd -= qtd;
            return true;
        }
        return false;
    }

    public void print() {
        System.out.print("\n\nPeca{" + "codido=" + codido + ", descricao=" + descricao + ", qtd=" + qtd + ", peso=" + peso);
    }
    
}
