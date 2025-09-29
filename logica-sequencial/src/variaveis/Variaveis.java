package variaveis;

public class Variaveis {

    //Para números inteiros
    public long numeroLongo; //Até 9 quintilhoes
    public int numeroMedio; //Até 2 bilhoes

    //Para números flutuantes para moedas
    public double valorDouble;

    //Para caracteres
    public char nomeCaractere;

    //Para booleano
    public boolean condicaoBoolean;

    public String verificaVerdadeiro (Boolean condicao){
        if(condicao == true){
            return "Sim";
        }else{
            return "Não";
        }
    }
}
