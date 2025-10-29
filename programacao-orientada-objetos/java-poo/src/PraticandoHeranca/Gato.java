package PraticandoHeranca;

public class Gato extends Animal{
    private String nome;
    private String cor;
    private String raca;

    public Gato(){
        super();
    }

    public Gato(String nome, String cor, String raca, String bebida, String alimento, String acao) {
        super(bebida, alimento, acao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

}
