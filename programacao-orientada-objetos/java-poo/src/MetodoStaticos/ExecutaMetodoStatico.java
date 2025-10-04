package MetodoStaticos;

public class ExecutaMetodoStatico {
    public static void main(String[] args) {
        int valor1 = 450;
        int valor2 = 800;
        int valor = 450199;

        int somando = MetodoStatico.somandoValores(valor1, valor2);
        System.out.println("Somando valores: " + somando);

        String convertendo = MetodoStatico.converteIntegerToString(valor);
        System.out.println("Convertendo valor: " + convertendo);
    }
}
