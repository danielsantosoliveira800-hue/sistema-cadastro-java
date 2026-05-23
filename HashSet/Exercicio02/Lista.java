package HashSet.Exercicio02;

import java.util.HashSet;

public class Lista {
    HashSet<String> grupo1;
    HashSet<String> grupo2;

    public Lista(HashSet<String> grupo1, HashSet<String> grupo2) {
        this.grupo1 = grupo1;
        this.grupo2 = grupo2;
    }

    public void apresenta(){
        try {
            if (grupo1.isEmpty() || grupo2.isEmpty()){
                throw new Exception("Um dos grupos esta vazio.");
            }

            HashSet<String> uniao = new HashSet<>(grupo1);
            uniao.addAll(grupo2);
            System.out.println("União: "+uniao);

            HashSet<String> interssessao = new HashSet<>(grupo1);
            interssessao.retainAll(grupo2);
            System.out.println("Interssessão: "+interssessao);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
