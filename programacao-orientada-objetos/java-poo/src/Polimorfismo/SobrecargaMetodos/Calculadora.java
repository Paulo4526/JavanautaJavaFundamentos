package Polimorfismo.SobrecargaMetodos;

public class Calculadora {
    //Em sobrecarga de metodos podemos utilizar o mesmo nome de metodo porém com caracteristicas diferentes
    public static  int soma(int a, int b){
        return a+b;
    }

    public static double somar(double a, double b){
        return a+b;
    }

    public static float somar(float a, float b){
        return a+b;
    }
}
