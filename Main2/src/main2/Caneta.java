package main2;

public class Caneta {

    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampa;

    public Caneta(String m, String c, float p) { //este é o metodo construtor
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.cor = "Azul";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampa() {
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void tampar() {
        this.tampa = true;
    }

    public void destampar() {
        this.tampa = false;
    }

    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampa);
    }

}
