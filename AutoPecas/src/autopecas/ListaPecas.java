package autopecas;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaPecas implements ListaControl {
    private Peca lista[];
    private int cont;
    private int capMax;
    private int qtdMinima;

    public ListaPecas(int capMax) {
        this.capMax = capMax;
        lista = new Peca[capMax];
        cont = 0;
    }

    @Override
    public int adicionarPeça(Peca pc){
        if(cont >= lista.length) throw new ArrayLotado("O array esta lotado", capMax);
        lista[cont] = pc;
        cont++;
        return cont-1;
    }

    @Override
    public boolean retirarUnidades(int index, int quantidade) {
        if(index >= cont || index < 0) return false;
        lista[index].retirar(quantidade);
        return true;
    }

    @Override
    public boolean acrescentarUnidades(int index, int quantidade) {
        if(index >= cont || index < 0) return false;
        lista[index].acrescentar(quantidade);
        return true;
    }

    @Override
    public boolean imprimirPeca(int index) {
        if(index >= cont || index < 0) return false;
        lista[index].print();
        return true;
    }

    @Override
    public void relatorioGeral() {
        for (int i = 0; i < cont; i++) {
            lista[i].print();
        }
    }

    @Override
    public void relatorioReposição(int QtdMinima) {
        for (int i = 0; i < cont; i++) {
            if(lista[i].getQtd() <= qtdMinima){
                lista[i].print();
            }
        }
    }
    
    
    
}
