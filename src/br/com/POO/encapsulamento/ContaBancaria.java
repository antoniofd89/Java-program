package br.com.POO.encapsulamento;
/*
 * O código apresenta uma classe em Java chamada ContaBancaria, 
 * que modela uma conta bancária com três atributos privados: numeroConta (do tipo Integer), 
 * saldo (do tipo Double), e titular (do tipo String).
 *  A classe possui um construtor 
 * que recebe valores para inicializar esses atributos durante a criação de uma instância.
 */
public class ContaBancaria {
    private Integer numeroConta;
    private Double saldo;
    private String titular;

    public ContaBancaria(Integer numeroConta, Double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(Double valor){
        this.saldo+= valor;
    }

    public void sacar(Double valor){
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.saldo-=valor;
    }

    public String toString() {
        return "ContaBancaria { numeroConta: " + numeroConta + 
         ", titular=" + titular + ", saldo: " + saldo +"}";
    }
    
}