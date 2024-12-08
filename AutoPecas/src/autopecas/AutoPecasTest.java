package autopecas;

public class AutoPecasTest {
    
    public static void main(String[] args) throws Exception {
        Peca peca0 = new Peca(0, "parafuso", 5);
        Peca peca1 = new Peca(1, "parafuso", 5);
        Peca peca2 = new Peca(2, "parafuso", 5);
        Peca peca3 = new Peca(3, "parafuso", 5);
        
        ListaPecas lista = new ListaPecas(3);
        
        try{
            lista.adicionarPeça(peca0);
            lista.adicionarPeça(peca1);
            lista.adicionarPeça(peca2);
            lista.adicionarPeça(peca3);
        }catch(ArrayLotado e){
            System.out.println(e);
        }
        
        lista.acrescentarUnidades(0, 444);
        lista.acrescentarUnidades(1, 20);
        lista.acrescentarUnidades(2, 40);
        
        lista.relatorioGeral();
        
    }
    
}
