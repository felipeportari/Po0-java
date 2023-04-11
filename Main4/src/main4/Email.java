package main4;


public class Email {
    private String nome;
    private String sobrenome;
    private int alturaCm;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(int alturaCm) {
        this.alturaCm = alturaCm;
    }
    
    public void emailClass(){
        System.out.println(this.getNome() +"."+this.getSobrenome()+"@gmail.com");
    }
}
