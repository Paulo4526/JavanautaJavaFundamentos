package Metodo;

public class Metodos {
    //Metodos de tipo public
    //Os metodos public podem ser acessador de qualquer outro lugar após o instanciamento da classe/objeto.
    //OBS: Os metodos aqui terão retorno void ainda não está sendo tratado metodos que retornam um tipo especifico.
    public void testandoMetodoPublic(){
        System.out.println("Metodo public");
    }
    //Metodos de tipo private
    //Os metodos private só podem ser acessados pela própria classe, assim como atributos privados, esse tipo está dentro do modelod e encapsulamento.
    private void testandoMetodosPrivate(){
        System.out.println("Metodo private");
    }
    //Abaixo criamos um metodo publico para acessar nosso metodo private
    public void retornaMetodoPrivate(){
        testandoMetodosPrivate();
    }
    //Metodos de tipo protect
    //Os metodos private só podem ser acessados dentro da mesma pasta caso estejam em outro package não é permitido o acesso.
    //OBS: Caso deseja estanciar a classe fora do package onde estão os metodos, o metodo protected não será mostrado, o metodo também poderá ser chamado dentro de um outro metodo public na classe.s
    protected void retornaMetodoProtected(){
        System.out.println("Metodo protected");
    }
}
