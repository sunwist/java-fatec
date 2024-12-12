package escolatest;

public class Professor extends Funcionario {
    private String areaAtuacao;
    
    public Professor(){
        areaAtuacao = "";
    }

    public Professor(String areaAtuacao, double salarioHora, int qtdHoras, String nome, String rg) {
        super(salarioHora, qtdHoras, nome, rg);
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Area de atuacao = " + areaAtuacao);
    }
    
    
    
}
