package lojaderoupas;

public class Estoque{
    private ItemEstoqueInt lista[];
    private int count;

    public Estoque(int tam) {
        lista = new ItemEstoqueInt[tam];
        this.count = 0;
    }
    
    public int add(ItemEstoqueInt item){
        if(count >= lista.length) return -1;
        lista[count] = item;
        count++;
        return count-1;
    }
    
    public boolean incUnits(int index, int qtd){
        if(count >= lista.length) return false;
        lista[index].incUnits(qtd);
        return true;
    }
    
    public boolean decUnits(int index, int qtd){
        if(count >= lista.length) return false;
        lista[index].incUnits(qtd);
        return true;
    }
    
    public void listAll(){
        double total = 0;
        for (int i = 0; i < count; i++) {
            lista[i].print();
            total += lista[i].getPrice() * lista[i].getUnits();
        }
        System.out.printf("\nValor Total no Estoque: %.2f", total);
    }
    
    
    
}
