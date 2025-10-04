package PraticandoEncapsulamento;

public class ExecutandoContaBancaria {
    public static void main(String[] args) {
        //Instanciando a classe ContaBancaria com construtor vazio ao inicializar a instancia
        ContaBancaria contaBancaria = new ContaBancaria();
        //Observe utilizamos o metodo set para atribuir valor ao nomeCorrentista
        contaBancaria.setNomeCorrentista("Paulo Bueno");
        //Após atribuir valor, para exibir o valor precisamos do metodo geter
        System.out.println("Nome: " + contaBancaria.getNomeCorrentista());

        //Utilizando construtor com nome e idade definidos ao inicializar a instancia
        //Veja que com o construtor com valores pré definidos e criado na Classe não precisamos utilizar o Setter
        ContaBancaria nomeDefinido = new ContaBancaria("Paulo Bueno", 10);
        System.out.println("Nome: " + nomeDefinido.getNomeCorrentista()+  ", Idade: " + nomeDefinido.getIdade());
    }
}
