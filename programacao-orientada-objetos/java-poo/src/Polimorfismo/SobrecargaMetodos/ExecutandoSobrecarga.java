package Polimorfismo.SobrecargaMetodos;

public class ExecutandoSobrecarga {
    public static void main(String[] args) {
        int inteiro = Calculadora.soma(1,2);
        double decimais = Calculadora.somar(5.6, 7.8);
        float flutuante = Calculadora.somar(1.5F, 8.54F);
        System.out.println("Soma de inteiros " + inteiro);
        System.out.println("Soma de doubles " + decimais);
        System.out.println("Soma de floats " + flutuante);
    }
}
