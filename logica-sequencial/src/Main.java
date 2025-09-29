import Operadores.Operadores;
import variaveis.Variaveis;

public class Main {
    public static void main(String[] args) {
        //Instanciando a classe sem a sua tipagem de classe somente pela variavel
        var variaveis = new Variaveis();
        //Atribuindo valores as variaveis da classe Variaveis
        variaveis.numeroLongo = 41321125890L; //Utilizando o "L" no final para declarar que é longo
        variaveis.numeroMedio = 8155555; //Utilizando o integer
        variaveis.valorDouble= 55.22; //Informando o ponto para double nunca utiliza a virgula
        variaveis.nomeCaractere = 'M'; //Aceita somente o caractere
        variaveis.condicaoBoolean = false; //Se verdadeiro ou falso

        System.out.println("CPF: " + variaveis.numeroLongo);
        System.out.println("Número de até 10 casas: " + variaveis.numeroMedio);
        System.out.println("Valor diaria: R$" + variaveis.valorDouble);
        System.out.println("Qual a sigla que representa o usuário: " + variaveis.nomeCaractere );
        System.out.println("Trabalha Atualmente: " + variaveis.verificaVerdadeiro(variaveis.condicaoBoolean));

        //Utilizando operadores
        var operador = new Operadores();
        operador.salario= 5500.93;
        operador.desconto= 50F;
        operador.diasTrabaho = 30;
        operador.horasMesExtra = 50;
        operador.porcentagemExtra= 55.60F;
        operador.horasTrabalhoDia = 10;

        System.out.println("Valor total horas extra: " + operador.calculaExtra(operador.horasTrabalhoDia, operador.horasMesExtra));
        System.out.println("Valor Diaria: " + operador.valorDiaTrabalhado(operador.diasTrabaho, operador.salario));
        System.out.println("Desconto: " + operador.salarioDesconto(operador.salario, operador.desconto));
    }
}
