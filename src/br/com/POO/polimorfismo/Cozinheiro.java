package br.com.POO.polimorfismo;

public class Cozinheiro implements Trabalhador{
   
    public void trabalhar() {
       System.out.println("Faz comida");
    }
    public void temperarComida(){

    }
    @Override
    public String toString() {
        return "Cozinheiro";
    }

    
}
