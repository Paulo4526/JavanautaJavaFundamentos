package ifElse;

import java.util.Objects;

public class Condicionais {
    public String valor1;
    public String valor2;
    public Integer numero1;
    public Integer numero2;
    public Boolean status;

    public Boolean verificaSeIgual(Object valor1, Object valor2){
        if(Objects.equals(valor1, valor2)){

            return status = true;
        }else{
            return status = false;
        }
    }

    public Boolean veficaSeMaior(Integer numero1, Integer numero2){
        if(numero1 > numero2){
            return status = true;
        }else{
            return status = false;
        }
    }

    public Boolean verificaSeMenor(Integer numero1, Integer numero2){
        if (numero1 < numero2){
            return status = true;
        }else{
            return status = false;
        }
    }

    public Boolean verificaSeDiferente(Integer numero1, Integer numero2){
        if(numero1 != numero2){
            return status = true;
        }else{
            return status = false;
        }
    }
}
