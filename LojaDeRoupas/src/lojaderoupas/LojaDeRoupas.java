package lojaderoupas;

public class LojaDeRoupas {

    public static void main(String[] args) {
        
        ItemRoupa peca1 = new ItemRoupa("Blusa", 10, 25.6f);
        ItemRoupa peca2 = new ItemRoupa("Short", 10, 20.0f);
        Estoque est = new Estoque(50);
        
        est.add(peca1);
        est.add(peca2);
        
        est.incUnits(0, 20);
        est.incUnits(1, 20);
        
        est.listAll();
    }
    
}
