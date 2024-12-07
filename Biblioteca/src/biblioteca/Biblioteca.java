package biblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        Usuario user1 = new Aluno("432432", 1, "jenni", "hdksahda");
        Usuario user2 = new NaoAluno("432432", "231322132", 2, "jenni", "hdksahda");
        
        ListaUsuarios lista = new ListaUsuarios(10);
        
        lista.cadastrar(user1);
        lista.cadastrar(user2);
        
        lista.buscar(1);
        
        lista.retirar(1);
        lista.devolver(1, true); 
        lista.devolver(1, true);
        lista.devolver(1, true);
        lista.devolver(1, true);
        lista.listarAlunos();
        lista.liberar(1);
        
        
        lista.listarAlunos();
        
    }
    
}
