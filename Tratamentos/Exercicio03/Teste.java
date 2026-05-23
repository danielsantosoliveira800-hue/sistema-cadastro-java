package Tratamentos.Exercicio03;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        Funcionarios f1 = new Funcionarios("Daniel",12000.00);
        Funcionarios f2 = new Funcionarios("Julia",18000.00);

        ArrayList<Funcionarios> funcionarios = new ArrayList<>();

        funcionarios.add(f1);
        funcionarios.add(f2);

        f1.imprime(funcionarios);
    }
}
