package fernandakeeper.intermediario.carro;

public class Carro {
    public String modelo;
    public String cor;
    public int ano;
    public String placa;

    public Carro(String modelo, String cor, int ano, String placa) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
    }

    public void teste(){
        System.out.println("Testando carro " + modelo);
    }

    public void ligar() {
        System.out.println("Carro " + modelo + " está ligado.");
    }
    public void desligar() {
        System.out.println("Carro " + modelo + " está desligado.");
    }
}
