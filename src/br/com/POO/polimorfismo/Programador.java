package br.com.POO.polimorfismo;

public class Programador extends Empregado implements Trabalhador {

    public String nome = "programador";
    public void trabalhar() {
       System.out.println("Desenvolve programas de computadores");
    }


    public String toString() {
        return "Programador";
    }
    
}
