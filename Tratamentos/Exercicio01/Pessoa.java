package Tratamentos.Exercicio01;
import java.util.List;
import java.util.Scanner;

public class Pessoa {

    public void entrada(List <String> nomes){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um indice para acessar no Array: ");
            int index = sc.nextInt();

            try {
                System.out.println(nomes.get(index-1));
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Indice invalido");
            }finally {
                System.out.println("Tarefa encerrada.");
            }

    }
}
