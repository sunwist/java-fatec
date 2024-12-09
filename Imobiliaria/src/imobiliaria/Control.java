package imobiliaria;

public interface Control {
    void cadastrarImovel(Imovel imv);
    void alugarImovel(int codigo, String corretor);
    void venderImovel(int codigo, String corretor);
    void listarImoveis(String titulo, boolean apenasDisponiveis, boolean residenciais);
}
