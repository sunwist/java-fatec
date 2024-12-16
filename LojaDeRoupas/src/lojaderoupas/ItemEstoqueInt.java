package lojaderoupas;

public interface ItemEstoqueInt {
    void incUnits(int qtd);
    void decUnits(int qtd);
    int getUnits();
    float getPrice();
    void print();
}