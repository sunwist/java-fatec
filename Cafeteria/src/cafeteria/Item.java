package cafeteria;

public class Item implements ItemEstoque {
    private String nome;
    private String tipo;
    private double volume;
    private float preco;
    private int qtdEstoque;

    public Item(String nome, String tipo, double volume, float preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.volume = volume;
        this.preco = preco;
        this.qtdEstoque = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
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
        return qtdEstoque;
    }

    @Override
    public float getPrice() {
        return this.preco;
    }

    @Override
    public void print() {
        System.out.println("Item{" + "nome=" + nome + ", tipo=" + tipo + ", volume=" + volume + "ml , preco=" + preco + ", qtdEstoque=" + qtdEstoque);
    }
    
    
}
