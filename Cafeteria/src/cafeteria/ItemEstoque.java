package cafeteria;

public interface ItemEstoque {
    void incUnits(int qtd);
    void decUnits(int qtd);
    int getUnits();
    float getPrice();
    void print();
}
