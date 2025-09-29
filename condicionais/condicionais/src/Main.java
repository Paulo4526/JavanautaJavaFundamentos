import ifElse.Condicionais;
import operadores.Operadores;
import switchCase.SwitchCase;
import ternarios.Ternario;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Condicionais cond = new Condicionais();
        cond.numero1 = 10;
        cond.numero2 = 20;
        cond.valor1= "hospital";
        cond.valor2= "carro";

        //Verificações por expressões
        System.out.println("Inicio da verificação por expressão:\n");
        System.out.println("Verifica se maior ou igual: " +  (cond.numero1 >= cond.numero2));
        System.out.println("Verifica se menor ou igual: " + (cond.numero1 <= cond.numero2));
        System.out.println("Verifica se diferente: " + (cond.numero1 != cond.numero2));
        System.out.println("Verifica se igual: " + (cond.numero1 == cond.numero2));
        System.out.println("Verifica se menor ou igual com Strings: " + (cond.valor2.length() <= cond.valor2.length()));
        System.out.println("Verifica se maior ou igual com Strings: " + (cond.valor2.length() >= cond.valor2.length()));
        System.out.println("Verifica se diferente com Strings: " + (cond.valor2.length() != cond.valor2.length()));
        System.out.println("Verifica se igual com Strings: " + (cond.valor2.length() == cond.valor2.length()));
        System.out.println("Verifica se os tipos são iguais: " + (cond.valor2.getClass().getSimpleName() == cond.numero2.getClass().getSimpleName()));
        System.out.println("Verifica se os objetos são iguais: " + (Objects.equals(cond.valor2, cond.valor1)));
        System.out.println("\nFim da verificação por expressão");

        //Verificações via metodos
        System.out.println("Inicio com verificação por metodos:");
        System.out.println("Verifica se maior: " + cond.veficaSeMaior(cond.numero1, cond.numero2));
        System.out.println("Verifica se menor: " + cond.verificaSeMenor(cond.numero1, cond.numero2));
        System.out.println("Verifica se igual: " + cond.verificaSeIgual(cond.valor1, cond.numero1));
        System.out.println("Verifica se diferente: " + cond.verificaSeDiferente(cond.numero1, cond.numero2));
        System.out.println("Fim da verificação por metodos.");


        //Operadores lógicos
        Operadores oper = new Operadores();
        System.out.println("Verifica se maior 'Ou' menor que: " + oper.verificaSeMaiorOuMenor(10, 20));
        System.out.println("Verifica se maior 'E' diferente de: " + oper.verificaSeMaiorEdiferente("Paulo", 10));
        System.out.println("Nega o valor caso verdadeiro inverte para falso: " + oper.negaEntrada("Paulo", 20));


        //Operadores ternários
        Ternario ternario = new Ternario();
        System.out.println(ternario.verificaSeVerdadeiro(50.00, 60.00));

        //Switch e Case
        SwitchCase switchCase = new SwitchCase();
        System.out.println(switchCase.verificaIdade(8));
    }
}
