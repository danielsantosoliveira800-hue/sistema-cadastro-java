package HashSet.Exercicio03;

import java.util.ArrayList;
import java.util.HashSet;

public class Dominio {
    HashSet<String> padrao;

    public void apresenta(HashSet<String> padrao, ArrayList<String> email){
        System.out.println("Emails duplicados: "+email.size());
        System.out.println("Emails unicos: "+padrao.size());
        System.out.println("_____________________________");

        for (String s: padrao){
            System.out.println(s);
        }
    }
}
