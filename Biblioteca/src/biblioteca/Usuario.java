package biblioteca;

public abstract class Usuario {
    private int cod;
    private String nome;
    private String email;
    private int contAtrasos;
    private boolean retirada;

    public Usuario(int cod, String nome, String email) {
        this.cod = cod;
        this.nome = nome;
        this.email = email;
        this.contAtrasos = 0;
        this.retirada = true;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContAtrasos() {
        return contAtrasos;
    }
    
    public void incAtrasos(){
        this.contAtrasos++;
    }

    public boolean isRetirada() {
        return retirada;
    }

    public void setRetirada(boolean retirada) {
        this.retirada = retirada;
    }

    public void print() {
        System.out.print("\nCod= "  + this.cod + "\nNome= " + this.nome + "\nEmail= " + this.email + "\nAtrasos= " + this.contAtrasos + "\nPermitido retirar livros= " + (isRetirada() ? "Sim" : "Nao"));
        
    }
    
    
}
