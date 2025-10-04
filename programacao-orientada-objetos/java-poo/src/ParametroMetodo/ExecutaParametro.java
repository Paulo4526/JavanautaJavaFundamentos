package ParametroMetodo;

public class ExecutaParametro {
    public static void main(String[] args) {
        ParametroMetodo parametroMetodo = new ParametroMetodo();
        String valorDivisao = parametroMetodo.dividindoValores(55.3F, 4.35F);
        System.out.println("Valor da divisão: " + valorDivisao);

        int somandoInteiros = parametroMetodo.somandoValores(10,20);
        System.out.println("Valor da soma: " + somandoInteiros);

        parametroMetodo.verificandoIdade(5);

        double calculaDesconto = parametroMetodo.calculandoDescontoSalario(1890.50, 556.69);
        System.out.println("Valor do salário liquido após desconto: " + calculaDesconto);
    }
}
