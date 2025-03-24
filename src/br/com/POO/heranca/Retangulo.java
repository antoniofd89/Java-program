package br.com.POO.heranca;

public class Retangulo extends FiguraGeometrica {
    private Integer altura;
    private Integer largura;
    
    public Retangulo(Integer altura, Integer largura) {
        this.altura = altura;
        this.largura = largura;
        this.tipo = "Retangulo";
    }
    
    public Integer getArea() {
        return (this.altura * this.largura);
    }
    
    public String toString() {
        return "{ altura: " + this.altura +  ", largura: " + this.largura + ", tipo: " + tipo +" }";
    }
}