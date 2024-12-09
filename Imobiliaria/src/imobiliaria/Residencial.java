package imobiliaria;

public class Residencial extends Imovel {
    private int qtdQuartos;
    private int numVagas;

    public Residencial(int qtdQuartos, int numVagas, int cod, String endereco, int cep, String nomeProprietario) {
        super(cod, endereco, cep, nomeProprietario);
        this.qtdQuartos = 0;
        this.numVagas = 0;
    }

}
