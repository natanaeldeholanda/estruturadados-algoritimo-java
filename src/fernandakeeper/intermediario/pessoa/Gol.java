package fernandakeeper.intermediario.pessoa;

import fernandakeeper.intermediario.carro.Carro;

public class Gol extends Pessoa {
    public Gol(String modelo, String cor, int ano, String placa) {
        super(new Carro(modelo, cor, ano, placa));
        this.carro.teste();
    }


    public void ligar() {
        System.out.println("Gol " + carro.modelo + " está ligado.");
    }

    public void desligar() {
        System.out.println("Gol " + carro.modelo + " está desligado.");
    }
}
