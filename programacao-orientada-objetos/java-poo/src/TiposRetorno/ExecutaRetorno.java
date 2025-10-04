package TiposRetorno;

import java.util.Date;

public class ExecutaRetorno {
    public static void main(String[] args) {
        TipoRetorno tipoRetorno = new TipoRetorno();

        String retornaData = tipoRetorno.retornaDate();
        System.out.println("Retorna String com Data: " + retornaData);

        String retornaHora = tipoRetorno.retornaHora();
        System.out.println("Retorna String com Hora: " + retornaHora);

        boolean retornaBoolean = tipoRetorno.retornaBoolean();
        System.out.println("Retorna Boolean: " + retornaBoolean);

        double retornaDouble = tipoRetorno.retornaDouble();
        System.out.println("Retorna Double: " + retornaDouble);

        float retornaFloat = tipoRetorno.retornaFloat();
        System.out.println("Retorna Float: " + retornaFloat);

        int retornaInteiro = tipoRetorno.retornaInteger();
        System.out.println("Retorna Inteiro: " + retornaInteiro);

        long retornaLong = tipoRetorno.retornaLong();
        System.out.println("Retorna Long: " + retornaLong);

        String retornaString = tipoRetorno.retornaString();
        System.out.println("Retorna String: " + retornaString);

    }
}
