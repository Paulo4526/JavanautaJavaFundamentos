import Scanner.UtilizandoScanner;
import convercoes.ConversaoTipos;

public class Main {
    public static void main(String[] args) {
        UtilizandoScanner scanner = new UtilizandoScanner();
//        scanner.getNomeSobrenome();

        ConversaoTipos conversaoTipos = new ConversaoTipos();
        conversaoTipos.converteDoubleToInteger();
        conversaoTipos.converteStringToInt();
    }
}
