package imobiliaria;

public class Comercial extends Imovel{
    private String tipoImovel;

    public Comercial(String tipoImovel, int cod, String endereco, int cep, String nomeProprietario) {
        super(cod, endereco, cep, nomeProprietario);
        this.tipoImovel = tipoImovel;
    }

}
