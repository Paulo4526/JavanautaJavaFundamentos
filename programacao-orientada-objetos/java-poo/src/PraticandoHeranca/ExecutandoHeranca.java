package PraticandoHeranca;

public class ExecutandoHeranca {
    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro();
        //Utilizando metodo setter que atribuem valores aos atributos da classe
        caramelo.setNome("Caramelo");
        caramelo.setCor("Pelo rosa");
        caramelo.setRaca("Pincher");
        System.out.println("Qual o nome do animal: " + caramelo.getNome());
        System.out.println("Qual a cor do pelo do animal: " + caramelo.getCor());
        System.out.println("Qual a raca do animal: " + caramelo.getRaca());
        //Utilizando metodos que atribuem valores aos atributos da classe, lembrando que também é possível atribuir valores com o setter da classe pai.
        caramelo.comer("Beterraba");
        caramelo.beber("Cerveja");
        caramelo.acao("Latindo");
        System.out.println("O que o " + caramelo.getNome() + " está comendo: " + caramelo.getAlimento());
        System.out.println("O que o " + caramelo.getNome() + "  está bebendo: " + caramelo.getBebida());
        System.out.println("O que o " + caramelo.getNome() + "  está fazendo: " + caramelo.getAcao());
        //Utilizando metodo setter que atribui valores aos atributos da classe pai, lembrando que para isso precisamos de um construtor com o metodo super vazio ou com valores pre defeinidos de inicializaçao
        caramelo.setAcao("Dormindo");
        caramelo.setBebida("coca-cola");
        caramelo.setAlimento("Maccarão com pera");
        System.out.println("O que o  " + caramelo.getNome() + "  está comendo: " + caramelo.getAlimento());
        System.out.println("O que o  " + caramelo.getNome() + "  está bebendo: " + caramelo.getBebida());
        System.out.println("O que o  " + caramelo.getNome() + "  está fazendo: " + caramelo.getAcao());

        //Caso queira, realizar as mesmas atribuiçoes na classe gato.
        Gato gato = new Gato();
        gato.comer("Carne de passarinho");
    }
}
