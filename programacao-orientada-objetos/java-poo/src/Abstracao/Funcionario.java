package Abstracao;

public class Funcionario extends Endereco{
    private String nome;
    private String cpf;

    public Funcionario(String logradouro, String numero, String bairro, String cidade, String estado, String nome, String cpf) {
        super(logradouro, numero, bairro, cidade, estado);
        this.nome = nome;
        this.cpf = cpf;
    }
}
