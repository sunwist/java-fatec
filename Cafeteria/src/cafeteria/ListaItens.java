package cafeteria;

public class ListaItens {
    private Item lista[];
    private int cont;

    public ListaItens(int capacidade) {
        lista = new Item[capacidade];
        cont = 0;
    }
    
    public int add(ItemEstoque item){
        if(cont >= lista.length) return -1;
        lista[cont] = (Item) item;
        cont++;
        return cont-1;
    }
    
    public boolean incUnits(int index, int qtd){
        for (int i = 0; i < cont; i++) {
            lista[index].incUnits(qtd);
            return true;
        }
        return false;
    }
    
    public boolean decUnits(int index, int qtd){
        for (int i = 0; i < cont; i++) {
            lista[index].decUnits(qtd);
            return true;
        }
        return false;
    }
    
    public void listAll(){
        float total = 0;
        for (int i = 0; i < cont; i++) {
            lista[i].print();
            total += lista[i].getPrice() * lista[i].getUnits();
        }
        System.out.print("\nValor Total em Estoque= " + total);
    }
    
    
    
}
