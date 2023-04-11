package main;

class Main {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bluepen pen";
        c1.cor = "azul";
        // c1.ponta = 0.5f;
        c1.carga = 90;
        c1.tampar();

        c1.status(); 

    }
}
