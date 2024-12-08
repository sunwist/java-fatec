package autopecas;

public class ArrayLotado extends RuntimeException {
    private String erro;
    private int capacidade;

    public ArrayLotado(String erro) {
        super(erro);
        this.erro = erro;
    }
    
    public ArrayLotado(String erro, int capacidade){
        super(erro);
        this.erro = erro;
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return erro + "\tCapacidade maxima do array: " + capacidade;
    }
    
}
