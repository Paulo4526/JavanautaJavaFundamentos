package ParametroMetodo;

public class ParametroMetodo {
    public String dividindoValores(Float numero1, Float numero2){
        Float valorDivisao = numero1 / numero2;
        return valorDivisao.toString();
    }

    public Integer somandoValores(Integer valor1, Integer valor2){
        return valor1 + valor2;
    }

    public Double calculandoDescontoSalario(Double salario1, Double salario2){
        return salario1 - salario2;
    }

    public void verificandoIdade(Integer idade){
        if(idade >= 10 && idade < 12){
            System.out.println("Você poderá entrar e assistir filmes com seus pais de categorias até 12 anos");
        }else if(idade >= 12 && idade < 14 ) {
            System.out.println("Voce poderá entrar e assistir filmes com seus pais de categorias até 14 anos");
        }else if(idade >= 14 ){
            System.out.println("Você poderá entrar e assistir filmes com seus pais de categorias até 18 anos");
        }else{
            System.out.println("Você não possui idade para assistir filmes de categorias acima de 10 anos.");
        }
    }
}
