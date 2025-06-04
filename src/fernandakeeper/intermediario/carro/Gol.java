package fernandakeeper.intermediario.carro;

public class Gol {
    Carro carro;
    public Gol(String modelo, String cor, int ano, String placa) {
        this.carro = new Carro(modelo, cor, ano, placa);
        this.carro.teste();
    }
}
