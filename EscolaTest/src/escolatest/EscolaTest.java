package escolatest;

public class EscolaTest {
    public static void main(String[] args) {
        
        Aluno jennifer = new Aluno("0040482312018", "Diurno", "Ativo", "Jennifer de Oliveira Rocha", "2222");
        
        jennifer.trancar();
        jennifer.destrancar();
        jennifer.trancar();
        jennifer.formar();
        jennifer.desistir();
        jennifer.mostrar();
        
        Funcionario roberta = new Funcionario(45.5, 50, "Roberta Martins", "333");
        
        roberta.mostrar();
        
        Professor vagner = new Professor("Exatas", 43.39, 76, "Vagner Siqueira", "444");
        
        vagner.mostrar();
        
    }
    
}
