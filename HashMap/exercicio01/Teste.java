package HashMap.exercicio01;

import java.util.HashMap;

public class Teste {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque();
        HashMap<String, Double> produtos = new HashMap<>();

        estoque1.adicionarProduto("Notebook",3100.00);
        estoque1.adicionarProduto("Memória",350.00);
        estoque1.adicionarProduto("Monitor",700.00);
        estoque1.adicionarProduto("teclado",400.00);

        estoque1.apresenta(estoque1.getProdutos());
    }
}
