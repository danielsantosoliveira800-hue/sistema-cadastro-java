package HashMap.Exercicio03;
import java.util.HashMap;
import java.util.Map;

public class Lista {
    HashMap<String,Double> funcionarios;

    public Lista(HashMap<String, Double> funcionarios) {
        this.funcionarios = funcionarios;
    }


    public double media(){
        double total = 0;
        for (Map.Entry<String,Double> entry: funcionarios.entrySet()){
            total += entry.getValue();
        }
        return total/ funcionarios.size();
    }

    public void apresenta(){
        double media = media();
        for (Map.Entry<String,Double> entry: funcionarios.entrySet()){
            if (entry.getValue() > media){
                System.out.println(entry.getKey()+", salário R$:"+entry.getValue());
            }
        }
    }
}
