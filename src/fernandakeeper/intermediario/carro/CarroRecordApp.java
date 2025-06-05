package fernandakeeper.intermediario.carro;

public class CarroRecordApp {
    public static void main(String[] args) {
        CarroRecord carro1 = new CarroRecord("Fusca", "azul", 1970, "ABC-1234");
        CarroRecord carro2 = new CarroRecord("Sandeiro", "prata", 2019, "DEF-5A78");
        CarroRecord carro3 = new CarroRecord("Hilux", "preta", 2022, "CBA-4B21");
        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
    }
}
