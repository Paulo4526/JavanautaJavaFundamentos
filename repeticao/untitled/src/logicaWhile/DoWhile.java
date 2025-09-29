package logicaWhile;

public class DoWhile {
    public void loopDoWhile(Integer valor){
        Integer contador = 0;
        do {
            contador++;
            System.out.println("Valor do contador com Do-While: " + contador);
        }while (contador < valor);
    }
}
