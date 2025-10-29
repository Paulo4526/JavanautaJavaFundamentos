package PraticandoHeranca;

public class Animal {
    private String bebida;
    private String alimento;
    private String acao;

    //Criando um construtor vazio para estanciamento e possibilidade da classe filho poder chamar somente os atributos da classe pai/mae
    public Animal() {}

    public Animal(String bebida, String alimento, String acao) {
        this.bebida = bebida;
        this.alimento = alimento;
        this.acao = acao;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public void comer(String alimento){
        this.alimento = alimento;
    }

    public void acao( String acao){
        this.acao = acao;
    }

    public void beber( String bebida){
        this.bebida = bebida;
    }
}
