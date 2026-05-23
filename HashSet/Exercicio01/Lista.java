package HashSet.Exercicio01;
import java.util.HashSet;
import java.util.Set;

public class Lista {
    HashSet<String> nomes;

    public Lista(HashSet<String> nomes) {
        this.nomes = nomes;
    }

    public void apresenta(){
        for (String n: nomes){
            System.out.println(n);
        }

        System.out.println(nomes.size());
    }
}
