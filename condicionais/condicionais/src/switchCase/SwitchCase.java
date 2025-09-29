package switchCase;

public class SwitchCase {
    public String verificaIdade(Integer diaSemana){

        switch (diaSemana){
            case 1:
                return "Hoje é Segunda-Feira";

            case 2:
                return "Hoje é Terça-Feira";
            case 3:
                return "Hoje é Quarta-Feira";
            case 4:
                return "Hoje é Quinta-Feira";
            case 5:
                return "Hoje é Sexta-Feira";
            case 6:
                return "Hoje é Sabado";
            case 7:
                return "Hoje é Domingo";
            default:
                return "Não foi possível identificar o dia da semana";

        }
    }
}
