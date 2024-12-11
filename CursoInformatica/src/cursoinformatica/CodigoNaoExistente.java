package cursoinformatica;

public class CodigoNaoExistente extends Exception {
    private String msg = "Codigo nao existente, nao e possivel encontrar o aluno";
    
    public CodigoNaoExistente() {
    }

    @Override
    public String toString() {
        return msg;
    }
}
