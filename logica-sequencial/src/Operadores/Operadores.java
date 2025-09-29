package Operadores;

public class Operadores {

    public double salario;
    public float desconto;
    public int diasTrabaho;
    public float horasTrabalhoDia;
    public float porcentagemExtra;
    public float horasMesExtra;

    public Double valorDiaTrabalhado(int dias, double salario){
        return salario / dias;
    }

    public Double salarioDesconto (double salario, float desconto){
        if(desconto > 0){
            float porcentagem = desconto / 100;
            return salario * porcentagem;
        }else {
            return salario;
        }
    }

    public Double calculaExtra (float horasDia, float horas){
        double valorDia = valorDiaTrabalhado(diasTrabaho, salario);
        System.out.println("valor Dia: " + valorDia);
        double valorHora = valorDia / horasDia;
        System.out.println("valor Hora: " + valorHora);
        if (porcentagemExtra > 0){
            float porcentagem = porcentagemExtra / 100 + 1;
            double valorExtra = valorHora * porcentagem;
            System.out.println("Valor da hora Extra: " + valorExtra);
            return valorExtra * horas;
        }else{
            return 0.00;
        }
    }
}
