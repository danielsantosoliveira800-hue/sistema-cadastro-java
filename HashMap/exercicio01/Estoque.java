package HashMap.exercicio01;
import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private HashMap<String, Double> produtos;

    public HashMap<String, Double> getProdutos() {
        return produtos;
    }

    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(String nome, Double preco){
        produtos.put(nome, preco);
    }

    public void apresenta(HashMap<String,Double> produtos){
        for (Map.Entry<String, Double> entry : produtos.entrySet()){
            System.out.println(entry.getKey() + "-> R$"+ entry.getValue());
        }
    }
}
