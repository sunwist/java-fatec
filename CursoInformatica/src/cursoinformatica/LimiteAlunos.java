package cursoinformatica;

public class LimiteAlunos extends RuntimeException {
    private String msg = "A turma atingiu seu limite de alunos";

    public LimiteAlunos() {
    }

    @Override
    public String toString() {
        return msg;
    }
   
}
