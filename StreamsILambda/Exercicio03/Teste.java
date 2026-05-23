package StreamsILambda.Exercicio03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {
   public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(2,4,5,7,8,9,10,15,16);

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        pares.forEach(System.out::println);
    int soma = pares.stream()
            .mapToInt(n -> n)
            .sum();

        System.out.println("soma dos pares: "+ soma);
    }
}
