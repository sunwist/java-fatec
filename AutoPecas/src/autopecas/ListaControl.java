package autopecas;

public interface ListaControl {
    int adicionarPeça(Peca pc) throws Exception;
    boolean retirarUnidades(int index, int quantidade);
    boolean acrescentarUnidades(int index, int quantidade);
    boolean imprimirPeca(int index);
    void relatorioGeral();
    void relatorioReposição(int QtdMinima);

}
