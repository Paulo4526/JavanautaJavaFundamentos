package ternarios;

public class Ternario {
    public String verificaSeVerdadeiro(Double saldo, Double valorCompra){
        Boolean status = (saldo > valorCompra) ? true : false;
        if (status){
            return "Compra de R$" + valorCompra + " realizada com sucesso! \nSaldo: R$" + (saldo - valorCompra);
        }else{
            return "Saldo insuficiente para realizar a compra de R$" + valorCompra + "\nSaldo: R$" + saldo;
        }
    }
}
