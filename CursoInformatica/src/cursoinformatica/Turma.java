package cursoinformatica;

public class Turma implements Interface {
    private String nomeCurso;
    private int qtdAulas;
    private Aluno alunos[];
    private int cont;

    public Turma(String nomeCurso, int qtdAulas) {
        this.nomeCurso = nomeCurso;
        this.qtdAulas = qtdAulas;
        alunos = new Aluno[20];
        cont = 0;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getQtdAulas() {
        return qtdAulas;
    }

    public void setQtdAulas(int qtdAulas) {
        this.qtdAulas = qtdAulas;
    }

    @Override
    public void matricularAluno(Aluno al) throws Exception {
        if(cont >= alunos.length) throw new LimiteAlunos();
        
        for (int i = 0; i < cont; i++) {
            if(alunos[i].getCodigo() == al.getCodigo()){
                throw new CodigoExistente();
            }
        }
        
        alunos[cont] = al;
        cont++;
    }

    @Override
    public int buscarAluno(int cod) {
        for (int i = 0; i < cont; i++) {
           if(alunos[i].getCodigo() == cod){
               return i;
           }
        }
        return -1;
    }

    @Override
    public void registrarFalta(int cod) throws Exception{
        int falta = 0;
        for (int i = 0; i < cont; i++) {
            if(alunos[i].getCodigo() == cod){
                falta = alunos[i].getQtdFaltas();
                falta++;
                alunos[i].setQtdFaltas(falta);
                return;
            }
        }
        throw new CodigoNaoExistente();
    }

    @Override
    public void atribuirMedia(int cod, double media) throws Exception{
        if(media >= 0 && media <= 10){
            for (int i = 0; i < cont; i++) {
                if(alunos[i].getCodigo() == cod){
                    alunos[i].setMedia(media);
                    return;
                }
            }
        }
        throw new CodigoNaoExistente();
        
    }

    @Override
    public void listarTodos() {
        double freq = 0;
        System.out.print("\n\n---- ALUNOS");
        for (int i = 0; i < cont; i++) {
            freq = ((qtdAulas - alunos[i].getQtdFaltas()) * 100) / qtdAulas;
            alunos[i].setFrequencia(freq);
            alunos[i].print();
        }
    }
    
    @Override
    public void listarAprovados(){
        System.out.print("\n\n" + this.nomeCurso + "\n\n---- APROVADOS");
        for (int i = 0; i < cont; i++) {
            if(alunos[i].getMedia() >= 6.0 && alunos[i].getFrequencia() >= 75.0){
                alunos[i].print();
            }
        }
        
    }
    
    
}
