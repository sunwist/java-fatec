package biblioteca;

public class NaoAluno extends Usuario {
    private String rg;
    private String telefone;

    public NaoAluno(String rg, String telefone, int cod, String nome, String email) {
        super(cod, nome, email);
        this.rg = rg;
        this.telefone = telefone;
    }
    

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public void print(){
        System.out.print("\n\n---- NAO ALUNO ---- \n\nRG= " + this.rg + "\nTelefone= " + this.telefone);   
        super.print();
    }
    
}
