package logicaWhile;

public class LogicaWhile {
    public void contador(Integer valorFinal){
        Integer contador = 0;
        while(contador < valorFinal) {
            contador++;
            System.out.println("Contando: " + contador);
        }
    }
}
