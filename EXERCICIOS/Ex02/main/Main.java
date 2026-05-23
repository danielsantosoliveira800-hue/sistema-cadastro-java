package EXERCICIOS.Ex02.main;

import EXERCICIOS.Ex02.model.Pessoa;
import EXERCICIOS.Ex02.service.PessoaService;
import EXERCICIOS.Ex02.service.Servico;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Pessoa> pessoas = new HashMap<>();

        Servico service = new PessoaService();

        Scanner sc = new Scanner(System.in);

        carregarPessoasIniciais(pessoas);

        int opcao;

        do {

            service.menu();

            opcao = service.lerOpcao(sc);

            switch (opcao) {

                case 1 -> {
                    service.imprime(pessoas);
                }

                case 2 -> {

                    System.out.println("Digite o CPF para pesquisa:");

                    String cpf = sc.nextLine();

                    service.buscar(cpf, pessoas);
                }

                case 3 -> {

                    Pessoa novaPessoa = service.criarPessoa(sc);

                    service.adicionar(novaPessoa, pessoas);
                }

                case 4 -> {

                    System.out.println("Digite o CPF para remover:");

                    String cpf = sc.nextLine();

                    service.remover(cpf, pessoas);
                }

                case 5 -> {

                    System.out.println("Digite o CPF para atualizar:");

                    String cpf = sc.nextLine();

                    service.atualizarDados(cpf, pessoas, sc);
                }

                case 6 -> {
                    System.out.println("Saindo...");
                }

                default -> {
                    System.out.println("Opção inválida.");
                }
            }

        } while (opcao != 6);

        sc.close();
    }

    public static void carregarPessoasIniciais(HashMap<String, Pessoa> pessoas) {

        Pessoa p1 = new Pessoa(
                "Daniel Santos",
                "11111222223",
                "daniel.santos@gmail.com",
                "Rua das Maldivas, 120",
                "11999998888"
        );

        Pessoa p2 = new Pessoa(
                "Hugo Souza",
                "11111222224",
                "hugo.souza@gmail.com",
                "Avenida Brasil, 450",
                "11988887777"
        );

        Pessoa p3 = new Pessoa(
                "Yuri Alberto",
                "11111222225",
                "yuri.alberto@gmail.com",
                "Rua Central, 89",
                "11977776666"
        );

        Pessoa p4 = new Pessoa(
                "Caleri Jhonathan",
                "11111222226",
                "caleri.jhonathan@gmail.com",
                "Rua do Estádio, 310",
                "11966665555"
        );

        Pessoa p5 = new Pessoa(
                "Arboleda",
                "11111222227",
                "arboleda@gmail.com",
                "Rua Libertadores, 700",
                "11955554444"
        );

        pessoas.put(p1.getCpf(), p1);
        pessoas.put(p2.getCpf(), p2);
        pessoas.put(p3.getCpf(), p3);
        pessoas.put(p4.getCpf(), p4);
        pessoas.put(p5.getCpf(), p5);
    }
}