package fernandakeeper.intermediario.carro;

public record CarroRecord (String modelo, String cor, int ano, String placa) {
    // Não precisa declarar os campos, pois são automaticamente criados pelo record
    // Não precisa de construtor, pois o record já gera um construtor com os parâmetros
    // Não precisa de métodos getters, pois o record já gera métodos para acessar os campos
    // Não precisa de métodos setters, pois os campos são imutáveis por padrão
    // São usados nos DTOs (Data Transfer Objects) para transferir dados entre camadas da aplicação, porém DTO podem ser classes também.
}
