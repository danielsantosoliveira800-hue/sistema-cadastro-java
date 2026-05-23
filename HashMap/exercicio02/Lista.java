package HashMap.exercicio02;
import java.util.HashMap;
import java.util.Map;

public class Lista {
    HashMap<String, Integer> pessoas;

    public Lista(HashMap<String, Integer> pessoas) {
        this.pessoas = pessoas;
    }

    public void apresenta(){
        for (Map.Entry<String, Integer> entry: pessoas.entrySet()){
            if (entry.getValue() > 20){
                System.out.println(entry.getKey() +", idade: "+ entry.getValue());
            }
        }
    }
}
