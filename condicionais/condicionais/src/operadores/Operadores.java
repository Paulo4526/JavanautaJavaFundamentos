package operadores;

public class Operadores {
    //Metodos condicionais com operadores lógicos
    //Verifica se maior e mesmo tipo
    public Boolean verificaSeMaiorOuMenor (Integer valor1, Integer valor2){
        if(valor1 > valor2 || valor1 < valor2){
            return true;
        }else {
            return false;
        }
    }

    public Boolean verificaSeMaiorEdiferente(String valor1, Integer valor2){
        if(valor1.length() > valor2 && valor1.getClass().getSimpleName() != valor2.getClass().getSimpleName()){
            return true;
        }else{
            return false;
        }
    }

    public Boolean negaEntrada(String valor1, Integer valor2){
        if(!"Integer".equals(valor1 instanceof String) && valor2 instanceof Number){
            return true;
        }else{
            return false;
        }
    }
}
