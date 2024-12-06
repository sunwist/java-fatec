package tecelagem;

public class TecelagemTest {
    
    public static void main(String[] args) {
        
        ListaFunc funcionarios = new ListaFunc(3);
        
        Funcionario p1 = new Producao(1, "Rogerio", "333", 12.5);
        
        if (p1 instanceof Producao) {
            ((Producao) p1).registrarHorasDiurnas(80);  
            ((Producao) p1).registrarHorasNoturnas(80);  
        }

        Funcionario p2 = new Administracao(2, "Livia", "222", 2300.0);
        
        p2.hollerith();
        
        Funcionario p3 = new Vendedores(3, "Lucas", "444", 5000.0);
        
        p3.hollerith();

        funcionarios.addFunc(p1);
        funcionarios.addFunc(p2);
        funcionarios.addFunc(p3);
        
        funcionarios.ListagemProd();
        funcionarios.ListagemAdm();
        funcionarios.ListagemVendas();
        
        
        // metodo retorna valor double armazenado em variavel
        double salario1 = funcionarios.salarioLiquido(1);
        System.out.print("\n\nSalario Liquido do ");
        funcionarios.getFunc(1);
        System.out.print(salario1 + "\n\n");
        
        double salario2 = funcionarios.salarioLiquido(2);
        System.out.println(salario2);
        
        double salario3 = funcionarios.salarioLiquido(3);
        System.out.println(salario3);
    }
    
   
}
