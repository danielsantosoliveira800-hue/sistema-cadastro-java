package HashMap.Exercicio03;

import java.util.HashMap;

public class Teste {
    public static void main(String[] args) {
        HashMap<String,Double> funcionarios = new HashMap<>();
        funcionarios.put("Daniel",12500.00);
        funcionarios.put("Bia",1100.00);
        funcionarios.put("Patrycia",10300.00);
        funcionarios.put("Hugo",5200.00);

        Lista lista1 = new Lista(funcionarios);
        lista1.apresenta();
    }
}
