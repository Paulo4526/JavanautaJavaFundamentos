package TiposRetorno;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TipoRetorno {
    //Metodo que retorna caracteres/letras(String)
    public String retornaString(){
        return "Retornando String";
    }

    //Metodo que retorna um valor inteiro(Integer)
    public Integer retornaInteger(){
        return 50;
    }

    //Metodo que retorna um valor Double
    public Double retornaDouble(){
        return 55.10;
    }

    //Metodo que retorna um valor longo(Long)
    public Long retornaLong(){
        return 10L;
    }

    //Metodo que retorna um valor flutuante(float)
    public Float retornaFloat(){
        return 55.06F;
    }

    //Metodo que retorna um valor boleano(boolean)
    public Boolean retornaBoolean(){
        return true;
    }

    //Metodo com retorno void(vazio)
    public String retornaDate(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yy"));
    }

    public String retornaHora(){
        return  LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
    }
}
