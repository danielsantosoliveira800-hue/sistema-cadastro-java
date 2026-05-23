package HashMap.exercicio02;

import java.util.HashMap;

public class Teste {
    public static void main(String[] args) {

        HashMap<String, Integer> pessoas = new HashMap<>();
            pessoas.put("Daniel", 21);
            pessoas.put("Julia", 22);
            pessoas.put("Bia", 21);
            pessoas.put("Hugo", 21);

        Lista lista1 = new Lista(pessoas);
        lista1.apresenta();
    }
}
