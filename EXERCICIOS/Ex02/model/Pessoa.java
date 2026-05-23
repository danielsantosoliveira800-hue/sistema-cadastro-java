package EXERCICIOS.Ex02.model;

public class Pessoa {

    private String nome;
    private String gmail;
    private String endereco;
    private String telefone;
    private final String cpf;

    public Pessoa(String nome,
                  String cpf,
                  String gmail,
                  String endereco,
                  String telefone) {

        setNome(nome);
        validarCpf(cpf);
        setGmail(gmail);
        setEndereco(endereco);
        setTelefone(telefone);

        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome == null ||
                nome.isBlank() ||
                !nome.matches("[a-zA-ZÀ-ú ]+")) {

            throw new IllegalArgumentException("Nome inválido.");
        }

        this.nome = nome;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {

        if (gmail == null ||
                !gmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {

            throw new IllegalArgumentException("Gmail inválido.");
        }

        this.gmail = gmail;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {

        if (endereco == null || endereco.isBlank()) {
            throw new IllegalArgumentException("Endereço inválido.");
        }

        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {

        if (telefone == null) {
            throw new IllegalArgumentException("Telefone inválido.");
        }

        telefone = telefone.replaceAll("\\D", "");

        if (!telefone.matches("\\d{11}")) {
            throw new IllegalArgumentException("Telefone inválido.");
        }

        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    private void validarCpf(String cpf) {

        if (cpf == null) {
            throw new IllegalArgumentException("CPF inválido.");
        }

        cpf = cpf.replaceAll("\\D", "");

        if (!cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("CPF inválido.");
        }
    }

    @Override
    public String toString() {

        return "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nGmail: " + gmail +
                "\nTelefone: " + telefone +
                "\nEndereço: " + endereco;
    }
}