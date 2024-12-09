package imobiliaria;

public abstract class Imovel {
    private int cod;
    private String endereco;
    private int cep;
    private String nomeProprietario;
    private boolean disponivelAluguel;
    private boolean disponivelVenda;

    public Imovel(int cod, String endereco, int cep, String nomeProprietario) {
        this.cod = cod;
        this.endereco = endereco;
        this.cep = cep;
        this.nomeProprietario = nomeProprietario;
        this.disponivelAluguel = true;
        this.disponivelVenda = true;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public boolean isDisponivelAluguel() {
        return disponivelAluguel;
    }

    public void setDisponivelAluguel(boolean disponivelAluguel) {
        this.disponivelAluguel = disponivelAluguel;
    }
    
    public boolean isDisponivelVenda() {
        return disponivelVenda;
    }

    public void setDisponivelVenda(boolean disponivelVenda) {
        this.disponivelVenda = disponivelVenda;
    }

    public void print() {
        System.out.println("Imovel{" + "cod=" + cod + ", endereco=" + endereco + ", cep=" + cep + ", nomeProprietario=" + nomeProprietario + ", disponivelAluguel=" + disponivelAluguel + ", disponivelVenda=" + disponivelVenda);
    }

    
}
