package br.com.POO.exception;

public class Conta {
    private Double saldo;

    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    public void sacar(Double valor){
        if(valor > this.saldo) throw new SaldoInsuficienteException();
        this.saldo-=valor;
    }
    
    public Double getSaldo(){
        return this.saldo;
     }
}