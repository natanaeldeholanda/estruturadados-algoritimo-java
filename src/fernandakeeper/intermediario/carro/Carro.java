package fernandakeeper.intermediario.carro;

import fernandakeeper.intermediario.generics.Pintavel;

public class Carro implements Pintavel {
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

    @Override
    public void aplicarTinta(String cor) {

    }

    @Override
    public String getCor() {
        return "";
    }

    @Override
    public void setCor(String cor) {

    }

    @Override
    public String getTipo() {
        return "";
    }

    @Override
    public void setTipo(String tipo) {

    }

    @Override
    public String getMarca() {
        return "";
    }

    @Override
    public void setMarca(String marca) {

    }

    @Override
    public double getPreco() {
        return 0;
    }

    @Override
    public void setPreco(double preco) {

    }
}
