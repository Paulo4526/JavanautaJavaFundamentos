package Scanner;

import java.io.InputStream;
import java.util.Scanner;

public class UtilizandoScanner {
    public String nome;
    public String sobreNome;
    public Integer idade;
    public Long cpf;
    public Boolean trabalhando;

    public void getNomeSobrenome (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite abaixo seu nome:\n");
        nome = scanner.nextLine();
        System.out.println("Digite abaixo seu sobrenome:\n");
        sobreNome = scanner.nextLine();
        System.out.println("Está trabalhando?\n");
        trabalhando = ("sim".equalsIgnoreCase(scanner.nextLine()));
        System.out.println("Digite seu cpf:\n");
        cpf = scanner.nextLong();
        System.out.println("Digite sua idade:\n");
        idade = scanner.nextInt();
        System.out.println("Seja bem vindo! " + nome + " " + sobreNome);
        System.out.println("\nPortador do CPF: " + cpf);
        System.out.println("\nIdade: " + idade);
        System.out.println("Trabalhando? " + (trabalhando ? "Sim" : "Não"));
    }
}
