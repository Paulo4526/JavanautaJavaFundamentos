package PraticandoHeranca;

public class Cachorro extends Animal{

    private String nome;
    private String cor;
    private String raca;

    //Aqui criamos um construtor vazio, porém, para atribuir valores vindas da classe pai/mae precisamos do atributo super caso esses atributos estejam ecapsulados
    public Cachorro(){
        super();
    }

    //Aqui criamos um construtor á com valores pré-definidos assim como aprendemos no encapsulamento
    public Cachorro(String nome, String cor, String raca, String bebida, String alimento, String acao) {
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
