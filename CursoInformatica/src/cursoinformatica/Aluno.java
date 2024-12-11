package cursoinformatica;

public class Aluno {
    private int codigo;
    private String nome;
    private double mediaFinal;
    private int qtdFaltas;
    private double frequencia;

    public Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        mediaFinal = 0.0;
        qtdFaltas = 0;
        frequencia = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return mediaFinal;
    }

    public void setMedia(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public int getQtdFaltas() {
        return qtdFaltas;
    }

    public void setQtdFaltas(int qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
    
    public void print(){
        System.out.print("\n\nAluno{" + "codigo=" + codigo + ", nome=" + nome + ", mediaFinal=" + mediaFinal + ", qtdFaltas=" + qtdFaltas + ", frequencia= " + frequencia);
    }
    
}
