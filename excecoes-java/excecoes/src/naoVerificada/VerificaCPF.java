package naoVerificada;

import excecaoPersonalizada.ConflictException;

import java.util.Scanner;

public class VerificaCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu cpf:\n");
        String verifica = verificaCPF(scanner.nextLine());
        System.out.println(verifica);


    }
    public static String verificaCPF (String cpf){
        try{
            if(cpf.equals("41321128890")){
                throw  new ConflictException("CPF já cadastrado: " + cpf);
            }else{
                return "CPF " + cpf + " cadastrado com sucesso!";
            }
            //Utilizando a ConflictException que é nossa excessao personalizada ao invés do RunTimeException
        } catch (ConflictException e) {
            throw new ConflictException("Cpf já cadastrado: " + cpf);
        }
    }
}
