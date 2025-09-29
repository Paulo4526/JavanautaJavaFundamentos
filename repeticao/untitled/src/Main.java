import logicaFor.LogicaFor;
import logicaWhile.DoWhile;
import logicaWhile.LogicaWhile;

public class Main {
    public static void main(String[] args) {
        //Lógica somente com while
        LogicaWhile logica = new LogicaWhile();
        logica.contador(10);

        //Lógica com do While
        DoWhile doWhile = new DoWhile();
        doWhile.loopDoWhile(20);

        //Lógica do for
        LogicaFor logicaFor = new LogicaFor();
        logicaFor.logicaFor(20);
    }
}
