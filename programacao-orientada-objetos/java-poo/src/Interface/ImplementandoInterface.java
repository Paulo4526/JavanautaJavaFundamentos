package Interface;

//Em interface ao implementa-la na nossa classe, obrigatóriamente devemos implementar seus metodos
public class ImplementandoInterface implements UtilizandoInterface{

    //Veja que aqui devemos colocar o modificador de acesso
    //A anotação overrride demonstra que a anotação vem de uma interface de implementação
    @Override
    public Integer somando(Integer valor1, Integer valor2){
        return valor1 + valor2;
    }

    @Override
    public Integer subtraindo(Integer valor1, Integer valor2) {
        return valor1 - valor2;
    }

}
