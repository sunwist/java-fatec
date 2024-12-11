package cursoinformatica;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CursoInformatica {

    public static void main(String[] args) throws Exception {
        Aluno jenni = new Aluno(1, "Jennifer Rocha");
        Aluno amanda = new Aluno(2, "Amanda Errera");
        Aluno kayky = new Aluno(3, "Kayky Medrado");
        Aluno ana = new Aluno(3, "Ana Caroline Bugatto");
        
        Turma ads = new Turma("ANALISE E DESENVOLVIMENTO DE SISTEMAS", 40);
        
        try{
            ads.matricularAluno(jenni);
            ads.matricularAluno(amanda);
            ads.matricularAluno(kayky);
            ads.matricularAluno(ana);
        }catch(LimiteAlunos e){
        }catch(CodigoExistente e){
            System.out.print("\n\nErro: " + e);
        }
        
        ads.buscarAluno(2);
        
        try{
            ads.registrarFalta(1);
            ads.registrarFalta(1);
            ads.registrarFalta(1);
            ads.registrarFalta(1);
            ads.registrarFalta(1);
            ads.registrarFalta(2);
        }catch(CodigoNaoExistente e){
            System.out.print("\n\nErro: " + e);
        }
 
        ads.listarTodos();
        
        try{
            ads.atribuirMedia(1, 7.8);
            ads.atribuirMedia(2, 8.8);
            ads.atribuirMedia(3, 4.5);
            ads.atribuirMedia(4, 9.7);
        }catch(CodigoNaoExistente e){
            System.out.print("\n\nErro: " + e);
        }
        
        ads.listarAprovados();
    }
    
}
