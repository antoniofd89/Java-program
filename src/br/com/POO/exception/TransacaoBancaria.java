package br.com.POO.exception;

public class TransacaoBancaria {
    public static void main(String[] args) {
        Conta conta = new Conta(100.0);

        conta.sacar(50.0);
        try {
            conta.sacar(100.0);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Saldo Insuficiente");
            throw ex;
        }
        
    }
    
}