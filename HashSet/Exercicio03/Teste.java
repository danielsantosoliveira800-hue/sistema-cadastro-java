package HashSet.Exercicio03;

import java.util.ArrayList;
import java.util.HashSet;

public class Teste {
    public static void main(String[] args) {


        try {
            ArrayList<String> email = new ArrayList<>();

            email.add("daniel@gmail.com");
            email.add("hugo@gmail.com");
            email.add("daniel@gmail.com");
            email.add("julia@gmail.com");
            email.add("hugo@gmail.com");

            if (email.isEmpty()){
                throw new Exception("Lista Vazia.");
            }

            HashSet<String> padrao = new HashSet<>(email);
            new Dominio().apresenta(padrao,email);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
