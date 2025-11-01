package verificada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDocumentos {
    public static void main(String[] args) {
        //Inicializando nossa classe Buffer como null
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new FileReader("D:\\Javanauta\\Java Fundamentals\\excecoes-java\\excecoes\\src\\textosAplicacoes\\verificado.txt"
                    ));
            //Ler linha por linha
            String linha;
            while ( (linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo, erro: " + e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
