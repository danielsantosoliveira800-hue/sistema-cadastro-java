package StreamsILambda.Exercicio04;

import java.util.Arrays;
import java.util.List;

public class Teste {
   public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Daniel",12000.00);
        Funcionario f2 = new Funcionario("Hugo",1220.00);
        Funcionario f3 = new Funcionario("Caique",14060.00);
        Funcionario f4 = new Funcionario("Gabriel",1900.00);

        List<Funcionario> funcionarios = Arrays.asList(f1,f2,f3,f4);

        double media = funcionarios.stream()
                .mapToDouble(Funcionario::getSalario)
                .average()
                .orElse(0);

        System.out.println("Média: "+ media);

        funcionarios.stream()
                .filter(f -> f.getSalario() > media)
                .sorted((a,b) -> Double.compare(b.getSalario(), a.getSalario()))
                .forEach(f -> System.out.println(f.getNome() + "- R$: "+ f.getSalario() ));

    }
}
