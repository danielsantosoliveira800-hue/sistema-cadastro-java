package Tratamentos.Exercicio03;

import java.util.List;

public class Funcionarios {
    private String nome;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Funcionarios(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;

    }

    public void imprime(List<Funcionarios> funcionarios) {
        float total = 0;
        for (Funcionarios f : funcionarios) {
            total += f.getSalario();
        }

        try {
            if (funcionarios.isEmpty()){
                throw new Exception("Lista de funcionarios vazia.");
            }

            float media = total / funcionarios.size();

            for (Funcionarios f : funcionarios) {
                if (f.getSalario() > media) {
                    System.out.println(f.getNome() + " -> R$"+ f.getSalario());
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
