package EXERCICIOS.Ex01;

import java.util.ArrayList;

public class Prod {
    private double preco;
    private String nome;

    public Prod(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void apresenta(int opc, ArrayList<Prod> produtos){
        try {
            if (produtos.isEmpty()){
                throw new Exception("Lista Vazia!");
            }
            Prod p = produtos.get(opc-1);
            System.out.println("Produto: "+p.getNome()+" | Preço: R$"+ p.getPreco());
        }catch (IndexOutOfBoundsException e){
            System.out.println("Indice Inválido...");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return
                   nome +
                "... R$" + preco ;
    }
}
