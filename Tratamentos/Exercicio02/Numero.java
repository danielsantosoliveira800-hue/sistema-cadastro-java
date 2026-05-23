package Tratamentos.Exercicio02;
import java.util.Scanner;

public class Numero {
    public void entrada(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        double n1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        double n2 = sc.nextInt();
        divisao(n1,n2);
    }

    public void divisao(double n1, double n2){
        try {
            double s = n1 / n2;
            System.out.println("A divisão entre "+n1+" e "+n2+" é: "+s);
        }catch (ArithmeticException e){
            System.out.println("não é possivel dividir por zero.");
        }finally {
            System.out.println("Tarefa encerrada.");
        }

    }
}
