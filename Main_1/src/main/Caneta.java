package main;

public class Caneta {

    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    private boolean tampa;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampa);
    }

    public void rabiscar() {
        if (this.tampa == true) {
            System.out.println("Nao posso rabiscar... Estou tampada...");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    

    protected void tampar() {
        this.tampa = true;
    }

    protected void destampar() {
        this.tampa = false;
    }
}