package fernandakeeper.intermediario.streamsapi;

import fernandakeeper.intermediario.carro.CarroRecord;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIApp {
    public static void main(String[] args) {
        //Realizar operações com Stream API, sendo funcionais nas colections (estrutura de dados)
        // filter, map, reduce, collect, forEach, sorted, distinct, limit, skip, anyMatch, allMatch, noneMatch, findFirst, findAny
        // filter -> filtra os elementos de uma coleção com base em uma condição
        // map -> transforma os elementos de uma coleção em outra forma
        // reduce -> reduz os elementos de uma coleção a um único valor
        // collect -> coleta os elementos de uma coleção em uma nova coleção
        // forEach -> executa uma ação para cada elemento de uma coleção
        // sorted -> ordena os elementos de uma coleção
        // distinct -> remove os elementos duplicados de uma coleção
        // limit -> limita o número de elementos de uma coleção
        // skip -> pula os primeiros elementos de uma coleção
        // anyMatch -> verifica se algum elemento de uma coleção atende a uma condição
        // allMatch -> verifica se todos os elementos de uma coleção atendem a uma condição
        // noneMatch -> verifica se nenhum elemento de uma coleção atende a uma condição
        // findFirst -> encontra o primeiro elemento de uma coleção que atende a uma condição
        // findAny -> encontra qualquer elemento de uma coleção que atende a uma condição
        List<CarroRecord> carros = new ArrayList<>();
        carros.add(new CarroRecord("Gol", "azul", 1994, "ABC-1234"));
        carros.add(new CarroRecord("HB20", "prata", 2025, "CBA-6A90"));
        carros.add(new CarroRecord("Virtus", "Branco", 2024, "DEF-5B76"));
        //Exemplo de uso do filter e map: Peguei  o filter para filtrar todos os carros que são do ano maior que 1995
        // e exibir o modelo e a cor de cada carro, utilizando o map para transformar o objeto CarroRecord em uma String formatada.
        carros.stream().filter(modelo -> modelo.ano() > 1995)
                .map(carro -> carro.modelo() + " - " + carro.cor())
                .forEach(System.out::println);
    }
}
