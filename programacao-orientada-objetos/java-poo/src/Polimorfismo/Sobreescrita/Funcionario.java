package Polimorfismo.Sobreescrita;

public class Funcionario extends Departamento{
    //Caso os valores internos dos metodos retornem o mesmo terá um erro de compilacao.
    //Quando estanciarmos a nossa classe filha, com a anotacao Override, o metodo a ser executado será o que está na classe filha, pois nossa jvm percebe que essa classe está sendo chamada e decide utilizar o metodo dela
    @Override
    public void empresaResponsavel(){
        System.out.println("Metro Bahia");
    }
}
