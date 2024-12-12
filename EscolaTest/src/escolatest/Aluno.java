package escolatest;

public class Aluno extends Escola {
    private String ra;
    private String turno;
    private String status;
    
    public Aluno(){
        ra = "";
        turno = "";
        status = "ativo";
    }

    public Aluno(String ra, String turno, String status, String nome, String rg) {
        super(nome, rg);
        this.ra = ra;
        this.turno = turno;
        this.status = status;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void trancar(){
        if("ativo".equalsIgnoreCase(status)){
            status = "suspenso";
            System.out.println("\nAluno suspenso!");
        }else{
            System.out.println("\nEste aluno não esta ativo, portanto nao pode ser suspenso");
        }
    }
    
    public void destrancar(){
        if("suspenso".equalsIgnoreCase(status)){
            status = "ativo";
            System.out.println("\nAluno ativo!");
        }else{
            System.out.println("\nEste aluno nao esta suspenso, portanto nao pode voltar a ficar ativo");
        }
    }
    
    public void formar(){
        if("ativo".equalsIgnoreCase(status)){
            status = "egresso";
            System.out.println("\nAluno formado!");
        }else{
            System.out.println("\nEste aluno nao esta ativo, portanto nao pode ficar como egresso.");
        }
    }
    
    public void desistir(){
        if("ativo".equalsIgnoreCase(status) || "suspenso".equalsIgnoreCase(status)){
            status = "desistente";
            System.out.println("\nAluno desistente!");
        }else{
            System.out.println("\nEste aluno nao ativo ou suspenso, portanto nao pode ficar como desistente.");
                   
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RA = " + ra + "\nTurno = " + turno + "\nStatus = " + status);
    }
}
