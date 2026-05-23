package StreamsILambda.Exercicio01;

import java.util.Arrays;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0,5,10,15,20,25,30,35,40);

        numeros.stream()
                .filter(n -> n > 10)
                .forEach(System.out::println);
    }
}
