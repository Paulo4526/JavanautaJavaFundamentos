package Polimorfismo.Sobreescrita;

public class ExecutaSobreescrita {
    public static void main(String[] args) {
        //Metodo sendo estanciado pela classe pai
        Departamento departamento = new Departamento();
        departamento.empresaResponsavel();

        //Metodo sendo estanciado pela classe filho Funcionario
        Funcionario funcionario = new Funcionario();
        funcionario.empresaResponsavel();

        //Metodo sendo estanciado pela classe filho FrotaVeiculos
        FrotaVeiculos frotaVeiculos = new FrotaVeiculos();
        frotaVeiculos.empresaResponsavel();

        //Perceba que as classes filhas utilizando a anotacao Override, sobreescreve a do metodo pai fazendo com que seu metodo seja chamado normalmente, ou seja caso a classe filha seja estanciada e seja preciso utilizar seu metodo, com a anotacao override, a jvm automacitamente decide utilizar o metodo da classe a ser chamada.
        //Lembrando que a anotacao Override é utilizada para quando utilizarmos uma interface ou heranca forcando a jvm olhar para o metodo da classe estanciada nao para sua classe pai.

    }
}
