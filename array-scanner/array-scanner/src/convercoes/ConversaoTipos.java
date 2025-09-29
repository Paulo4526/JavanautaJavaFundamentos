package convercoes;

public class ConversaoTipos {
    public Double numeroDouble;
    public Integer numeroInteger;
    public String caractereString;

    public void converteDoubleToInteger() {
        numeroDouble = 20.55;
        numeroInteger = numeroDouble.intValue();
        System.out.println("Convertendo double para inteiro: " + numeroInteger);
    }

    public void converteStringToInt() {
        caractereString = "eu moro em salvador";
        numeroInteger = caractereString.length();
        System.out.println("Convertendo string para número: " + numeroInteger);
    }
}
