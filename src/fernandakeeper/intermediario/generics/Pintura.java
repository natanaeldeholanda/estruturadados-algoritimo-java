package fernandakeeper.intermediario.generics;

public class Pintura<E extends Pintavel> {
    private E coisasQueVouPintar;
    private String tipo;
    private String marca;
    private double preco;

    public Pintura(E coisasQueVouPintar, String tipo, String marca, double preco) {
        this.coisasQueVouPintar = coisasQueVouPintar;
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
    }

    public E getCoisasQueVouPintar() {
        return coisasQueVouPintar;
    }

    public void setCoisasQueVouPintar(E coisasQueVouPintar) {
        this.coisasQueVouPintar = coisasQueVouPintar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void pintar(){
        this.coisasQueVouPintar.aplicarTinta("Verde" + this.tipo + " " + this.marca + " no valor de R$" + this.preco);
    }
}
