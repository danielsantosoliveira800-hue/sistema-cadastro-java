package StreamsILambda.Exercicio02;

import java.util.Arrays;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Daniel", "Hugo", "Juan", "Everton", "Sandro");

        nomes.stream()
                .map( n -> n.toUpperCase())
                .forEach(System.out::println);
    }
}
