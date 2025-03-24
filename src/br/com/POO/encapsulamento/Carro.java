package br.com.POO.encapsulamento;

public class Carro {
    private Motor motor;
    private String volante;
    private String pedais;
    private String airbag;


    public Carro(){
        this.motor = new Motor();
    }
    public void ligarCarro(){
        System.out.println("Ligando Carro");
    }

    public void acelerar(){
        motor.iniciar();
        System.out.println("acelerando..");
    }
    
    public void frear(){
        System.out.println("Frear..");
    }

    public void acionarAirbag(){

    }

    public void detectarColisao(){

    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getVolante() {
        return volante;
    }

    public void setVolante(String volante) {
        this.volante = volante;
    }

    public String getPedais() {
        return pedais;
    }

    public void setPedais(String pedais) {
        this.pedais = pedais;
    }

    public String getAirbag() {
        return airbag;
    }

    public void setAirbag(String airbag) {
        this.airbag = airbag;
    }
    
}