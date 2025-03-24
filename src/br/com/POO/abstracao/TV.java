package br.com.POO.abstracao;

public class TV {
    private boolean ligada;
    private int volume;
    private int canal;

    public void ligarDesligar(){
        this.ligada = !this.ligada;
        System.out.println(" A TV está " +(ligada ? "ligada": "desligada") );
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para " + this.volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume diminuído para " + this.volume);
    }

    public void trocarCanal(int novoCanal){
        System.out.println("Canal: " + canal);
        canal = novoCanal;
        System.out.println("Novo Canal: " + canal);
        
    }
    
}