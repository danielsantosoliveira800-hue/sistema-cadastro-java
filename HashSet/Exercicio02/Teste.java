package HashSet.Exercicio02;

import java.util.HashMap;
import java.util.HashSet;

public class Teste {
    public static void main(String[] args){
        HashSet<String> grupo1 = new HashSet<>();
        HashSet<String> grupo2 = new HashSet<>();

        grupo1.add("danielsantos@gmail.com");
        grupo1.add("hugoleite@gmail.com");
        grupo1.add("patryciaazevedo@gmail.com");
        grupo1.add("celinaoliveira@gmail.com");

        grupo2.add("danielsantos@gmail.com");
        grupo2.add("patryciaazevedo@gmail.com");
        grupo2.add("yasminsilva@gmail.com");
        grupo2.add("pedrocarmo@gmail.com");

        Lista lista1 = new Lista(grupo1,grupo2);
        lista1.apresenta();
    }
}
