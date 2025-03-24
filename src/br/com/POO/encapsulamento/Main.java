package br.com.POO.encapsulamento;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setVolante("Rodar para esquerda"); 
        System.out.println(carro.getVolante());
    }
}