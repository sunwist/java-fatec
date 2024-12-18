package banco;

public class Banco {
    public static void main(String[] args) {
        
        ContaCorrente jenni = new ContaCorrente("333", 300.0, 200.0);
        ContaPoupanca lari = new ContaPoupanca("222", 500.0);
        
        ListaContas lista = new ListaContas(20);
        
        lista.add(lari);
        lista.add(jenni);
        
        jenni.depositar(400);
        jenni.demonstrativo();
        jenni.sacar(900.0);
        jenni.demonstrativo();
        jenni.atualizar(4);
        jenni.demonstrativo();
        jenni.fecharMes();
        jenni.demonstrativo();
        
        lari.depositar(500);
        lari.demonstrativo();
        lari.sacar(100.0);
        lari.demonstrativo();
        lari.atualizar(5);
        lari.demonstrativo();
        lari.fecharMes();
        lari.demonstrativo();
        
        lista.relatorio();
        
        
    }
    
}
