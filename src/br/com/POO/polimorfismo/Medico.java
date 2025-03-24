package br.com.POO.polimorfismo;

public class Medico implements Trabalhador {
    public void trabalhar() {
       System.out.println("Cuida de pacientes");
    }

    public String toString() {
        return "Medico";
    }
    
}
