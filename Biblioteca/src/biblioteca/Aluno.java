package biblioteca;

public class Aluno extends Usuario {
    private String RA;

    public Aluno(String RA, int cod, String nome, String email) {
        super(cod, nome, email);
        this.RA = RA;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }
    
    @Override
    public void print(){
        System.out.print("\n\n---- ALUNO ----\n\nRA= " + this.RA);
        super.print();
    }
    
    
    
    
}
