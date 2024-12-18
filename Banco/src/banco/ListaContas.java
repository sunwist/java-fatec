package banco;

public class ListaContas {
    private ContaBancaria contas[];
    private int cont;

    public ListaContas(int capMax) {
        contas = new ContaBancaria[capMax];
        cont = 0;
    }
    
    public int add(ContaBancaria c){
        if(cont >= contas.length) return -1;
        contas[cont] = c;
        cont++;
        System.out.println("CONTA ADICIONADA");
        return cont-1;
    }
    
    public void relatorio(){
        System.out.print("\n\n ---- RELATORIO DE CONTAS -----");
        for (int i = 0; i < cont; i++) {
            System.out.printf("\n\nCONTA %d", i + 1);
            contas[i].print();
        }
    }
    
}
