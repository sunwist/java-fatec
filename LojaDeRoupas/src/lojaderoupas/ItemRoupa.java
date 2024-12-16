package lojaderoupas;

public class ItemRoupa implements ItemEstoqueInt {
    private String descricao;
    private int tamanho;
    private float preco;
    private int qtdEstoque;

    public ItemRoupa(String descricao, int tamanho, float preco) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preco = preco;
        this.qtdEstoque = 0;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
   
    @Override
    public void incUnits(int qtd) {
        this.qtdEstoque += qtd;
    }

    @Override
    public void decUnits(int qtd) {
        this.qtdEstoque -= qtd;
    }

    @Override
    public int getUnits() {
        return this.qtdEstoque;
    }

    @Override
    public float getPrice() {
        return this.preco;
    }

    @Override
    public void print() {
        System.out.print("\nDescricao= " + this.descricao + "\t Tamanho= " + this.tamanho + "\t Preco= " + this.preco + "\t Quantidade em Estoque: " + this.qtdEstoque);
    }
    
    
}
