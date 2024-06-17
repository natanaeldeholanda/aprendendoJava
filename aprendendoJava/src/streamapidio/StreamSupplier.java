package streamapidio;

/*
Supplier<T>: Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamSupplier {
    public static void main(String[] args) {
        //Usa o Supplier co expressão lambda para fornecer uma saudação personalizada;
        Supplier<String> saudacao = () -> "Olá, seja bem vindo!";
        //Usar o Supplier para obter uma lista com 5 saudações;

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo(a)!").limit(5).toList();
        //Imprimir as saudacoes geradas
        listaSaudacoes.forEach(System.out::println);
    }
}
