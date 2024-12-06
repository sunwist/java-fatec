package tecelagem;

public class ListaFunc {
    public Funcionario[] funcionarios;
    public int count;

    public ListaFunc(int tamanho) {
        this.funcionarios = new Funcionario[tamanho];
        this.count = 0;
    }

    public boolean addFunc(Funcionario f) {
        // primeiro verifica se os codigos nao sao iguais
        for (int i = 0; i < count; i++) {
            if (funcionarios[i].getCod() == f.getCod()) {
                System.out.println("\nEsse codigo ja existe!");
                return false;
            }
        }

        if (count < funcionarios.length) {

            funcionarios[count] = f;
            count++;
            System.out.println("\nFuncionario adicionado com sucesso!");
            return true;
        }

        return false;
    }

    public Funcionario getFunc(int cod) {
        // retorna o funcionario com o codigo indicado
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i].getCod() == cod) {
                System.out.println("\nFuncionario " + funcionarios[i].getNome() + "\nCodigo: " + cod);
            }
        }
        // null se nao existe
        return null;
    }

    public double salarioLiquido(int cod) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null && funcionarios[i].getCod() == cod) {
                return funcionarios[i].salarioLiquido();
            }
        }
        return -1;
    }

    public void ListagemVendas() {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] instanceof Vendedores) {
                Vendedores vend = (Vendedores) funcionarios[i];
                System.out.println("\nFuncionarios do Setor Vendas: " + vend.getNome());
            }
        }
    }

    public void ListagemProd() {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] instanceof Producao) {
                Producao prod = (Producao) funcionarios[i];
                System.out.println("\nFuncionarios do Setor Producao: " + prod.getNome());
            }
        }
    }

    public void ListagemAdm() {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] instanceof Administracao) {
                Administracao adm = (Administracao) funcionarios[i];
                System.out.println("\nFuncionarios do Setor Administracao: " + adm.getNome());
            }
        }
    }

}
