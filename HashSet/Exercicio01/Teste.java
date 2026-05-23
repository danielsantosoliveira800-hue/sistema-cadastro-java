package HashSet.Exercicio01;

import java.util.HashSet;

public class Teste {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Daniel");
        nomes.add("Hugo");
        nomes.add("Patrycia");
        nomes.add("Daniel");
        nomes.add("Hugo");

        Lista lista1 = new Lista(nomes);
        lista1.apresenta();
    }
}