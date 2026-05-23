package EXERCICIOS.Ex02.service;

import EXERCICIOS.Ex02.model.Pessoa;

import java.util.HashMap;
import java.util.Scanner;

public interface Servico {

    void menu();

    void menuDados();

    void imprime(HashMap<String, Pessoa> pessoas);

    void buscar(String cpf, HashMap<String, Pessoa> pessoas);

    void adicionar(Pessoa pessoa, HashMap<String, Pessoa> pessoas);

    Pessoa criarPessoa(Scanner sc);

    void remover(String cpf, HashMap<String, Pessoa> pessoas);

    void atualizarDados(String cpf, HashMap<String, Pessoa> pessoas, Scanner sc);

    int lerOpcao(Scanner sc);

    String lerCPF(Scanner sc);

    String lerName(Scanner sc);

    String lerGmail(Scanner sc);

    String lerEndereco(Scanner sc);

    String lerTelefone(Scanner sc);
}