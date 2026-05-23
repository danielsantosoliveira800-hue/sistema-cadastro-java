package EXERCICIOS.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Prod p1 = new Prod(45.00,"Tesoura");
        Prod p2 = new Prod(12.00,"Régua");
        Prod p3 = new Prod(67.00,"caderno");
        Prod p4 = new Prod(125.00,"mochila");
        Prod p5 = new Prod(5.00,"caneta");

        ArrayList<Prod> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);

        int indice = 1;
        for (Prod produto : produtos) {
            System.out.println(indice +" -- "+produto);
            indice++;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o indice para acessar somente o produto: ");
        int indDig = sc.nextInt();

        p1.apresenta(indDig,produtos);
    }
}
