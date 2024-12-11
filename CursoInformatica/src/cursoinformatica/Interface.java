package cursoinformatica;

public interface Interface {
    void matricularAluno(Aluno al) throws Exception;
    int buscarAluno(int cod);
    void registrarFalta(int cod) throws Exception;
    void atribuirMedia(int cod, double media) throws Exception;
    void listarTodos();
    void listarAprovados();
}
