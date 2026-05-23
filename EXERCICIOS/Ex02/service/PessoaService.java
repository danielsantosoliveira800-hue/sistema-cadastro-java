package EXERCICIOS.Ex02.service;

import EXERCICIOS.Ex02.model.Pessoa;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/** Serviço responsável pelas operações de CRUD de pessoas. */
public class PessoaService implements Servico {

    /** Adiciona uma pessoa ao cadastro. Verifica se o CPF já existe. */
    @Override
    public void adicionar(Pessoa pessoa, HashMap<String, Pessoa> pessoas) {
        try {

            if (pessoa == null) {
                throw new Exception("Pessoa inválida.");
            }

            if (pessoas.containsKey(pessoa.getCpf())) {
                throw new Exception("CPF já cadastrado.");
            }

            pessoas.put(pessoa.getCpf(), pessoa);

            System.out.println("Pessoa adicionada com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /** Coleta os dados via terminal e cria um objeto Pessoa. */
    @Override
    public Pessoa criarPessoa(Scanner sc) {

        try {

            String nome = lerName(sc);
            String cpf = lerCPF(sc);
            String gmail = lerGmail(sc);
            String endereco = lerEndereco(sc);
            String telefone = lerTelefone(sc);

            return new Pessoa(nome, cpf, gmail, endereco, telefone);

        } catch (IllegalArgumentException e) {

            System.out.println("Erro ao criar pessoa: " + e.getMessage());
            return null;
        }
    }

    /** Remove uma pessoa do cadastro pelo CPF. */
    @Override
    public void remover(String cpf, HashMap<String, Pessoa> pessoas) {

        try {

            if (!pessoas.containsKey(cpf)) {
                throw new Exception("CPF não encontrado.");
            }

            pessoas.remove(cpf);

            System.out.println("Pessoa removida com sucesso.");

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());
        }
    }

    /** Lê e valida a opção do menu. Aceita apenas valores entre 1 e 6. */
    @Override
    public int lerOpcao(Scanner sc) {

        try {

            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao < 1 || opcao > 6) {
                System.out.println("Opção inválida.");
                return 0;
            }

            return opcao;

        } catch (InputMismatchException e) {

            System.out.println("Digite apenas números.");
            sc.nextLine();

            return 0;
        }
    }

    /** Lê e valida o CPF. Permite até 3 tentativas. */
    @Override
    public String lerCPF(Scanner sc) {

        int tentativas = 0;

        while (tentativas < 3) {

            System.out.println("Digite um CPF com 11 dígitos:");
            String cpf = sc.nextLine();

            cpf = cpf.replaceAll("\\D", "");

            if (cpf.matches("\\d{11}")) {
                return cpf;
            }

            System.out.println("CPF inválido. Tentativa "
                    + (tentativas + 1) + " de 3.");

            tentativas++;
        }

        throw new IllegalArgumentException("Tentativas excedidas.");
    }

    /** Lê e valida o nome. Aceita apenas letras e espaços. Permite até 3 tentativas. */
    @Override
    public String lerName(Scanner sc) {

        int tentativas = 0;

        while (tentativas < 3) {

            System.out.println("Digite o nome:");
            String nome = sc.nextLine();

            if (!nome.isBlank() &&
                    nome.matches("[a-zA-ZÀ-ú ]+")) {

                return nome;
            }

            if (nome.isBlank()) {

                System.out.println("Nome não pode ser vazio. Tentativa "
                        + (tentativas + 1) + " de 3.");

            } else {

                System.out.println("Nome deve conter apenas letras. Tentativa "
                        + (tentativas + 1) + " de 3.");
            }

            tentativas++;
        }

        throw new IllegalArgumentException("Tentativas excedidas.");
    }

    /** Lê e valida o e-mail. Permite até 3 tentativas. */
    @Override
    public String lerGmail(Scanner sc) {

        int tentativas = 0;

        while (tentativas < 3) {

            System.out.println("Digite o Gmail:");
            String gmail = sc.nextLine();

            if (gmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                return gmail;
            }

            System.out.println("Gmail inválido. Tentativa "
                    + (tentativas + 1) + " de 3.");

            tentativas++;
        }

        throw new IllegalArgumentException("Tentativas excedidas.");
    }

    /** Lê e valida o endereço. Rejeita entradas em branco. Permite até 3 tentativas. */
    @Override
    public String lerEndereco(Scanner sc) {

        int tentativas = 0;

        while (tentativas < 3) {

            System.out.println("Digite o endereço:");
            String endereco = sc.nextLine();

            if (!endereco.isBlank()) {
                return endereco;
            }

            System.out.println("Endereço inválido. Tentativa "
                    + (tentativas + 1) + " de 3.");

            tentativas++;
        }

        throw new IllegalArgumentException("Tentativas excedidas.");
    }

    /** Lê e valida o telefone com DDD. Permite até 3 tentativas. */
    @Override
    public String lerTelefone(Scanner sc) {

        int tentativas = 0;

        while (tentativas < 3) {

            System.out.println("Digite o telefone com DDD:");
            String telefone = sc.nextLine();

            telefone = telefone.replaceAll("\\D", "");

            if (telefone.matches("\\d{11}")) {
                return telefone;
            }

            System.out.println("Telefone inválido. Tentativa "
                    + (tentativas + 1) + " de 3.");

            tentativas++;
        }

        throw new IllegalArgumentException("Tentativas excedidas.");
    }

    /** Atualiza os dados de uma pessoa cadastrada pelo CPF. */
    @Override
    public void atualizarDados(String cpf, HashMap<String, Pessoa> pessoas, Scanner sc) {

        try {

            if (!pessoas.containsKey(cpf)) {
                throw new Exception("CPF não encontrado.");
            }

            Pessoa pessoa = pessoas.get(cpf);

            System.out.println("Dados atuais:");
            System.out.println(pessoa);

            int opcao;

            do {

                menuDados();

                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {

                    case 1 -> {

                        pessoa.setNome(lerName(sc));

                        System.out.println("Nome atualizado com sucesso.");
                    }

                    case 2 -> {

                        pessoa.setGmail(lerGmail(sc));

                        System.out.println("Gmail atualizado com sucesso.");
                    }

                    case 3 -> {

                        pessoa.setTelefone(lerTelefone(sc));

                        System.out.println("Telefone atualizado com sucesso.");
                    }

                    case 4 -> {

                        pessoa.setEndereco(lerEndereco(sc));

                        System.out.println("Endereço atualizado com sucesso.");
                    }

                    case 5 -> {
                        System.out.println("Voltando...");
                    }

                    default -> {
                        System.out.println("Opção inválida.");
                    }
                }

            } while (opcao != 5);

            System.out.println("Cadastro atualizado com sucesso.");

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());
        }
    }

