package biblioteca;

public interface Control {
    int buscar(int cod);
    void cadastrar(Usuario us);
    void retirar(int cod);
    void devolver(int cod, boolean emAtraso);
    void liberar(int cod);
    void listarAlunos();
    void listarUsuarios();
}
