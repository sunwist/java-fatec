package banco;

public interface Control {
    public boolean sacar(double valor);
    public void atualizar(double taxa);
    public void fecharMes();
    public void demonstrativo();
}