    /** Lista todas as pessoas cadastradas em ordem alfabética. */
    @Override
    public void imprime(HashMap<String, Pessoa> pessoas) {

        pessoas.values()
                .stream()
                .sorted((a, b) ->
                        a.getNome().compareTo(b.getNome()))
                .forEach(System.out::println);
    }

    /** Busca e exibe os dados de uma pessoa pelo CPF. */
    @Override
    public void buscar(String cpf, HashMap<String, Pessoa> pessoas) {

        try {

            cpf = cpf.replaceAll("\\D", "");

            if (!cpf.matches("\\d{11}")) {
                throw new Exception("CPF inválido.");
            }

            if (!pessoas.containsKey(cpf)) {
                throw new Exception("CPF não encontrado.");
            }

            System.out.println(pessoas.get(cpf));

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());
        }
    }

    /** Exibe o menu principal no terminal. */
    @Override
    public void menu() {

        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("--------------------------------");

        System.out.println("1 - Listar todos");
        System.out.println("2 - Buscar por CPF");
        System.out.println("3 - Cadastrar");
        System.out.println("4 - Remover");
        System.out.println("5 - Alterar dados");
        System.out.println("6 - Sair");

        System.out.println("Digite a opção:");
    }

    /** Exibe o submenu de alteração de dados no terminal. */
    @Override
    public void menuDados() {

        System.out.println("\n=== MENU DE ALTERAÇÃO ===");
        System.out.println("--------------------------------");

        System.out.println("1 - Nome");
        System.out.println("2 - Gmail");
        System.out.println("3 - Telefone");
        System.out.println("4 - Endereço");
        System.out.println("5 - Voltar");

        System.out.println("Digite a opção:");
    }
}
