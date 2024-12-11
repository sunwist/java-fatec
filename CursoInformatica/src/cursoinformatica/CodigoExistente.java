package cursoinformatica;

public class CodigoExistente extends Exception {
    private String msg = "Esse codigo ja existe, insira outro codigo para matricular o aluno";
    
    public CodigoExistente() {
    }
    
    @Override
    public String toString(){
        return msg;
    }
    
}
