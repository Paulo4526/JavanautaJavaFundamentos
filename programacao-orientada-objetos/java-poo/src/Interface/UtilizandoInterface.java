package Interface;

public interface UtilizandoInterface {
    //Os metodos de interface não possuem implementação nela mesma, a implementação da lógica é feita diretamente com a chamada
    //Na Interface não é preciso colocar os modificadores de acesso se publico private e protected
    Integer somando(Integer valor1, Integer valor2);

    Integer subtraindo(Integer valor1, Integer valor2);
}
