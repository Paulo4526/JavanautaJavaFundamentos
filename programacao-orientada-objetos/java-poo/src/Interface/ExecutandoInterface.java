package Interface;

public class ExecutandoInterface {
    public static void main(String[] args) {
        ImplementandoInterface implementandoInterface = new ImplementandoInterface();

        int valorSoma = implementandoInterface.somando(10, 20);
        System.out.println(valorSoma);

        int valorSubtracao = implementandoInterface.subtraindo(50,30);
        System.out.println(valorSubtracao);
    }
}
