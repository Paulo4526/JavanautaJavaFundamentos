package PraticandoEncapsulamento;

import java.time.LocalDateTime;

public class ContaBancaria {
    //No encapsulamento, transformamos nossos atributos em private e criamos os metodos publicos Getters e Setters
    //Getter = Acessa e recebe o valor do atributo, sempre retorna o valor com o mesmo tipo do atributo
    //Setter = Acessa e altera o valor ou atribui valor ao atributo, retorno void pois o metodo somente altera, para receber o valor utilizamos o getter
    private String nomeCorrentista;
    private Long cpf;
    private Double saldo;
    private Integer idade;
    private LocalDateTime data;

    //Criando o construtor, o construtor informa quando instanciarmos a nossa classe se devemos informar os valores inicialmente de forma obrigatória na instância ou se podemos atribuir valores de forma separada
    //O construtor serve para garantir que determinados dados sejam ou não preenchidos na chamada da instancia.

    //Construtor vazio permitindo alterar os atributos de forma individual
    public ContaBancaria(){

    }

    //Construtor com atributos que garante que ao ser chamado, exija os valores nomeCorrentista e idade ao inicializar a instancia
    public ContaBancaria(String nomeCorrentista, Integer idade){
        this.nomeCorrentista = nomeCorrentista;
        this.idade = idade;
    }

    //Metodo Getter
    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    //Metodo setter
    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    //Metodo Getter
    public Long getCpf() {
        return cpf;
    }

    //Metodo setter
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    //Metodo Getter
    public Double getSaldo() {
        return saldo;
    }

    //Metodo setter
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    //Metodo Getter
    public Integer getIdade() {
        return idade;
    }

    //Metodo setter
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    //Metodo Getter
    public LocalDateTime getData() {
        return data;
    }

    //Metodo setter
    public void setData(LocalDateTime data) {
        this.data = data;
    }


}
