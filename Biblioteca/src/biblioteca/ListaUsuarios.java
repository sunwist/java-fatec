package biblioteca;

public class ListaUsuarios implements Control {
    private Usuario usuarios[];
    private int cont;

    public ListaUsuarios(int capacidade) {
        usuarios = new Usuario[capacidade];
        this.cont = 0;
    }

    @Override
    public int buscar(int cod) {
        for (int i = 0; i < cont; i++) {
            if(usuarios[i].getCod() == cod){
                System.out.println("ENCONTRADO");
                return i;
            }
        }
        return -1;
    }

    @Override
    public void cadastrar(Usuario us) {
        //if(cont >= usuarios.length) return throw new ListaLotada();
        for (int i = 0; i < cont; i++) {
            if(usuarios[i].getCod() == us.getCod()){
                //throw new CodigoExistente();
                return;
            }
        }
        
        System.out.println("USUARIO CADASTRADO");
        usuarios[cont] = us;
        cont++;
    }

    @Override
    public void retirar(int cod) {
        for (int i = 0; i < cont; i++) {
            
            if(usuarios[i].getCod() == cod){
                 if(usuarios[i].isRetirada() == false){
                     // throw new RetiradaImpedida();
                 }
            }
        }
    }

    @Override
    public void devolver(int cod, boolean emAtraso) {
        for (int i = 0; i < cont; i++) {
            if(usuarios[i].getCod() == cod){
                if(emAtraso){
                    usuarios[i].incAtrasos();
                }
                
                if(usuarios[i] instanceof Aluno){
                    if(usuarios[i].getContAtrasos() > 3){
                        usuarios[i].setRetirada(false);
                        return;
                    }
                }

                if(usuarios[i] instanceof NaoAluno){
                    if(usuarios[i].getContAtrasos() > 5){
                        usuarios[i].setRetirada(false);
                        return;
                    }
                }
            }else{
                // throw new CodigoNaoExistente();
            }
        }
    }

    @Override
    public void liberar(int cod) {
        for (int i = 0; i < cont; i++) {
            if(usuarios[i].getCod() == cod){
               System.out.println("\nLIBERADO\n");
               usuarios[i].setRetirada(true);
            }else{
                // throw new CodigoNaoExistente();
            }
        }
    }

    @Override
    public void listarAlunos() {
        for (int i = 0; i < cont; i++) {
            if(usuarios[i] instanceof Aluno){
                usuarios[i].print();
            }
        }
    }

    @Override
    public void listarUsuarios() {
        for (int i = 0; i < cont; i++) {
            usuarios[i].print();
        }
    }
    
    
    
}
