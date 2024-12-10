package cafeteria;

public class Cafeteria {

    public static void main(String[] args) {
        
       Item cafe1 = new Item("Expresso", "Bebida", 150.0, 10.78f);
       
       Item cafe2 = new Item("Macchiato", "Bebida", 500.0, 23.0f);
       
       ListaItens listaa = new ListaItens(3);
       
       listaa.add(cafe1);
       listaa.add(cafe2);
       
       listaa.incUnits(0, 5);
       listaa.incUnits(1, 25);
       
       listaa.listAll();
       
    }
    
}
