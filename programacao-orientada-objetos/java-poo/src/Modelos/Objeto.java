package Modelos;

public class Objeto {
    public String nome;
    public Float metragem;
    public String cor;

    public void definicoesObjeto(){
        System.out.println("Nome do material: " + nome);
        System.out.println("Cor do material: " +  cor);
        System.out.println("Metragem do material: " + metragem + "M2");
    }
}
